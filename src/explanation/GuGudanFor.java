package explanation;

import java.util.Scanner;

public class GuGudanFor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("======= 구구단을 외자! =======");
        System.out.print("몇단부터 ? " );
        int s = scn.nextInt();
        while (! (s >=2 && s <= 9)){
            System.out.print("INPUT ERROR! 다시!! " );
            s = scn.nextInt();
        }

        System.out.print("몇단까지 ? " );
        int e = scn.nextInt();
        while (! (e >=2 && e <= 9)){
            System.out.print("INPUT ERROR! 다시!! " );
            e = scn.nextInt();
        }

       if(s > e){
            for(int i = s; i >= e; i--){
                for(int j = 1; j < 10; j++){
                    System.out.print(i + "*" + j + "=" + (i*j) +"   ");
                }
                System.out.println("");
            }
        }else if ( s == e) {
            for (int j = 1; j < 10; j++) {
                System.out.print(s + "*" + j + "=" + (s * j) + "   ");
            }
            System.out.println("");
        }else{
            for (int i = s; i <= e; i++) {
                for (int j = 1; j < 10; j++) {
                    System.out.print(i + "*" + j + "=" + (i * j) + "   ");
                }
                System.out.println("");
            }
        }

    }
}
