public class Printf {
    /*
        %n : 줄바꿈
        %s : String 형식으로 출력
        %d : integer 형식으로 출력
        %f : float 형식으로 출력
        %t : date, time 형식으로 출력 / log 찍을 때 사용
        %o : 8진수 integer 형식으로 출력
        %x : 16진수 integer 형식으로 출력
        %b : boolean 형식으로 출력
        %e : 지수 형식으로 출력
        n s f t d : 자주 사용
     */
    public static void main(String[] args){
        // printf("출력문자열" , "%에 들어갈값");
        System.out.println("-----%d-----");
        System.out.printf("i have %d pen%n", 3);
        int i = 100;
        System.out.printf("i have %d pen%n", i);
        // 04 : 4자리의 수를 출력할 것이고, 남는 공간은 0으로 채운다.
        System.out.printf("i have %04d pen%n", i);
        //  4 : 4자리의 수를 출력할 것이고, 남는 공간은 공백으로 채운다.
        System.out.printf("i have %4d pen%n", i);
        // -4 : 4자리의 수를 출력할 것이고, 뒷쪽에 공백이 생긴다.
        System.out.printf("i have %-4d pen%n", i);

        System.out.printf("%-5d\n", 123);
        System.out.printf("%5d\n", 123);

        System.out.println("-----%f-----");
        float f = 5.1734f;
        // %.1f : 소수점을 자르고 반올림을 해준다.
        System.out.printf("%.2f%n", f);

        System.out.println("-----%s-----");
        String app = "apple";
        System.out.printf("[%8s]\n", app);
        System.out.printf("[%-8s]\n", app);

        System.out.printf("I have a %s%n", app);
        System.out.println("-----조합-----");
        System.out.printf("I have %d %s%n",i, app);
        System.out.printf("%2d * %2d = %2d%n",2,1,2);


    }
}
