package com.example.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) throws ParseException {
		// List<Map<Date,String>> list=new ArrayList<Map<Date,String>>();
		Map<Date, String> result = new LinkedHashMap<Date, String>();
		Map<Date, String> map = new LinkedHashMap<Date, String>();
		 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date start_date = sdf.parse("2017-01-01");
		Date end_date = sdf.parse("2017-01-22");

		Date date1 = sdf.parse("2017-01-02");
		Date date2 = sdf.parse("2017-01-04");
		Date date3 = sdf.parse("2017-01-08");

		map.put(date1, "2.0");
		map.put(date2, "3.0");
		map.put(date3, "4.0");
		int i = 0;
		List<Date> lDate = findDates(start_date, end_date);
		X: for (Date date : lDate) {
			for (Map.Entry<Date, String> entry : map.entrySet()) {
				if (entry.getKey().equals(date)) {
					result.put(date, entry.getValue());
					continue X;
				} else {
					result.put(date, "0");

				}

			}
		}

		for (Map.Entry<Date, String> entry : result.entrySet()) {
			System.out.println("key= " + entry.getKey() + " and value= "
					+ entry.getValue());
		}
		

	}

	/** 查找时间间隔中的日期 */
	public static List<Date> findDates(Date dBegin, Date dEnd) {
		List<Date> lDate = new ArrayList<Date>();
		lDate.add(dBegin);
		Calendar calBegin = Calendar.getInstance();
		calBegin.setTime(dBegin);
		Calendar calEnd = Calendar.getInstance();
		calEnd.setTime(dEnd);
		while (dEnd.after(calBegin.getTime())) {
			calBegin.add(Calendar.DAY_OF_MONTH, 1);
			lDate.add(calBegin.getTime());
		}
		return lDate;
	}
	
	/* 20170101转2017-01-01*/
	public static String transString(String s){
		StringBuffer stringBuffer=new StringBuffer("20170619");
		String result=stringBuffer.insert(4, "-").insert(7, "-").toString();
		System.out.println(result);
		return result;
	}
}
