package sub1;

public class BasicTest {
    public static void main(String[] args) {

        Calc calc = new Calc();

        if (calc.plus(1, 2) == 3){
            System.out.println("plus(1, 2) test success!");
        }else{
            System.out.println("plus(1, 2) test failed!");
        }

        if (calc.minus(1, 2) == -1){
            System.out.println("minus(1, 2) test success!");
        }else{
            System.out.println("minus(1, 2) test failed!");
        }

        if (calc.multiply(2, 3) == 6){
            System.out.println("multiply(2, 3) test success!");
        }else{
            System.out.println("multiply(2, 3) test failed!");
        }

        if (calc.divide(4, 2) == 2){
            System.out.println("divide(4, 2) test success!");
        }else{
            System.out.println("divide(4, 2) test failed!");
        }
    }
}
