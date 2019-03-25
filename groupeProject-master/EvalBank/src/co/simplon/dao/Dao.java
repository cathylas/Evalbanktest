package co.simplon.dao;

import java.sql.Connection;

public abstract class Dao<T> {
	
public Connection connection = BankConnection.getConnection();
	
	/**
	 * Retake object by ID
	 * @param id
	 * @return T
	 */
	public abstract T find(int id);
	
	/**
	 * create an entry in a database
	 * by object reference
	 * @param obj
	 * @return boolean
	 */
	public abstract boolean create(T obj);
	
	/**
	 * update database 
	 * @param obj
	 * @return boolean
	 */
	public abstract boolean update(T obj);
	
	/**
	 * delete an entry in a database
	 * @param obj
	 * @return boolean
	 */
	public abstract boolean delete(T obj);

}
