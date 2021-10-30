package explanation;

public class Ex3 {
    public static void main(String[] args) {
        /*
        이중포문 : 중첩 for문 예시 1부터 5까지 출력되는 문장을 5출 출력하기
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
