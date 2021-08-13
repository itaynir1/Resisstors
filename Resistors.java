import java.util.Scanner;
/*
*Author Itay Nir
The Resistors class use to print the total of three Resistors
 */
public class Resistors
{
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 integers:");
        System.out.println("Please enter r1:");
        int r1 = scan.nextInt();
        //Get the first resistor


        System.out.println("Please enter r2:");
        int r2 = scan.nextInt();
        //Gets the second resistor


        System.out.println("Please enter r3:");
        int r3 = scan.nextInt();
        //Gets the third resistor
        double resistance;
        resistance = 1.0 / (1.0 / r1 + 1.0 / r2 + 1.0 / r3); // Resistance calculation
        System.out.println("The total resistance of resistors " + r1 + ", " + r2 + ", and " + r3 + " connected in parallel is: " + resistance);


    } // end of method main
} //end of class Resistors
