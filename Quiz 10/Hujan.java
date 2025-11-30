import java.util.Scanner;
 public class Hujan{
     static void decision(String hujan, String payung) {
        if (hujan.equalsIgnoreCase("ya") && payung.equalsIgnoreCase("tidak")) {
            System.out.println("diam di rumah");
        } else {
            System.out.println("berangkat");
        }
    }

    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String hujan = sc.next();
    String payung = sc.next();
    decision(hujan, payung);
}
}