package machine.coffe;

public enum Coffee {
    COFFE(50,200,15);
    private int amountOfMilkPerOneCoffee;
    private int amountOfWaterPerOneCoffee;
    private int amountOfCoffeeBeansPerOneCoffee;

    Coffee(){

    }

    Coffee(int amountOfMilkPerOneCoffee,int amountOfWaterPerOneCoffee,int amountOfCoffeeBeansPerOneCoffee){
        this.amountOfMilkPerOneCoffee = amountOfMilkPerOneCoffee;
        this.amountOfWaterPerOneCoffee = amountOfWaterPerOneCoffee;
        this.amountOfCoffeeBeansPerOneCoffee = amountOfCoffeeBeansPerOneCoffee;

    }

    public int getAmountOfMilkPerOneCoffee() {
        return amountOfMilkPerOneCoffee;
    }

    public int getAmountOfWaterPerOneCoffee() {
        return amountOfWaterPerOneCoffee;
    }

    public int getAmountOfCoffeeBeansPerOneCoffee() {
        return amountOfCoffeeBeansPerOneCoffee;
    }
}
