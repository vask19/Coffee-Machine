package machine.calculator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    private final int water = 200;
    private final int milk = 50;
    private final int coffeeBeans = 15;

    private Map<String,Integer> calculator(int amount_coffee){
        int  amount_water = amount_coffee * water;
        int amount_milk = amount_coffee * milk;
        int amount_coffeeBeans = amount_coffee * coffeeBeans;

        Map<String,Integer> amountOfIngredients = new HashMap<>();

        amountOfIngredients.put("amount_coffee",amount_coffee);
        amountOfIngredients.put("milk",amount_milk);
        amountOfIngredients.put("water",amount_water);
        amountOfIngredients.put("coffeeBeans",amount_coffeeBeans);

        return amountOfIngredients;


    }

    public void print(int amount_coffee){
        Map<String,Integer> amountOfIngredients = calculator(amount_coffee);

        System.out.printf("For %d cups of coffee you will need:\n",amountOfIngredients.get("amount_coffee"));
        System.out.println(amountOfIngredients.get("water") + " ml of water");
        System.out.println( amountOfIngredients.get("milk") +" ml of milk");
        System.out.println( amountOfIngredients.get("coffeeBeans") + " g of coffee beans");


    }





}
