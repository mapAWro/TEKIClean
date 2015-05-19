package teki.clean.app.dao;

import java.util.List;
import teki.clean.app.model.Schedule;

public interface ScheduleDAO {
	public List<Schedule> list();
	public Schedule get(int schedule_id);
	public void saveOrUpdate(Schedule schedule);
	public void delete(int schedule_id);
}
