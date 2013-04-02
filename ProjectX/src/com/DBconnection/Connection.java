package com.DBconnection;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

/**
 * @author White kandrat.
 * Класс передает строку с запросом в PoollConnectionDB
 */
public class Connection extends PoollConnectionDB {
	/**
	 *Include logger
	 */
	public static Logger logger = Logger.getLogger(Connection.class);

	/**
	 * @param querySQL
	 * @return rs
	 * Принимает строку с запросом. 
	 */
	public static ResultSet sqlQuery(String querySQL) {
		if (datasource == null) {
			PoollConnectionDB.initDBCP();
			logger.info("DataSource is null. DataBaseConnectionPool init");
		}
		try {
			connection = datasource.getConnection();
			logger.info("Create connection");

		} catch (SQLException e1) {
			logger.error("Error create connection " + e1.getMessage());
			e1.printStackTrace();
		}
		try {
			st = connection.createStatement();
			logger.info("Create Statment sucesfull");
		} catch (SQLException e) {

			logger.error("Create Statement error!");
		}
		try {
			rs = st.executeQuery(querySQL);
			logger.info("ResultSet execute SQL query");
		} catch (SQLException e) {
			logger.error("ExecuteQuery error!");
		}
		logger.info(rs);
		return rs;

	}
}
