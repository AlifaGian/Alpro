import java.util.Scanner;
public class kelvin{
 public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    int celsius = input.nextInt();
    double kelvin = celsius + 273.0;
    System.out.println(kelvin);
 }   
}