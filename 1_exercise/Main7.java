import java.io.IOException;
import java.util.Scanner;


public class Main7 {


    public static void main (String[] args) throws IOException {


       //chageing/parsing or  input number to integers.
       Scanner scan = new Scanner(System.in);
       System.out.println("Punch in a number:");
       String value1 = scan.nextLine();
       double d1 = Double.parseDouble(value1);

       System.out.println("Punch in another number:");
       String value2 = scan.nextLine();
       double d2 = Double.parseDouble(value2);

       System.out.println("The total of the two numbers is " + (d1+d2));

}

}
