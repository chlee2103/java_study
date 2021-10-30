package explanation;

public class Ex2 {
    public static void main(String[] args) {
        /*
        영희가 은행에 500원(원금)을 입금했다.
        하루에 1원씩 이자가 붙는다.
        5일 후(일수) 잔액은 얼마가 되어 있을까?
         */

        int money = 500;
        for (int i = 0; i < 5; i++) {
            money += 1;
        }
        System.out.println("money ::: " + money);
    }
}
