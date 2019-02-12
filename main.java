package ua.lviv.iot.lab1;

public class main {

	public static void main(String[] args) {
			
		Bicycle bicycle1 = new Bicycle();
		Bicycle bicycle2 = new Bicycle("Aluminium", 15, 9, 10, 100, "Porsche", true, false);
		Bicycle bicycle3 = new Bicycle("Metal", 18, 10, 25, 300, "Dodge", true, true);	
		
		bicycle3.printnumberOfKilomiters();
		Bicycle.numberOfKilomiters();
		
		System.out.println(bicycle1.toString());
		System.out.println(bicycle2.toString());
		System.out.println(bicycle3.toString());
		

	}

}
