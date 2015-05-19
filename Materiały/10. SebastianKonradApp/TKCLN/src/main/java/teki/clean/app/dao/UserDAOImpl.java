package teki.clean.app.dao;

import java.util.List;

import teki.clean.app.model.User;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

public class UserDAOImpl implements UserDAO {
	private SessionFactory sessionFactory;

	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<User> list() {
		@SuppressWarnings("unchecked")
		List<User> listUser = (List<User>) sessionFactory.getCurrentSession()
				.createCriteria(User.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listUser;
	}
	
	@Override
	@Transactional
	public void saveOrUpdate(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}

	@Override
	@Transactional
	public void delete(int user_id) {
		User userToDelete = new User();
		userToDelete.setUser_id(user_id);
		sessionFactory.getCurrentSession().delete(userToDelete);
	}

	@Override
	@Transactional
	public User get(int user_id) {
		String hql = "from User where user_id= " + user_id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<User> listUser = (List<User>) query.list();
		
		if (listUser != null && !listUser.isEmpty()) {
			return listUser.get(0);
		}
		
		return null;
	}
	/* - Dokoñcz!
	@Override
	@Transactional
	public boolean logIn(String login, String password) {
		boolean state = false;
		return state;
	}
	
	@Override
	@Transactional
	public int getAuthLvl(){
		return -1;
	}
	
	@Override
	@Transactional
	public boolean checkPassword( String userPassword, String Password){
		return false;
	}*/

}
