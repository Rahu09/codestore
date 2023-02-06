package pattern;

public class pattern1 {
    public static void main(String[] args) {
        pattern29(5);
    }
    public static void pattern28(int n){

        for (int row = 0; row < 2 * n; row++) {
            int col = row > n ? 2 * n - row: row;

            for (int i = 0; i < n-col; i++) {
                System.out.print(" ");
            }

            for (int i = 0; i < col; i++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    public static void pattern29(int n){

        for (int row = 0; row < 2 * n; row++) {
            int col = row > n ? 2 * n - row: row;


            for (int i = 0; i < col; i++) {
                System.out.print("* ");
            }
            for (int i = 0; i < n-col; i++) {
                System.out.print("    ");
            }
            for (int i = 0; i < col; i++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}
