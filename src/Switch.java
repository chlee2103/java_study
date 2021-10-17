import jdk.nashorn.internal.runtime.JSType;

import java.util.Scanner;

public class Switch {
    private static JSType BooleanUtils;

    public static void main(String[] args) {
        int month = 3;

        switch (month){
            case 1 :
                System.out.println("1"); break;
            case 2 :
                System.out.println("2"); break;
            case 3 :
                System.out.println("3"); break;
            default:
                System.out.println("없습니다.");
        }


        Scanner scn = new Scanner(System.in);
        System.out.print("1~10까지 입력해주세요");
        int a = scn.nextInt();

        while (a<=0 || a>10){
            System.out.print("1~10까지 입력해주세요");
            a = scn.nextInt();
        }
        // 모든 언어에서 true == 1, false == 0
        switch (a%2){
            case 1 :
                System.out.println("홀수"); break;
            case 0 :
                System.out.println("짝수"); break;
            default:
                System.out.println("땡!!!!!!!!!");
        }

        int booleanInt = BooleanUtils.toInteger(true);
        System.out.println(booleanInt);

        int b = 10;
        switch (10){
            case 1: case 2: case 3:
                System.out.println("1~3"); break;
            case 8: case 10:
                System.out.println("졸려"); break;
        }

        System.out.print("1~12를 입력");
        int season = scn.nextInt();
        while (season < 1 || season > 12){
            System.out.print("1~12를 입력");
            season = scn.nextInt();
        }

        switch(season){
            case 3: case 4: case 5:
                System.out.println("봄"); break;
            case 6: case 7: case 8:
                System.out.println("여름"); break;
            case 9: case 10: case 11:
                System.out.println("가을"); break;
            case 12: case 1: case 2:
                System.out.println("겨울"); break;
        }


    }
}
