package StardayThanosProject.StardayThanosProject;

public class AddTwoSum {

	public static void main(String[] args) {
		String str="Hellow World";
		System.out.println(reverse(str));
	}
	
	public static String reverse(String str) {
		StringBuilder sb=new StringBuilder();
		
		for(int i=str.length()-1;i>=0;i--) {
		sb.append(str.charAt(i));
	}
	
	return sb.toString();
}
}