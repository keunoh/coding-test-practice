public class Main {

    //어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라 한다.
    // 조건1. n이 매개변수이고, n이 제곱수라면 1을 아니라면 2를 return

    /**
     * for문 돌려가지고 일정 범위까지만 제곱시켜서 해당 값이 나오는지 확인하면
     * 될거 같은디
     */
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

    public static void main(String[] args) {
        int solution = solution(145);
        System.out.println("solution = " + solution);
    }
}