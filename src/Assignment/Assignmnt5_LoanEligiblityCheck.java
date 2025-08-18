package Assignment;

public class Assignmnt5_LoanEligiblityCheck {

	public static void main(String[] args) {
				        
		        // Given details
		        String customerName = "Uma Katakam";
		        int creditScore = 720;
		        double income = 55000.0;
		        boolean isEmployed = true;
		        double debtToIncomeRatio = 35.0;

		        // Loan decision
		       

		        if (creditScore > 750) {
					System.out.println("Loan Approved: Excellent credit score.");

		        } 
		        else if (creditScore >= 650 && creditScore <= 750) {
		            if (income >= 50000) {
		                if (isEmployed) {
		                    if (debtToIncomeRatio < 40.0) {
		                        System.out.println( "Approved");
		                    } else {
		                    	System.out.println("Denied (High Debt-to-Income Ratio)");
		                    }
		                } else {
		                	System.out.println ("Denied (Unemployed)");
		                }
		            } else {
		            	System.out.println ("Denied (Low Income)");
		            }
		        } 
		        else {
		        	System.out.println("Denied (Low Credit Score)");
		        }
		        System.out.println("Loan Approved for Customer is: " + customerName);
		        }

}
