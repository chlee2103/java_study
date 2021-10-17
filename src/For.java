import java.util.Arrays;

public class For {
    public static void main(String[] args) {
        // 1. for문으로 구구단 작성 (2~9)
        for(int i=2; i<9; i++){
            for (int j = 1; j < 9; j++) {
                System.out.println(i + "*" + j + "=" +(i*j));
            }
        }



        // 2. 배열을 반드시 사용, 1~12월을 담는 문자열 배열을 만들기
        // 2번 문제
        // 배열의 생성과 길이생성
        // 그리고 값을 넣은 배열을 for문 밖에서 출력하시오.
        String [] arr = new String[12];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i+1)+"월";
        }
        System.out.println(Arrays.toString(arr));

    }
}
