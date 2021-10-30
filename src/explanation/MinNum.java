package explanation;

public class MinNum {
    public static void main(String[] args) {
        int [] aa = new int[] {10, 2, 3, 4, 5, 6, 7, 8,  9, 11};
        int len = aa.length;
        int min = 100;
        for(int i = 0; i < len; i++) {
            if(min > aa[i]){
                min = aa[i];
            }
        }
        System.out.println(min);
    }
}
