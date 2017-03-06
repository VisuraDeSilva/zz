import java.io.IOException;
import java.util.*;

public class WestministerCarParkManager implements CarParkManager {
	private static Scanner sc = new Scanner(System.in);
	static String date = "";

	public static void main(String[] args) throws IOException {
		String slots[] = new String[21];
		for (int x = 0; x < slots.length; x++) {
			slots[x] = "Empty";
		}
		mainMenu(slots);
	}

	public static void mainMenu(String slots[]) throws IOException {
		Save.saveArr(slots, Vehicle.entryDate);
		System.out.println("---------------WestministerCarParkManager----------------");
		System.out.println("1.Add A Vehicle");
		System.out.println("2.Delete A Vehicle");
		System.out.println("3.Print the list of Vehicles currently parked");
		System.out.println("4.Print Statics,tic");
		System.out.println("5.List of the vehicle in specific date");
		System.out.println("6.Park charge");
		System.out.println("---------------------------------------------------------");
		String input = sc.next();
		switch (input) {
		case "1":
			addVehicle(slots);
			break;
		case "2":
			deleteVehicle(slots);
			break;
		case "3":
			listcurrentlyparked(slots);
			break;
		case "4":
			printStaticstic();
			break;
		case "5":
			Listinspecificdate(slots);
			break;
		case "6":
			parkcharge();
			break;
		default:
			System.out.println("Error Wrong input try again!!");
			mainMenu(slots);
			break;
		}

	}
	
	public static void addVehicle(String slots[]) throws IOException {
		freeSpace(slots);

		System.out.println("Select slot number from empty slots");
		int x = sc.nextInt();

		System.out.println("To add a vehicle enter following details correctly!!");
		System.out.println("1.Id plate number Ex-: xxx-xxxx");
		Vehicle.idPlate = sc.next();
		slots[x] = Vehicle.idPlate;
		Vehicle.slotnumber = x;

		System.out.println("2.Brand");
		Vehicle.brand = sc.next();

		System.out.println("3.Type");
		Vehicle.type = sc.next();

		System.out.println("4.Enter time");
		Vehicle.entryTime = sc.next();

		System.out.println("5.Enter date");
		Vehicle.entryDate = sc.next();
		if (Vehicle.type.toLowerCase().equals("car")) {
			Car objCar = new Car();
			objCar.main();
			Save.saveCar();
			mainMenu(slots);
		} else if (Vehicle.type.toLowerCase().equals("van")) {
			Van objVan = new Van();
			objVan.main();
			Save.saveVan();
			mainMenu(slots);
		} else if (Vehicle.type.toLowerCase().equals("bike")) {
			Motorbike objBike = new Motorbike();
			objBike.main();
			Save.saveBike();
			mainMenu(slots);
			
		} else {
			System.out.println("Invalied vehicle type cant park returning to menu");
			mainMenu(slots);
		}

		// System.out.println(Vehicle.idPlate+Vehicle.brand+Vehicle.type+Vehicle.entryTime+Vehicle.entryDate);

	}

	public static void deleteVehicle(String slot[]) {
		System.out.println("Select the vehicle slot you want to delete");
			int x = sc.nextInt();
			slot[x] = "Empty";
	}

	public static void listcurrentlyparked(String slots[]) throws IOException {
	System.out.println("Type date");
	String tdate = sc.next();
		String l = "";
		for (int x = 0; x < slots.length; x++) {
			if (slots[x].equals("Empty")) {
				System.out.println("slot number " + x + " is empty");
			} else {
				l = slots[x];
				Read.read(l, tdate);
			}
		}
		mainMenu(slots);

	}

	public static void printStaticstic() {

	}

	public static void Listinspecificdate(String []slots) throws IOException {
		System.out.println("Type date");
		String date = sc.next();
		Read.loadArr(slots, date);
	}

	public static void parkcharge() {

	}

	public static void freeSpace(String slots[]) {
		for (int x = 0; x < slots.length; x++) {
			if (slots[x].equals("Empty")) {
				System.out.println("slot number " + x + " is empty");
			}
		}
	}
	
	/*public static void listcurrentlyparkedtodate(String []slots) throws IOException{
		System.out.println("Type date");
		String date = sc.next();
		Read.loadArr(slots, date);
		/*String l = "";
		for (int x = 0; x < slots.length; x++) {
			if (slots[x].equals("Empty")) {
				System.out.println("slot number " + x + " is empty");
			} else {
				l = slots[x];
				Read.read(l, date);
			}
		}
		
	}*/
}
