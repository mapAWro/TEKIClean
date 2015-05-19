package teki.clean.app.dao;

import java.util.List;
import teki.clean.app.model.Opinion;

public interface OpinionDAO {
	public List<Opinion> list();
	public Opinion get(int opinion_id);
	public void saveOrUpdate(Opinion opinion);
	public void delete(int opinion_id);
}
