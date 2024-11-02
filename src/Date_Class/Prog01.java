package Date_Class;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prog01 {

	public static void main(String[] args) 
	{
		Date d=new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat fdf=new SimpleDateFormat("M/d/yyyy");
		System.out.println(fdf.format(d));
		
		SimpleDateFormat x=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(x.format(d));
	}

}
