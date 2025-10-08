import java.util.Scanner;

public class KeputusanPergi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String hujan = scanner.nextLine().toLowerCase(); 

        String payung = scanner.nextLine().toLowerCase(); 
        
        String keputusan;

        if (hujan.equals("ya")) {
            if (payung.equals("ya")) {
                keputusan = "berangkat";
            } else {
                keputusan = "diam di rumah";
            }
        } else {
            keputusan = "berangkat";
        }
        
        scanner.close();

        System.out.println(keputusan);
    }
}