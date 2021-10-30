package explanation;

public class Ex4 {
    public static void main(String[] args) {
    //    0시 0분 부터 23시 59분까지 출력하기
        for (int i = 0; i <= 23 ; i++) {
            for (int j = 0; j <= 59 ; j++) {
                System.out.println(i+"시"+ j+"분");
            }
        }
    }
}
