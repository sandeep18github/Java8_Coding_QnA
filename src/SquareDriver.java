public class SquareDriver {


    public static void main(String[] args) {
        Square square = p -> p * p;
        int num = square.cal(5);
        System.out.println(num);
    }


}
