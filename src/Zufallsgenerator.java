public class Zufallsgenerator {

	public static void main(String[] args) {
		
		boolean geschlecht = true;			//gibt geschlecht an
		byte alter = 2;					//gibt alter an
		String name = "Sophie";				//gibt Name an
		
		double randomValue = Math.random();
		System.out.println(randomValue);
		
		if(alter < 18)
		{
		System.out.println("Sie dürfen leider nicht teilnehmen ^^. Pech gehabt:)");  //wenn man nicht 18 ist, dann darfman nicht teilnehmen
		}
		else
		{
			System.out.println("Herzlich Willkommen " + name + "!");
			if(Math.random()<=0.42)
		{
			System.out.println("Sie haben leider verloren :(");
		}
		else
		{
			System.out.println("Glückwunsch! Sie haben gewonnen:)");
		}
		
		
		
	}
	}
	}
