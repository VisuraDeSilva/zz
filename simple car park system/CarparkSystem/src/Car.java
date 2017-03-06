import java.util.Scanner;

public class Car extends Vehicle  {
	private static Scanner sc = new Scanner(System.in);
	 static int numberOfDoors;
	 static String color;
	 static String idPlate="";
	 static String brand="";
	 static String type="";
	 static String entryTime="";
		static String entryDate="";
		static int slotnumber;
	
	public void main(){
		idPlate = super.idPlate;
		brand = super.brand;
		type = super.type;
		entryTime = super.entryTime;
		entryDate = super.entryDate;
		slotnumber = super.slotnumber;
		System.out.println("Your Entered type was a Car provide this details for it!!");
		System.out.println("1. Number of doors");
		numberOfDoors = sc.nextInt();
		System.out.println("2. Color");
		color = sc.next();
		//System.out.println(idPlate+brand+type+numberOfDoors+color);
		
	}
	
	
	

}
