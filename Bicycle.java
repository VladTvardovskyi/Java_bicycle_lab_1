package ua.lviv.iot.lab1;

public class Bicycle {

	protected String kindOfMaterial;
	protected int sizeOfWheel;
	
	private int numberOfTransmission;
	private int weight;
	private int maxWeight;
	private String nameOfDeveloper;
	private boolean frontBrake;
	private boolean TrunkAvaibility;
	
	public static int numberOfKilomiters = 1000;
	

	public int getNumberOfTransmission() {
		return numberOfTransmission;
	}

	public void setNumberOfTransmission(int numberOfTransmission) {
		this.numberOfTransmission = numberOfTransmission;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	public String getNameOfDeveloper() {
		return nameOfDeveloper;
	}

	public void setNameOfDeveloper(String nameOfDeveloper) {
		this.nameOfDeveloper = nameOfDeveloper;
	}

	public boolean isFrontBrake() {
		return frontBrake;
	}

	public void setFrontBrake(boolean frontBrake) {
		this.frontBrake = frontBrake;
	}

	public boolean isTrunkAvaibility() {
		return TrunkAvaibility;
	}

	public void setTrunkAvaibility(boolean trunkAvaibility) {
		this.TrunkAvaibility = trunkAvaibility;
	}

	
	public Bicycle() {
	
	}

	
	public Bicycle(int numberOfTransmission, int weight, int maxWeight, String nameOfDeveloper, boolean frontBrake,
			boolean trunkAvaibility) {
		super();
		this.numberOfTransmission = numberOfTransmission;
		this.weight = weight;
		this.maxWeight = maxWeight;
		this.nameOfDeveloper = nameOfDeveloper;
		this.frontBrake = frontBrake;
		this.trunkAvaibility = trunkAvaibility;
	}
	
	

	public Bicycle(String kindOfMaterial, int sizeOfWheel, int numberOfTransmission, int weight, int maxWeight,
			String nameOfDeveloper, boolean frontBrake, boolean trunkAvaibility) {
		super();
		this.kindOfMaterial = kindOfMaterial;
		this.sizeOfWheel = sizeOfWheel;
		this.numberOfTransmission = numberOfTransmission;
		this.weight = weight;
		this.maxWeight = maxWeight;
		this.nameOfDeveloper = nameOfDeveloper;
		this.frontBrake = frontBrake;
		this.trunkAvaibility = trunkAvaibility;
	}


	
	public String toString() {
		return "Bicycle [kindOfMaterial=" + kindOfMaterial + ", sizeOfWheel=" + sizeOfWheel + ", numberOfTransmission="
				+ numberOfTransmission + ", weight=" + weight + ", maxWeight=" + maxWeight + ", nameOfDeveloper="
				+ nameOfDeveloper + ", frontBrake=" + frontBrake + ", TrunkAvaibility=" + TrunkAvaibility + "]";
	}
	
	public static void numberOfKilomiters()
	{
		System.out.println("number Of Kilometers:" + numberOfKilomiters + "\n");
	}
	
	public void  printnumberOfKilomiters()
	{
		System.out.println("number Of Kilometers:" + numberOfKilomiters + "\n");
	}

	public  void resetValues(String kindOfMaterial, int sizeOfWheel, int numberOfTransmission, int weight, int maxWeight,
			String nameOfDeveloper, boolean frontBrake, boolean trunkAvaibility) {
		
		this.kindOfMaterial = kindOfMaterial;
		this.sizeOfWheel = sizeOfWheel;
		this.numberOfTransmission = numberOfTransmission;
		this.weight = weight;
		this.maxWeight = maxWeight;
		this.nameOfDeveloper = nameOfDeveloper;
		this.frontBrake = frontBrake;
		this.TrunkAvaibility = trunkAvaibility;
	}
	




	
	
	
	
	
	
	
}
