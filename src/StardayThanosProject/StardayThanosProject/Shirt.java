package StardayThanosProject.StardayThanosProject;

public class Shirt {
	
	public static String color;
	public static char size;
	
	Shirt(){}	// constructor make an object
	
	Shirt(String newColor, char newSize){
		color=newColor;
		size=newSize;
		
	}
	
	public static void putOn() {
		
		System.out.println("Shirt Is On");
	}
public static void takeOff() {
		
		System.out.println("Shirt Is Off");
	}
	public static void setColor(String newColor) {
		
		color=newColor;
	}
	public static void setSize(char newSize) {
		
		size=newSize;
	}

}
