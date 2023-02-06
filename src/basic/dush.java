package basic;

public class dush {
    public static void main(String[] args) {
        int X1 = 0, Y1 = 2;
        int X2 = 0, Y2 = 14;
        int X3 = 9, Y3 = 2;

        System.out.println(checkRightAngled(X1, Y1, X2, Y2, X3, Y3));
    }
    static int checkRightAngled(int X1, int Y1,
                                 int X2, int Y2,
                                 int X3, int Y3)
    {

        // Calculate the sides
        int A = (int)Math.pow((X2 - X1), 2) +
                (int)Math.pow((Y2 - Y1), 2);

        int B = (int)Math.pow((X3 - X2), 2) +
                (int)Math.pow((Y3 - Y2), 2);

        int C = (int)Math.pow((X3 - X1), 2) +
                (int)Math.pow((Y3 - Y1), 2);

        // Check Pythagoras Formula
        if ((A > 0 && B > 0 && C > 0) &&
                (A == (B + C) || B == (A + C) ||
                        C == (A + B)))
            return 1;
        else
            return 0;
    }
}
