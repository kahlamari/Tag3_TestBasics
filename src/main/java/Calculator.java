public class Calculator {
    public static int sum(int numberA, int numberB) {
        return numberA + numberB;
    }

    public static int mul(int numberA, int numberB){
        return numberA * numberB;
    }

    public static boolean isEven(int num){
        return num % 2 == 0;
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }
}
