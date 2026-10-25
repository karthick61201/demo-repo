class pryramid newfix {
    public static void main(String args[]) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                if ((i == 1 && j >= 2 && j <= 9) ||
                    (i == 2 && j >= 3 && j <= 8) ||
                    (i == 3 && j >= 4 && j <= 7) ||
                    (i == 4 && j >= 5 && j <= 6) ||
                    (i == 6 && j >= 5 && j <= 6) ||
                    (i == 7 && j >= 4 && j <= 7) ||
                    (i == 8 && j >= 3 && j <= 8) ||
                    (i == 9 && j >= 2 && j <= 9)) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
