package com.Sql;

import java.util.List;

import com.DBconnection.ConvertResult;

/**
 * @author White kandrat
 * Класс been для вывода данных в JSP
 */
public class SQLselect {
	// Переменная для хранения ответа из базы
	private List<List<String>> listMind = null;
	private int listMindSize = 0;
	// Обьявление обьекта класса ConvertResult
	ConvertResult resultQuery = new ConvertResult();

	/**
	 * Конструктор класса
	 */
	public SQLselect() { 
		listMind = resultQuery.convertRStoArLst("SELECT * FROM test_table");
		listMindSize = listMind.size();
	}

	/**
	 * Метод get для переменной ListMind
	 * 
	 * @return the listMind
	 */
	public List<List<String>> getListMind() {
		return listMind;
	}

	/**
	 * @return listMaindSize
	 */
	public int getListMindSize() {
		return listMindSize;
	}

	/**
	 * Метод set для переменной ListMind
	 * 
	 * @param listMind
	 */
	public void setListMind(List<List<String>> listMind) {
		this.listMind = listMind;
	}

}
