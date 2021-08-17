package machine.main;

import machine.calculator.Calculator;
import machine.calculator.Test;
import machine.coffe.Coffee;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CoffeeMachine {
    static final private Scanner sc = new Scanner(System.in);
    private int  amount_water;
    private int amount_milk;
    private int amount_coffeeBeans;

    public CoffeeMachine(){

    }

    public CoffeeMachine(int amount_water, int amount_milk, int amount_coffeeBeans) {
        this.amount_water = amount_water;
        this.amount_milk = amount_milk;
        this.amount_coffeeBeans = amount_coffeeBeans;
    }



    private int coffeePortionCalculator (Coffee coffee){
        int coffeeFromWaterWillTurnOut = amount_water/coffee.getAmountOfWaterPerOneCoffee();
        int coffeeFromMilkWillTurnOut = amount_milk/coffee.getAmountOfMilkPerOneCoffee();
        int coffeeFromCoffee_BeansWillTurnOut = amount_coffeeBeans/coffee.getAmountOfCoffeeBeansPerOneCoffee();

        List<Integer> servingsCoffee  =
                 Stream.of(coffeeFromWaterWillTurnOut,coffeeFromMilkWillTurnOut,coffeeFromCoffee_BeansWillTurnOut)
                         .sorted()
                         .collect(Collectors.toList());

        return servingsCoffee.get(0);

    }

    public void start(){
        decisionToMakeCoffee(Coffee.COFFE);


    }

    private void fillFheCoffeeMachine(){
        System.out.println(" Write how many ml of water the coffee machine has:");
        amount_water = sc.nextInt();
        System.out.println(" Write how many ml of milk the coffee machine has:");
        amount_milk = sc.nextInt();
        System.out.println(" Write how many grams of coffee beans the coffee machine has:");
        amount_coffeeBeans = sc.nextInt();




    }

    private void decisionToMakeCoffee (Coffee coffee){
        fillFheCoffeeMachine();
        System.out.println(" Write how many cups of coffee you will need:");
        int needCoffee = sc.nextInt();
        int availableServings = coffeePortionCalculator(coffee);
        int difference  = availableServings - needCoffee;

        if (difference == 0){
            System.out.println("Yes, I can make that amount of coffee");
        }
        else if (difference > 0){
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)/n",difference);
        }
        else {
            System.out.printf("No, I can make only %d cup(s) of coffee\n",availableServings);
        }














    }








}
