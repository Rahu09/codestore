package basic;
import java.util.Scanner;
public class harsh {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int numberOfRows, numberOfColumns, tempHolder = number * 2 - 1, numHolder = 1;

        for (numberOfRows = 1; numberOfRows <= tempHolder; numberOfRows++) {
            for (numberOfColumns = 1; numberOfColumns <= tempHolder; numberOfColumns++) {
                if (numberOfColumns == numberOfRows || numberOfColumns == tempHolder - numberOfRows + 1)
                    System.out.print(numHolder);
                System.out.print(" ");
            }
            System.out.println();
            numHolder = (numberOfRows <= tempHolder / 2) ? ++numHolder : --numHolder;
        }
    }
}