import java.util.Scanner;

public class Main {

}public static void main(String[] args) {



    System.out.println("Enter an integer to calculate its factorial");
    Scanner in = new Scanner(System.in);

    int n=in.nextInt();


    float floatNumber = (float) n;
    int intPart = (int) floatNumber;
    System.out.println("Double Number: " + floatNumber);
    System.out.println("Integer Part: " + intPart);
    System.out.println("Decimal Part: " + (floatNumber - intPart));




}
