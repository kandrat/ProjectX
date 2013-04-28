package com.Sql;

import com.DBconnection.Update;

/**
 * @author White kandrat
 * Класс создания SQL запроса на запись в БД
 */
public class SQLupdate {
	/**
	 * @param text Mind
	 * @param autor Author
	 */
	
	@SuppressWarnings("static-access")
	public static void dbinsert(String text,String autor){
		Update in = new Update();
		in.sqlQuery("INSERT INTO test_table (id, text, autor) " +"VALUES(NULL, '"+text+"', '"+autor+"')");
		
	}

}
