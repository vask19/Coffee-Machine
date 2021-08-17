package machine;

import machine.calculator.Test;

import java.util.Calendar;
import java.util.Scanner;

public class CoffeeMachine {
    static final private Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println("Write how many cups of coffee you will need: ");
        int count_coffee = sc.nextInt();
        test.print(count_coffee);


    }


}
