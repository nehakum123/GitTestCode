package resources;

import org.testng.annotations.DataProvider;

public class DataP {
	
		
	@DataProvider(name="testData")
	public static Object[][] dataFunction(){
		
		Object[][] data=new Object[2][12];		
				
		// row0		
		data[0][0]= "Boston";
		data[0][1]= "Berlin";
		data[0][2]= "Test Name1";
		data[0][3]= "Test Address";
		data[0][4]= "Bangalore";
		data[0][5]= "Boston";
		data[0][6]= "12345";
		data[0][7]= "Visa";
		data[0][8]= "1234567890";
		data[0][9]= "09";
		data[0][10]= "2023";
		data[0][11]= "Full Test Name1";
		
		// row1	
		data[1][0]= "Portland";
		data[1][1]= "London";
		data[1][2]= "Test Name2";
		data[1][3]= "Test Address";
		data[1][4]= "city";
		data[1][5]= "Portland";
		data[1][6]= "5679";
		data[1][7]= "American Express";
		data[1][8]= "1234567890";
		data[1][9]= "13";
		data[1][10]= "2023";
		data[1][11]= "Full Test Name2";		
						
		return data;
			
				
	}

	
	
}
