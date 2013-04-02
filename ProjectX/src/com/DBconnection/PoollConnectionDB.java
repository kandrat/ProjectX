package com.DBconnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.log4j.Logger;

/**
 * @author White kandrat
 * This class Pool connection for DB
 *
 */
public class PoollConnectionDB {
	static Statement st = null;
	static Connection connection;
	static ResultSet rs = null;
	static DataSource datasource = null;
	/**
	 *Include logger
	 */
	public static Logger logger = Logger.getLogger(PoollConnectionDB.class);

	/**
	 * @return datasource
	 */
	public static DataSource initDBCP() {

		InitialContext initContext = null;
		try {
			initContext = new InitialContext();
		} catch (NamingException e1) {
			logger.error("Initial Context Error " + e1.getMessage());
		}

		try {
			datasource = (DataSource) initContext
					.lookup("java:comp/env/jdbc/TestProject");
		} catch (NamingException e1) {
			logger.error("Initial DataSource Error " + e1.getMessage());
		}

		logger.debug("DBCP init sucefull");
		return datasource;

	}

}
