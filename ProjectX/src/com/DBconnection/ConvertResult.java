package com.DBconnection;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * @author White kandrat
 * Транслятор результата, принимает на вход Sql запрос, а ответ записывается в ArrayList 
 */
public class ConvertResult extends Connection {

	static List<List<String>> resultTable = new ArrayList<List<String>>();
	/**
	 * Метод принимает Sql запрос, и ответ поподает ArrayList
	 * @param querySQL
	 * @return resultTable
	 */
	@SuppressWarnings("finally")
	public List<List<String>> convertRStoArLst(String querySQL) {
		resultTable = new ArrayList<List<String>>();
		try {
			Connection.sqlQuery(querySQL);
			try {
				while (rs.next()) {
					ArrayList<String> resultrecord = new ArrayList<String>();
					for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
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
			System.out.println(resultTable);
			return resultTable;
		}
	}
}
