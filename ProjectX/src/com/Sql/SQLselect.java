package com.Sql;

import java.util.List;

import com.DBconnection.ConvertResult;

/**
 * @author White kandrat
 * Класс been для вывода данных в JSP
 */
public class SQLselect {
	// Переменная для хранения ответа из базы
	private List<List<String>> listMaind;
	// Обьявление обьекта класса ConvertResult
	ConvertResult resultQuery = new ConvertResult();

	/**
	 * Конструктор класса
	 */
	public SQLselect() {

		listMaind = resultQuery.convertRStoArLst("SELECT * FROM test_table");
	}

	/**
	 * Метод get для переменной ListMind
	 * 
	 * @return the listMind
	 */
	public List<List<String>> getListMind() {
		return listMaind;
	}

	/**
	 * Метод set для переменной ListMind
	 * 
	 * @param listMaind
	 */
	public void setListMaind(List<List<String>> listMaind) {
		this.listMaind = listMaind;
	}

}
