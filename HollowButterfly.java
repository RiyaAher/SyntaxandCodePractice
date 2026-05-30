public class HollowButterfly {
    public static void main(String[] args) {
        int n = 5; // Size of the butterfly

        // Upper half of the butterfly - row
        for (int i = 1; i <= n; i++) {
            // Left wing - column
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            // Spaces between wings
            for (int j = 1; j <= 2 * (n - i); j++) { // 2 coz there are two wings so space *2
                System.out.print("  ");
            }
            // Right wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Lower half of the butterfly
        for (int i = n; i >= 1; i--) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            // Spaces between wings
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // Right wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}