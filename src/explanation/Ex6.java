package explanation;

import java.util.Scanner;

public class Ex6 {
 //   월을 입력하면 그 해당월을 N월 1~N일을 출력
 public static void main(String[] args) {
     int [] arr =  {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

     Scanner scn = new Scanner(System.in);
     System.out.println("월을 입력(1~12) ::: ");
     int num = scn.nextInt();

     while (num <= 0 || num >= 13){
         System.out.println("월을 입력(1~12) ::: ");
         num = scn.nextInt();
     }

     for (int i = 1; i <= arr[num-1]; i++) {
         System.out.println(num+"월"+i+"일");
     }
 }
}
