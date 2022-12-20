package level0;

public class AddDigit {
    // 조건1. 정수 n이 매개변수로 주어진다.
    // 조건2. n의 각 자리 숫자의 합을 return

    public static int solution(int n) {
        int answer = 0;

        while ((n / 10) > 0) {
            answer += (n % 10);
            n = (n - (n % 10)) / 10;

            if((n / 10) == 0) {
                answer += n;
                break;
            }
        }

        return answer;
    }

    //Test
    public static void main(String[] args) {
        int solution = solution(930211);
        System.out.println("solution = " + solution);
    }
}
