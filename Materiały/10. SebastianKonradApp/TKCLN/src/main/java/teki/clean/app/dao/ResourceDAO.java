package teki.clean.app.dao;

import java.util.List;
import teki.clean.app.model.Resource;

public interface ResourceDAO {
	public List<Resource> list();
	public Resource get(int resource_id);
	public void saveOrUpdate(Resource resource);
	public void delete(int resource_id);
}
