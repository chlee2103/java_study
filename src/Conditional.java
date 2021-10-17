import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        if(true){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        if (true){
            System.out.println(1+""+true);
        }else if(true){
            System.out.println(2+""+true);
        }else{
            System.out.println(3+""+true);
        }

        int numberA = 50;

        Scanner scn = new Scanner(System.in);
        System.out.print("numberB를 입력 : ");
        int numberB = scn.nextInt();

        if(numberB > numberA){
            System.out.println(numberB + "은 numberA("+numberA+")보다 크다");
        }else if(numberB == numberA){
            System.out.println(numberB + "은 numberA("+numberA+")와 같다");
        }else{
            System.out.println(numberB + "은 numberA("+numberA+")보다 작다");
        }
//        scn.close();

        Scanner scn1 = new Scanner(System.in);
        System.out.print("단어를 입력 : ");
        // next() : 단어 하나 (스페이스바을 기준으로 앞 문자열을 가져온다.)
        String word = scn1.next();
        if(word == null || word.equals("")){
            System.out.println(word + "는 비어 있습니다.");
        }else{
            System.out.println(">>> " + word);
        }
        // Scanner : 재사용 불가
        Scanner scn2 = new Scanner(System.in);
        System.out.print("한줄을 입력 : ");
        String word2 = scn2.nextLine();
        System.out.println(">>> " + word2);

    }
}
