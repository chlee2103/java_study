package explanation;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        /*
        3, 6, 9 박수게임
        3, 6, 9를 입력받고 3, 6, 9 가 포함되어 있으면
        해당 갯수만큼 "짝!"을 출력
        1-100까지
        */

        Scanner scn = new Scanner(System.in);
        System.out.println("3, 6, 9 박수게임");
        System.out.print("번호 입력 ::: ");
        int num = scn.nextInt();

        while (num <= 0 || num >= 101){
            System.out.println("1~100 까지 입력해주세요!");
            System.out.print("번호 입력 ::: ");
            num = scn.nextInt();
        }

        num %= 10;

        if(num == 3 || num == 6 || num == 9){
            System.out.println("짝!!");
        }else {
            System.out.println("입력숫자 ::: " + num);
        }
    }
}
