import java.io.IOException;
import java.util.Scanner;

public class Main {

    static int calcResult(int first, int second, String operation){
        switch (operation){
            case "+" :
                return first + second;
            case "-" :
                return first - second;
            case "*" :
                return first * second;
            case "/":
                return first % second;
        }
        return 0;
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение");
        String [] inputCalc = scanner.nextLine().split(" ");
        if (inputCalc.length != 3){
            throw new IOException();
        }
        int firstNum = Integer.parseInt(inputCalc[0]);
        int secondNum = Integer.parseInt(inputCalc[2]);
        String patternOperation = "-+/*";
        String operation = inputCalc[1];
        if (firstNum > 10 || firstNum < 0 || secondNum > 10 || secondNum < 0 || operation.length() > 1 || (patternOperation.contains(operation)) != true) {
            throw new IOException();
        }
        System.out.println(calcResult (firstNum, secondNum, operation));
    }


}