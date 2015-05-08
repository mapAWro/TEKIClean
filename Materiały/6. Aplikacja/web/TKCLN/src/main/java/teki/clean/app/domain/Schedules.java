package teki.clean.app.domain;

// Generated 2015-05-06 23:07:10 by Hibernate Tools 3.4.0.CR1

/**
 * Schedules generated by hbm2java
 */
public class Schedules implements java.io.Serializable {

	private Integer scheduleId;
	private Cleaners cleaners;
	private Integer day;
	private String timeRange;

	public Schedules() {
	}

	public Schedules(Cleaners cleaners) {
		this.cleaners = cleaners;
	}

	public Schedules(Cleaners cleaners, Integer day, String timeRange) {
		this.cleaners = cleaners;
		this.day = day;
		this.timeRange = timeRange;
	}

	public Integer getScheduleId() {
		return this.scheduleId;
	}

	public void setScheduleId(Integer scheduleId) {
		this.scheduleId = scheduleId;
	}

	public Cleaners getCleaners() {
		return this.cleaners;
	}

	public void setCleaners(Cleaners cleaners) {
		this.cleaners = cleaners;
	}

	public Integer getDay() {
		return this.day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public String getTimeRange() {
		return this.timeRange;
	}

	public void setTimeRange(String timeRange) {
		this.timeRange = timeRange;
	}

}
