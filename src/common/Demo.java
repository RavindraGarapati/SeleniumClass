package common;

public class Demo {

	public static void main(String[] args)
	{
		
		String dateTime ="12/07/2014 2:00 PM";

		String date_dd_MM_yyyy[] = (dateTime.split(" ")[0]).split("/");
		
		for(String a : date_dd_MM_yyyy)
		{
			System.out.println(a);
		}

	}

}
