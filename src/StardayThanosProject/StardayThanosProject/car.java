package StardayThanosProject.StardayThanosProject;

public class car {

	int maxSpeed = 100;
	int minSpeed = 0;
	double weight = 4079;
	boolean isTheCarOn = false;
	char condition = 'A';
	String nameOfCar = "Lucy";

	public void printVariable() {

		System.out.println("This is the maxSpeed " + maxSpeed);
		System.out.println(minSpeed);
		System.out.println(weight);
		System.out.println(isTheCarOn);
		System.out.println(condition);
		System.out.println(nameOfCar);
	}

	
	
	  
		
		  public void upgradeMinSpeed() {
		  
		  minSpeed=maxSpeed;
		  maxSpeed = maxSpeed +1;
		  
		  }
		 

	public static void main(String[] args) {

		car familyCar = new car();
		familyCar.printVariable();
		familyCar.upgradeMinSpeed();
		familyCar.printVariable();
		

	}

}
