package explanation;

import java.util.Scanner;

public class Number123 {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int num = scn.nextInt();
        String numStr = "";
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }

    }
}
