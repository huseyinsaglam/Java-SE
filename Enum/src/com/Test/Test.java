package com.Test;

import com.Enum.WeekDays;
import com.dao.Model;

public class Test {

	public static void main(String[] args) {
		
		Model model = new Model();
		model.setDay(WeekDays.Monday);
		
		System.out.println(model.getDay());

	}

}
