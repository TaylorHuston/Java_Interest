/*
 * Simple program to calculate compund interest. 
 * Demonstrates a for loop.
 * From "Java How To Program, 10, Early Objects" - Chapter 5.
 */

public class Interest {

    public static void main(String[] args) {
        double amount = 0; //Ending annual amount
        double principal = 1000.0; //Initial amount
        double rate = 0.05; //Interest rate
        
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
        
        //Calculate for 10 years
        for (int year = 1; year < 11; year++) {
            amount = principal * Math.pow(1.0 + rate, year);
            System.out.printf("%4d%,20.2f%n", year, amount);
        }
    }//End main
    
}//End class Interest
