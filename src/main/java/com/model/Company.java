package com.model;

import javax.persistence.Cacheable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Cacheable(true)
public class Company {
	
	@Id
	private int Cid;
	private String Cname;
	
	public Company() {
		super();
	}

	public Company(int cid, String cname) {
		super();
		Cid = cid;
		Cname = cname;
	}

	public int getCid() {
		return Cid;
	}

	public void setCid(int cid) {
		Cid = cid;
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	@Override
	public String toString() {
		return "Company [Cid=" + Cid + ", Cname=" + Cname + "]";
	}
	
	
	

}
