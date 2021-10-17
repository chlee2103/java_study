import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        // 길이가 5인 정수형 배열
        int[] num1 = new int[5];
        System.out.println(Arrays.toString(num1));
        // 선언과 동시에 초기화
        int[] num2 = new int[]{1, 2, 3, 4, 5};
        int[] num3 = new int[] {1, 2, 3, 4, 5};

        String[] strArr = new String[7];
        System.out.println(Arrays.toString(strArr));
        String[] strArr2 = {"a", "b", "c", "d", "e"};
        System.out.println(strArr2[1]);

        strArr[0] = "월";
        strArr[1] = "화";
        strArr[2] = "수";
        strArr[3] = "목";
        strArr[4] = "금";
        strArr[5] = "토";
        strArr[6] = "일";

        System.out.println(Arrays.toString(strArr));
        System.out.println(strArr.length);

        boolean[] flag = new boolean[10];

        flag[0] = true;
        flag[2] = true;
        flag[4] = true;
        flag[6] = true;
        flag[8] = true;
        System.out.println(Arrays.toString(flag));

        String[] month = new String[12];
        for (int i=0; i< month.length; i++){
            month[i] = (i+1)+"월";
        }
        System.out.println(Arrays.toString(month));
    }
}
