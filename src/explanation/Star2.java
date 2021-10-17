package explanation;

public class Star2 {
    public static void main(String[] args) {
        String star = "";
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i-1; j++) {
                System.out.print(" ");
            }
            star += "*";
            System.out.println(star);
        }

        String s = "";
        int n = 5;
        for(int i = n; i >= 1; i--){
            System.out.printf("%" + n + "s\n", s+= "*");
        }

    }
}
