package TP3;
public class conditionalTracing {

    public static void main(String[] args) {
        // Inisialisasi Variabel
        int x = 10;
        int y = 5;
        int z = 15;
        int result = 0;

        // Blok Kondisi Pertama (Nested If)
        if (x > 5) {
            if (y < 10) {
                result = x + y; // result = 10 + 5 = 15
            } else {
                result = x - y;
            }
        }

        // Blok Kondisi Kedua (If-Else)
        if (z > 10 && x == 10) { // True && True -> True
            result += z; // result = 15 + 15 = 30
        } else {
            result = z - x;
        }

        // Blok Kondisi Ketiga (If-Else If-Else)
        if (x == 10 || y > 10) { // True || False -> True
            result += 5; // result = 30 + 5 = 35
        } else if (y == 5 && z > 10) {
            result -= 5;
        } else {
            result *= 2;
        }

        // Blok Kondisi Keempat (Negasi/NOT)
        // !(x < 15 && y < 10) -> !(True && True) -> !True -> False
        if (!(x < 15 && y < 10)) {
            result += 10;
        } else {
            result -= 10; // result = 35 - 10 = 25
        }

        // Output Akhir
        System.out.println("Nilai akhir result: " + result);
    }
}