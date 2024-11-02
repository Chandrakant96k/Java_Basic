package Calender_Demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class prog01 {

	public static void main(String[] args) 
	{
       Calendar ca= Calendar.getInstance();
       SimpleDateFormat sdf=new SimpleDateFormat();
       System.out.println(sdf.format(ca.getTime()));
       System.out.println(ca.get(Calendar.DAY_OF_MONTH));
       System.out.println(ca.get(Calendar.DAY_OF_WEEK));
       System.out.println(ca.get(Calendar.AM_PM));
	}

}
