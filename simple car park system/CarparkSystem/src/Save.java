import java.io.*;

public class Save {
	public static void saveCar() {
		
		Car obj = new Car();

		try {
			String s = obj.entryDate;
            String stamp = obj.idPlate;
            File dir = new File("logs/" + s);
            dir.mkdirs();
            File permfile = new File(dir, stamp + ".txt");
            permfile.createNewFile();
			PrintWriter writer = new PrintWriter(obj.idPlate+obj.entryDate+".txt", "UTF-8");
			writer.println(Car.brand);
			writer.println(Car.type);
			writer.println(Car.color);
			writer.println(Car.numberOfDoors);
			writer.println(Car.entryDate);
			writer.println(Car.entryTime);
			writer.println(Car.slotnumber);
			writer.close();
		} catch (Exception e) {
			// do something
		}

	}
public static void saveVan() {
		
		Van obj = new Van();

		try {
			String s = obj.entryDate;
            String stamp = obj.idPlate;
            File dir = new File("logs/" + s);
            dir.mkdirs();
            File permfile = new File(dir, stamp + ".txt");
            permfile.createNewFile();
			PrintWriter writer = new PrintWriter(obj.idPlate+obj.entryDate+".txt", "UTF-8");
			writer.println(Van.brand);
			writer.println(Van.type);
			writer.println(Van.cargovolume);
			writer.println(Van.entryDate);
			writer.println(Van.entryTime);
			writer.println(Van.slotnumber);
			writer.close();
		} catch (Exception e) {
			// do something
		}

	}

public static void saveBike() {
	
	Motorbike obj = new Motorbike();

	try {
		String s = obj.entryDate;
        String stamp = obj.idPlate;
        File dir = new File("logs/" + s);
        dir.mkdirs();
        File permfile = new File(dir, stamp + ".txt");
        permfile.createNewFile();
		PrintWriter writer = new PrintWriter(obj.idPlate+obj.entryDate+".txt", "UTF-8");
		writer.println(Motorbike.brand);
		writer.println(Motorbike.type);
		writer.println(Motorbike.enginesize);
		writer.println(Motorbike.entryDate);
		writer.println(Motorbike.entryTime);
		writer.println(Motorbike.slotnumber);
		writer.close();
	} catch (Exception e) {
		// do something
	}

}
	public static void saveArr(String x[],String date) throws IOException{
		  BufferedWriter outputWriter = null;
		  outputWriter = new BufferedWriter(new FileWriter(date+".txt"));
		  for (int i = 0; i < x.length; i++) {
		    // Maybe:
		   // outputWriter.write(x[i]+"");
		    // Or:
		    outputWriter.write(x[i]);
		    outputWriter.newLine();
		  }
		  outputWriter.flush();  
		  outputWriter.close(); 
		  
		  
	}
	
	
}
