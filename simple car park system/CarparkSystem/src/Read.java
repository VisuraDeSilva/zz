import java.io.*;
import java.util.*;

public class Read {
	
	
	public static void read(String idNumber, String date) throws IOException{
		
		FileReader in = new FileReader(idNumber+date+".txt");
	BufferedReader br = new BufferedReader(in);

	String strLine;

	//Read File Line By Line
	while ((strLine = br.readLine()) != null)   {
	  // Print the content on the console
	  System.out.print (strLine+"\t");
	 
	}
	System.out.println();

	//Close the input stream
	br.close();
	}
	
	
	
	
	public static void loadArr(String[] slots,String date) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader(date+".txt"));
		String str;

		List<String> list = new ArrayList<String>();
		while((str = in.readLine()) != null){
		    list.add(str);
		}

		slots = list.toArray(new String[0]);
		for (int x = 0; x < slots.length; x++) {
				System.out.println(slots[x]);
			}
		
		WestministerCarParkManager.mainMenu(slots);
	}
	
}
