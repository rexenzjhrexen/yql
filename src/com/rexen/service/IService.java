package com.rexen.service;

import java.util.List;

public interface IService<T> {
	/**
	 * insert object to database
	 * 
	 * @param model
	 */
	public void insert(T model);
	
	/**
	 * insert object to database batch
	 * 
	 * @param model
	 */
	public void insertBatch(List<T> models);
	
	
	/**
	 * read object from database
	 * 
	 * @param id
	 *            primary key(s) of the table
	 * @return object
	 */
	public T select(String id);
	
	/**
	 * read object from database
	 * 
	 * @param id
	 *            primary key(s) of the table
	 * @return object
	 */
	public T select(int id);
	

	/**
	 * update database
	 * 
	 * @param model
	 */
	public void update(T model);
	
	/**
	 * delete from database
	 * 
	 * @param id
	 *            primary key(s) of the table
	 */
	public void delete(String id);
	
	/**
	 * delete from database
	 * 
	 * @param id
	 *            primary key(s) of the table
	 */
	public void delete(int id);

}
