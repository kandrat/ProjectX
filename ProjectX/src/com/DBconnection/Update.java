package com.DBconnection;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

/**
 * @author White kandrat
 * Класс записывает данные в БД
 */
public class Update extends PoollConnectionDB {
	/**
	 *Inc logger
	 */
	public static Logger logger = Logger.getLogger(Update.class);

	/**
	 * @param querySQL
	 * @return rs
	 */
	public static ResultSet sqlQuery(String querySQL) {
		if (datasource == null) {
			datasource = PoollConnectionDB.initDBCP();
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
			st.executeUpdate(querySQL);
			logger.info("ResultSet execute SQL query");
		} catch (SQLException e) {
			logger.error("ExecuteUpdate error!");
		}
		logger.info(rs);
		return rs;

	}
}
