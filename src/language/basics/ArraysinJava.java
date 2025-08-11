package language.basics;

public class ArraysinJava {
	// Array: It is non primitive data types
	//within the array, we can store multiple values together of same data types
	// Array is the fixed size data structure.

	public static void main(String[] args) {
		String emp1name = "Uma Katakam";
		int emp1id = 123;
		
		String emp2name = "Sekhar katakam";
		int emp2id = 124;
		
		String emp3name = "Rutwik Katakam";
		int emp3id = 125;
		
		String emp4name = "Nainika Katakam";
		int emp4id = 126;
		
		// Array Declaration when we know all the values at the time of declaration
		String[] empNames = {"Uma Katakm","Sekhar Katakam","Rutwik katakam","Nainika Katakam"};
		int[] empIds = {123,124,125,126};
		
	     System.out.println("Employee 1 Name:" + empNames[0]);
	     System.out.println("Employee 1 Id:" + empIds[0]);

	     //Array Declaration when we know the size of the array but not the values
	     String[] empNames2 = new String[3];
	     int[] empIds2 = new int[3];
	     
	     // Assigning values to the array
	     empNames2[0] = "Uma Katakam";
	     empIds[0] = 123;
	     empNames2[1] = "Sekhar Katakam";
	     empIds[1] = 124;
	     empNames2[2] = "Rutwik Katakam";
	     empIds[2] = 125;
	     
	     System.out.println("Employee 2 Name:" + empNames[1]);
	     System.out.println("Employee 2 Id:" + empIds[1]);
		
	     
	     // 2D Array Declaration ==> Array of Arrays
	     String Project[][] = new String[3][4];
	     
	     // Assigning values to the 2D array. Project1
	     Project[0][0] = "Uma";
	     Project[0][1] = "rutwik";
	     Project[0][2] = "Nainika";
	     Project[0][3] = "Sekhar";
	     
	     //Project2
	     Project[1][0] = "Praveena";
	     Project[1][1] = "Venkat";
	     Project[1][2] = "Anusha";
	     Project[1][3] = "Sruthi";
	     
	     //Project 3
	     Project[2][0] = "Aish";
	     Project[2][1] = "MAhesh";
	     Project[2][2] = "Tarak";
	     Project[2][3] = "Prabhas";
	     
	     System.out.println("Project 1 Employee1 :" + Project[0][0]);

	     
	  // 3D Array Declaration
	        // 2 companies, each company has 3 projects, each project has 4 employees
	        String[][][] Companies = new String[2][3][4];

	        // Assigning values to the 3D array
	        
	        // Company 1 - Project 1
	        Companies[0][0][0] = "Uma";
	        Companies[0][0][1] = "Sekhar";
	        Companies[0][0][2] = "Rutwik";
	        Companies[0][0][3] = "Nainika";

	        // Company 1 - Project 2
	        Companies[0][1][0] = "John";
	        Companies[0][1][1] = "Hrithik";
	        Companies[0][1][2] = "Roshna";
	        Companies[0][1][3] = "Smith";

	        // Company 1 - Project 3
	        Companies[0][2][0] = "Aishwarya";
	        Companies[0][2][1] = "Rai";
	        Companies[0][2][2] = "Kareena";
	        Companies[0][2][3] = "Sonali";

	        // Company 2 - Project 4
	        Companies[1][0][0] = "Reed";
	        Companies[1][0][1] = "Frank";
	        Companies[1][0][2] = "Grace";
	        Companies[1][0][3] = "Hank";
	     
		     System.out.println("Company 1 Project 1 Employee1 :" + Companies[0][0][0] );

	     
	     
	     
	     
	     
	     
	     
	     
		
		

	}

}
