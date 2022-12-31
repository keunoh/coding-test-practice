package level0;

public class DividePizzaV2 {

    public int solution(int n) {
        int pizza = 1;
        int totalPieceOfPizza = pizza * 6;

        //6의 배수를 n으로 나눴을 때 나머지가 0인 최소 값 구하기
        for (int i = 0; i < 100; i++) {
            if ((totalPieceOfPizza / n) != 0 && (totalPieceOfPizza % n) == 0) {
                break;
            } else {
                pizza++;
                totalPieceOfPizza = pizza * 6;
            }
        }
        return pizza;
    }
}
