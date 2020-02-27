package com.dao;

import com.Enum.WeekDays;

public class Model {
	
	private int id;
	private WeekDays day;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public WeekDays getDay() {
		return day;
	}



	public void setDay(WeekDays day) {
		this.day = day;
	}



	@Override
	public String toString() {
		return "Model [id=" + id + ", day=" + day + "]";
	}
	
	

}
