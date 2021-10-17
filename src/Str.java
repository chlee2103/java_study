import java.util.Arrays;
import java.util.Locale;

public class Str {
    public static void main(String[] args) {
        String s = "이초희이엄지가 짱이당";

        // 문자열의 index번호 리턴
        System.out.println(s.indexOf('이'));
        // 마스킹처리시 사용한다 - 아이디:rhdqnx -> rhd**
        // 특정문자열만 replace 변경
        System.out.println(s.replace("이",""));
        // regex : repace + 정규식 패턴도 변경
        System.out.println(s.replaceAll("이", "김"));

        // substring
        // 시작인덱스만 작성할 경우 처음부터 끝까지
        System.out.println(s.substring(0));
        // 시작인덱스는 포함하고 마지막 인덱스(-1)는 포함하지 않는다.
        System.out.println(s.substring(1,6));

        String e = "aBcDeFg";
        // DB에 대문자로 넣는 경우 : 아이디, 이메일, 카드이름
        System.out.println(e.toUpperCase());
        // 소문자로 넣는 경우 : 사용자가 실수(아이디에 대문자 섞을경우) 했을 경우
        System.out.println(e.toLowerCase());

        // 문자열 연결 : DB에선 concat을 많이 사용함.
        // concat(carCompy, carModel, '(', carYear, ')') -> 현대코나(2021)
        System.out.println(e.concat("ㅎㅎ"));

        String java = "java study";
        String hate = "싫어요";

        String[] str = java.split(" ");
        String str1 = java.substring(0,5);
        String str2 = str1.concat(hate+"...");

        System.out.println(str2);

        // startsWith() : return값 boolean
        // 파라미터로 시작하는지를 묻는다. 대소문자를 구분한다.
        // startsWith()는 시작index 지정가능.
        // 파일 확자장명 검색시, 주문번호의 앞의 prefix가 맞는지
        System.out.println(java.startsWith("jav"));
        System.out.println(java.startsWith("st", 5));

        // endsWith() : 파라미터가 마지막에 위치한지 묻는다.
        // index 지정불가
        System.out.println(java.endsWith("study"));

        String filePath = "c:\\update.png";
        // 확장자명 : extention
        // split() : .으로 자를 순 없다. 자르고 싶을 경우 (이스케이프 2개 사용)
        String [] arr = filePath.split("\\.");
        String newName = "delete.".concat(arr[1]); // delete.png
        // Arrays.toString() : 배열에 있는 값을 확인
        System.out.println(Arrays.toString(arr)); // [c:update, png]

        // 마지막 #은 내용이 없기 때문에 버려진다.
        String test = "insert#select#update#delete#";
        String [] arr2 = test.split("#");
        System.out.println(Arrays.toString(arr2));

        String phoneNumber = "010-3881-1393";
        // "010-***1-1393"
        String [] phone = phoneNumber.split("-");
        phone[1] = phone[1].replace(phone[1].substring(0,3), "***");
        phoneNumber = phone[0].concat("-"+phone[1]+"-"+phone[2]);
        System.out.println(phoneNumber);

        // 쌤코드
        String [] numbers = phoneNumber.split("-");
        numbers[1] = "***".concat(numbers[1].substring(3));
        // String.join() : 배열이나 문자열 index 사이에 넣을 값지정
        System.out.println("Join 예제 : " + String.join("-", numbers));

        String trimEx = " rhdqnx ";
        String compareWord = "rhdqnx";
        // compareTo() : 문자열 비교시 사용.
        // 돈, 날짜를 계산할 때 사용
        // 일치하면 0을 ascii로 return, 일치하지 않으면 -의 값을 ascii로 return
        System.out.println(trimEx.compareTo(compareWord));
        // trim() : 앞뒤 공백을 제거
        trimEx = trimEx.trim();
        System.out.println(trimEx.compareTo(compareWord));
        System.out.println(trimEx);
        // ascii 클결우 : 1, 같으면 : 0, 작으면 : -1
        // 대소비교가 가능할 경우 제대로 리턴한다.
        System.out.println("2017".compareTo("2019"));

        // contains() : 문자열 포함여부 확인. boolean으로 return
        String apple = "apple pen";
        System.out.println(apple.contains("apple"));

        // charAt() : char를 return한다.
        // index로 다 짜른다.
        System.out.println(apple.charAt(2));

    }
}
