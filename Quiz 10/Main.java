import java.util.Scanner;

public class Main {
    static void greaterThanLast(Scanner sc, int n) {
        /* I.S: Terdefinisi n dan n bilangan bulat.
           F.S: Menampilkan semua bilangan sebelum elemen terakhir yang lebih besar dari elemen terakhir. */
        
        int count = 1;     
        int last = n;      
        
        while (count < 10) {
            int x = sc.nextInt();
            if (x > last) {
            break;     
            }
            last = x;      
            count++;       
    }

    System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        greaterThanLast(sc, n);
    }
}