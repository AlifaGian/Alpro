class Makanan {

    static int makanKarbo(int porsi, int kaloriPerPorsi) {
        return porsi * kaloriPerPorsi;
    }

    static int makanProtein(int porsi, int kaloriPerPorsi) {
        return porsi * kaloriPerPorsi;
    }

    static int makanCemilan(int jumlah, int kaloriPerItem) {
        return jumlah * kaloriPerItem;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int porsiKarbo = sc.nextInt();
        int kaloriKarbo = sc.nextInt();

        int porsiProtein = sc.nextInt();
        int kaloriProtein = sc.nextInt();

        int jumlahCemilan = sc.nextInt();
        int kaloriCemilan = sc.nextInt();

        int total = makanKarbo(porsiKarbo, kaloriKarbo)
                  + makanProtein(porsiProtein, kaloriProtein)
                  + makanCemilan(jumlahCemilan, kaloriCemilan);

        System.out.println(total);
    }
}
