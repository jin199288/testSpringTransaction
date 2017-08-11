package com.transaction;

public class Service {
	private Dao dao;
	public void setDao(Dao dao) {
		this.dao = dao;
	}
	public void transfer(String out ,String in,double count){
		dao.DaoOut(out, count);
		dao.DaoIn(in, count);
	}
}
