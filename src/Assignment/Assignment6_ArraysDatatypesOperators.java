package Assignment;

public class Assignment6_ArraysDatatypesOperators {

	public static void main(String[] args) {
				        
		        // Step 1: Arrays for names and marks
		        String[] students = {"Suresh", "Mahesh", "Naresh"};
		        int[] marks = {75, 80, 82};
		        
		        // Step 2: Create another array for updated marks
		        int[] updatedMarks = new int[marks.length];
		        
		        int total = 0;
		        
		        // Step 3: Add 10 marks using assignment operator
		        for (int i = 0; i < marks.length; i++) {
		            updatedMarks[i] = marks[i];
		            updatedMarks[i] += 10;  // Assignment operator
		            total += updatedMarks[i];  // Keep sum for average
		        }
		        
		        // Step 4: Print Updated Marks
		        System.out.println("Updated Marks:");
		        for (int i = 0; i < students.length; i++) {
		            System.out.println(students[i] + ": " + updatedMarks[i]);
		        }
		        
		        // Step 5: Calculate and print Average
		        double average = (double) total / updatedMarks.length;
		        System.out.println("Average Marks: " + average);

	}

}
