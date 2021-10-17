package explanation;

public class Star1 {
    public static void main(String[] args) {
        String star = "";
        for (int i = 0; i < 4; i++){
            star += "*";
            System.out.println(star);
        }

        for(int i = 0; i < 4; i++){
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
