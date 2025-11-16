import java.util.Scanner;
public class Pass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String passBenar = "java123";
        String pass;

        do {
            System.out.print("Masukkan password: ");
            pass = input.nextLine();

            if (!pass.equals(passBenar)){
                System.out.println("Password salah!");
            }
        } while (!pass.equals(passBenar));
            System.out.println("Login berhasil!");
    } 
}