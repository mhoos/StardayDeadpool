package StardayThanosProject.StardayThanosProject;

public class StringReverse {

	public static void main(String[] args) {
		
		String str="Reverse";
		String holdChar="";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			holdChar=holdChar+str.charAt(i);
		}
	
		System.out.println(holdChar);
	
	}
}
