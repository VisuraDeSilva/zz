import java.util.Scanner;

public class Motorbike extends Vehicle {
	static Scanner sc = new Scanner(System.in);
	static String idPlate = "";
	static String brand = "";
	static String type = "";
	static String entryTime = "";
	static String entryDate = "";
	static int slotnumber;
	static String enginesize;
	public void main() {
		idPlate = super.idPlate;
		brand = super.brand;
		type = super.type;
		entryTime = super.entryTime;
		entryDate = super.entryDate;
		slotnumber = super.slotnumber;
		System.out.println("Your Entered type was a bike provide this details for it!!");
		System.out.println("1. Engine size");
		enginesize = sc.next();
		
	}

}
