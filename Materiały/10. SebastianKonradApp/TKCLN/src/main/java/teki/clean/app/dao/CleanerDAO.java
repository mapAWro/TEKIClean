package teki.clean.app.dao;

import java.util.List;
import teki.clean.app.model.Cleaner;

public interface CleanerDAO {
	public List<Cleaner> list();	
	public Cleaner get(int cleaner_id);	
	public void saveOrUpdate(Cleaner cleaner);	
	public void delete(int cleaner_id);
}
