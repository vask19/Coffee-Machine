package machine.main;

import machine.coffe.Coffee;

public class Main {
    public static void main(String[] args) {
       /* CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.start();*/
        int i = 0;
        for (int k = 0; k < 100; k++) {
            System.out.println(i);
            i = i++;
            System.out.println("bef " + i);
        }
        System.out.println("el");
        System.out.println(i);

    }
}
