import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
	     PhoneBuilder builder=new PhoneBuilder();
		 Phone phone1=builder.build()
							 .withOs("Android")
		 					 .withName("motorola")
							 .withProcessor("qualcomm 875+")
							 .withScreen(6.8f)
							 .withBattery(5500)
							 .withCamera(108)
							 .commit();
		
	 	System.out.println(phone1);
		 
		 			 
		 
	}
}


