package teki.clean.app.domain;

// Generated 2015-05-06 23:07:10 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Cleaners generated by hbm2java
 */
public class Cleaners implements java.io.Serializable {

	private Integer cleanerId;
	private Users users;
	private Set cleanerReses = new HashSet(0);
	private Set offerses = new HashSet(0);
	private Set opinionses = new HashSet(0);
	private Set scheduleses = new HashSet(0);

	public Cleaners() {
	}

	public Cleaners(Users users) {
		this.users = users;
	}

	public Cleaners(Users users, Set cleanerReses, Set offerses,
			Set opinionses, Set scheduleses) {
		this.users = users;
		this.cleanerReses = cleanerReses;
		this.offerses = offerses;
		this.opinionses = opinionses;
		this.scheduleses = scheduleses;
	}

	public Integer getCleanerId() {
		return this.cleanerId;
	}

	public void setCleanerId(Integer cleanerId) {
		this.cleanerId = cleanerId;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Set getCleanerReses() {
		return this.cleanerReses;
	}

	public void setCleanerReses(Set cleanerReses) {
		this.cleanerReses = cleanerReses;
	}

	public Set getOfferses() {
		return this.offerses;
	}

	public void setOfferses(Set offerses) {
		this.offerses = offerses;
	}

	public Set getOpinionses() {
		return this.opinionses;
	}

	public void setOpinionses(Set opinionses) {
		this.opinionses = opinionses;
	}

	public Set getScheduleses() {
		return this.scheduleses;
	}

	public void setScheduleses(Set scheduleses) {
		this.scheduleses = scheduleses;
	}

}
