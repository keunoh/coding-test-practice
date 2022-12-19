package level0;

public class StringSorting {

    // 조건1. 매개변수 문자열이 주어지면 소문자로 변환하기
    // 조건2. 문자열을 알파벳 순서로 정렬한 뒤 return

    public String solution(String my_string) {
        String textToLow = my_string.toLowerCase();
        char[] textArr = textToLow.toCharArray();
        String answer = "";

        for (int i = 0; i < textArr.length; i++) {
            for (int j = 0; j < textArr.length - 1; j++) {
                if (textArr[j] > textArr[j + 1]) {
                    swap(textArr, j, j + 1);
                }
            }
        }

        for (char c : textArr) {
            answer += c;
        }

        return answer;
    }

    private static void swap(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        //테스트
        StringSorting stringSorting = new StringSorting();
        String text = stringSorting.solution("Python");
        System.out.println("text = " + text);
    }
}
