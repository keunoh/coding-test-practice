package level0;

public class StringInString {
    // 조건1. 문자열 str1과 str2이 주어짐
    // 조건2. str1안에 str2가 있다면 1을 없다면 2를 return

    public static int solution(String str1, String str2) {
        int answer = 2;
        if (str1.contains(str2)) {
            answer = 1;
            return answer;
        }
        return answer;
    }

    //Test
    public static void main(String[] args) {
        String str1 = "abcdefg";
        String str2 = "bd";

        int solution = solution(str1, str2);
        System.out.println("solution = " + solution);
    }
}
