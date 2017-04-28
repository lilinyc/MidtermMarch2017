package math;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */
		int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};

		ConnectDB connectDB = new ConnectDB();

		List<String> lowestValues = new ArrayList<String>();
		try {
			connectDB.deleteDataFromTable("tbl_lowestNumber");
			connectDB.InsertDataFromArryToMySql(array, "tbl_lowestNumber", "column_lowestNumber");
			lowestValues = connectDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
		System.out.println(lowestValues.toString());
		Integer lowestNumber = null;
		for(String st:lowestValues){
			Integer number = Integer.parseInt(st);
			if(lowestNumber==null){
				lowestNumber = number;
			}else{
				if(number<lowestNumber){
					lowestNumber = number;
				}
			}
		}

		System.out.println("Lowest number is: " + lowestNumber);
	}

}
