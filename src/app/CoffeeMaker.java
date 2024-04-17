package app;

class CoffeeMaker {
    public void makeCoffee(int choice) {
        CoffeeDrink drink;
        switch (choice) {
            case 1:
                drink = new Espresso();
                break;
            case 2:
                drink = new Cappuccino();
                break;
            case 3:
                drink = new Latte();
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                return;
        }

        drink.prepare();
        System.out.println("Your " + drink.getClass().getSimpleName() + ". Enjoy :)");
    }
}
