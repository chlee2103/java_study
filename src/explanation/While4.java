package explanation;

import java.util.Scanner;

// n, m을 입력받고 n은 입력받고 n은 단수를 나타네고 m은 i를 나타낸다.
// n 입력값은 2~ 100 사이의 숫자
// m 입력값은 1~ 100 사이의 숫자
public class While4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("단수를 입력해주세요(2~100) : ");
        int n = scn.nextInt();
        while (n < 2 || n > 100){
            System.out.print("단수를 입력해주세요(2~100) : ");
            n = scn.nextInt();
        }

        System.out.print("곱수를 입력해주세요(1~100) : ");
        int m = scn.nextInt();
        while (m < 1 || m > 100){
            System.out.print("단수를 입력해주세요(1~100) : ");
            m = scn.nextInt();
        }
        int i = 1;
        while (true){
            System.out.println(n + "*" + i + "=" + (n*i));
            if(i == m) break;
            i++;
        }
    }
}
