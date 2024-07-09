public class Main {
    public static void main(String[] args) {
        int number1 = 8, number2 = 7, number3 = 5;
        int greatest;

        if (number1 > number2 && number1 > number3) {
            greatest = number1;
        }else if (number2 > number1 && number2 > number3) {
            greatest = number2;
        }else{
            greatest = number3;
        }
    }
}
