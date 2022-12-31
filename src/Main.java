
public class Main {

    //1. 피자를 일곱 조각으로 잘라준다.
    //2. 피자를 나눠먹을 사람 수 n이 주어짐.
    //3. 모든 사람이 피자를 한 조각 이상 먹기위해 필요한 피자 수 return

    public static void main(String[] args) {
        //7의 배수
        //7로 나눴을 때 나머지
        int n = 15;
        int pizza = 1;
        int piecesOfPizza = 7;

        //피자 조각갯수를 7로 나눴을 때 몫이 1이고 나머지가 0이상이면 통과
        //그때의 피자 갯수를 반환

        for (int i = 0; i < 100; i++) {
            if ((piecesOfPizza / n) == 0) {
                pizza += 1;
                piecesOfPizza = pizza * 7;
                continue;
            } else if ((piecesOfPizza / n) == 0 && (piecesOfPizza % n >= 0)) {
                break;
            }
        }
        System.out.println("피자 개수 : " + pizza);
        System.out.println("바로 호출");


        //피자 몇 판인지 return

    }
}