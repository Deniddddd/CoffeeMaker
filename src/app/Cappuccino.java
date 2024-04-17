package app;

class Cappuccino implements CoffeeDrink {
    @Override
    public void prepare() {
        System.out.println("Preparing cappuccino...");
    }
}
