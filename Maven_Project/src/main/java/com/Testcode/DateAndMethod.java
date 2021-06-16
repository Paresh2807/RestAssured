package com.Testcode;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import freemarker.template.SimpleDate;

public class DateAndMethod {
	
	public static void   converDateFormat_mmddyyHHMMSAMPMP_To_YYYYMMDDHHMMSS(String inputDate) {
		
		SimpleDateFormat date1 = new SimpleDateFormat("MM/dd/YYYY HH:MM:SS ");
		SimpleDateFormat date = new SimpleDateFormat("MM/dd/YYYY HH:MM:SS ");
		String formatDate = null;
		try {
			
			formatDate = date.format(date.parse(inputDate)).replace("/", "-");
		}catch (ParseException e) {
			// TODO: handle exception
		}
		
		System.out.println(formatDate);
	}

	public static void main(String [] args) {
		converDateFormat_mmddyyHHMMSAMPMP_To_YYYYMMDDHHMMSS("03/15/2021 3:39:10 AM");
		
	}
}
