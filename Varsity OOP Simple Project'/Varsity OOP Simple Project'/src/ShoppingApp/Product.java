package ShoppingApp;

abstract class Product {
    protected String name;
    protected Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    abstract double applyDiscount();
}