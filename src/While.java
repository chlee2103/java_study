import java.sql.SQLOutput;

public class While {
    public static void main(String[] args) {
/*        while(true){
            // 항상 빠져나가는 구문이나 조건을 종료하는 구문

            //    continue; 현 다시 위치에서 다시 루프로 되돌아가는
            //    break;    구문을 즉시 종료
        }*/

        // 구구단 2단
        int dan = 2;
        int a = 1;

        while (true){
            System.out.print(dan + "*" + a + "=" + (dan * a)+"\t");
            a++;
            if(a > 9){
                break;
            }
        }

            dan = 2;
            a = 1;

            while (dan<=9) {
                while (a <= 9) {
                    System.out.print(dan + "*" + a + "=" + (dan * a)+"\t");
                    a++;
                }
            System.out.println("");
            dan++;
            a = 1;
            }



    }
}
