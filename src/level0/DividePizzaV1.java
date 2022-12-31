package level0;

public class DividePizzaV1 {

    public int solution(int n) {
        int pizza = 1;
        int piecesOfPizza = 7;

        for (int i = 0; i < 100; i++) {
            if ((piecesOfPizza / n) == 0) {
                pizza += 1;
                piecesOfPizza = pizza * 7;
                continue;
            } else if ((piecesOfPizza / n) == 0 && (piecesOfPizza % n >= 0)) {
                break;
            }
        }

        return pizza;
    }
}
