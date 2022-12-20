package level0;

public class SquareNumber {
    // 조건1. n이 제곱수라면 1을 아니라면 2를 return

    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n; i++) {
            if ((i * i) == n) {
                answer = 1;
                return answer;
            } else {
                answer = 2;
            }
        }
        return answer;
    }

    //Test
    public static void main(String[] args) {
        int solution = solution(145);
        System.out.println("solution = " + solution);

        int solution1 = solution(976);
        System.out.println("solution1 = " + solution1);
    }
}
