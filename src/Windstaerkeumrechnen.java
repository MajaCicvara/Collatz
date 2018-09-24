import java.util.Scanner;

public class Windstaerkeumrechnen {

	static double kmh = 50;
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);	
	System.out.println(goKnots(kmh));
	System.out.println(goBeaufort(kmh));
	System.out.println(goWindtyp(kmh));
	}
	
	public static double goKnots(double kmh)
	{
		double knot = kmh *0.53995680345572;
		return knot;
	}
	public static double goBeaufort(double kmh)
	{
		double x = kmh/3.6;
		double y = x/0.836;
		double beaufort = Math.pow(y, 0.6);
		return beaufort;
	}
	public static String goWindtyp(double kmh)
	{
		if(kmh<2)
		{
			return "Windstill";
		}
		else
		{
		if(kmh>100)
		{
			return "Orkan";
		}
		return "Normalwind";
		}
	}
}