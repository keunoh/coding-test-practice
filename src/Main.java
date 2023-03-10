
public class Main {

    //1. 피자를 여섯 조각으로 잘라 준다.
    //2. 피자를 나눠먹을 사람 n명이 주어진다.
    //3. n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다.
    //4. 최소 몇 판 먹어야하는지 return

    public static void main(String[] args) {


        int n = 10;
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

        System.out.println("피자 개수 : " + pizza);
    }
}