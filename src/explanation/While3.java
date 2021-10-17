package explanation;

// 3 -> 0 ~ 10까지 루프를 도는데 홀수면 홀수라고 출력하고 짝수면 출력하지 마세요.
// 반드시 컨티뉴
public class While3 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10){
            i++;
            if(i%2 == 0) continue;
            System.out.println(i + "홀수");
        }
    }
}
