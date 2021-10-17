package explanation;

public class Star3 {
    public static void main(String[] args) {
        String star = "";
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i-1; j++) {
                System.out.print(" ");
            }
            star += "**";
            System.out.println(star);
        }
    }
}
