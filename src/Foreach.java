public class Foreach {
    public static void main(String[] args) {
        String [] names = new String[] {"이초희", "김경진", "김소진"};
        String [] arr = new String[] {"1", "2", "3", "4", "5"};
        int len = names.length;
        for(int i = 0; i < len; i++){
            System.out.println(names[i]);
        }

        for(String name : names){
            System.out.println(name);
        }

        int [] number = {1,2,3,4,5};
        for(int n : number) System.out.println(n);

        String [] str = {"0","1", "2", "3", "4"};
        len = str.length-1;
        // 5 <= 0 - false

        if(5 <= 0){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        for (int i = len; i >= 0; i--) {
            System.out.println(str[i]);
        }

        String a = "5"+4+1;
        System.out.println("a:::"+a);
        String b = 2+3+"5";
        System.out.println("b:::"+b);
    }
}
