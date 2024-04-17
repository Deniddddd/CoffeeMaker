package app;

class Espresso implements CoffeeDrink {
    @Override
    public void prepare() {
        System.out.println("Preparing espresso...");
    }
}
