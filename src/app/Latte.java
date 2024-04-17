package app;

class Latte implements CoffeeDrink {
    @Override
    public void prepare() {
        System.out.println("Preparing latte...");
    }
}