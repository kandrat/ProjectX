package com.DBconnection;


import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.log4j.Logger;

/**
 * @author White kandrat
 * ���������� ����������, ��������� �� ���� Sql ������, � ����� ������������ � ArrayList 
 */
public class ConvertResult extends Connection {
	/**
	 *Include logger
	 */
	public static Logger logger = Logger.getLogger(ConvertResult.class);
	static ArrayList<ArrayList<String>> resultTable = new ArrayList<ArrayList<String>>();
	/**
	 * ����� ��������� Sql ������, � ����� �������� ArrayList
	 * @param querySQL
	 * @return resultTable
	 */
	@SuppressWarnings("finally")
	public ArrayList<ArrayList<String>> convertRStoArLst(String querySQL) {

		try {
			Connection.sqlQuery(querySQL);
			logger.info("Number RS colum:" + rs.getMetaData().getColumnCount());
			try {
				while (rs.next()) {
					ArrayList<String> resultrecord = new ArrayList<String>();
					for (int i = 1; i < rs.getMetaData().getColumnCount(); i++) {
						resultrecord.add(rs.getString(i));
					}
					resultTable.add(resultrecord);
				}
			} catch (Exception e) {
				logger.error(e.getMessage());
			}
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				logger.error("Error in close resuorce!");
			}
			logger.info(resultTable);
			return resultTable;
		}
	}
}