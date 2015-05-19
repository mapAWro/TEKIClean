package teki.clean.app.dao;

import java.util.List;
import teki.clean.app.model.Cleaner_res;

public interface Cleaner_resDAO {
	public List<Cleaner_res> list();	
	public Cleaner_res get(int cleaner_res_id);	
	public void saveOrUpdate(Cleaner_res cleaner_res);	
	public void delete(int cleaner_res_id);
}
