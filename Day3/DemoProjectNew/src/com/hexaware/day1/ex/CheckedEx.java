package com.hexaware.day1.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckedEx {
	
	public void show(String str) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(str);
		System.out.println(date);
	}
	public static void main(String[] args) {
		String strDate = "2026-03-24";
		CheckedEx obj = new CheckedEx();
		try {
			obj.show(strDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
