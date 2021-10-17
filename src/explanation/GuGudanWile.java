package explanation;

import java.util.Scanner;

public class GuGudanWile {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("시작단 입력해주세요(2~9)");
        int start = scn.nextInt();

        System.out.print("끝단 입력해주세요(2~9)");
        int end = scn.nextInt();


        while (start > end){
            System.out.println("시작단은 끝단보다 작으면 안돼요");
            System.out.print("시작단 입력해주세요(2~9)");
            start = scn.nextInt();

            System.out.print("끝단 입력해주세요(2~9)");
            end = scn.nextInt();
        }

        int a = 1;
        while (start <= end){
            while (a < 10){
                System.out.printf("%d * %d = %d\t", start, a, (start*a));
                a++;
            }
            System.out.println("");
            start++;
            a=1;
        }

    }
}
