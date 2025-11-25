class ANJING {

    static boolean segitigaSah(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0 &&
               a + b > c && a + c > b && b + c > a;
    }

    static boolean segitigaSamaSisi(double a, double b, double c) {
        return segitigaSah(a, b, c) && a == b && b == c;
    }

    static boolean segitigaSamaKaki(double a, double b, double c) {
    return segitigaSah(a, b, c)
        && !segitigaSamaSisi(a, b, c)
        && (a == b || a == c || b == c);
    }

    static boolean segitigaSikuSiku(double a, double b, double c) {
        if (!segitigaSah(a, b, c)) return false;
        double A = a*a, B = b*b, C = c*c;
        return A + B == C || A + C == B || B + C == A;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println("Segitiga sama sisi: " + segitigaSamaSisi(a, b, c));
        System.out.println("Segitiga sama kaki: " + segitigaSamaKaki(a, b, c));
        System.out.println("Segitiga siku-siku: " + segitigaSikuSiku(a, b, c));
    }
}
