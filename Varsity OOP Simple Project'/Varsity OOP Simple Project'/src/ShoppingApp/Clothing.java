package ShoppingApp;

class Clothing extends Product {
    public Clothing(String name, Double price) {
        super(name, price);
    }

    @Override
    public double applyDiscount() {
        return price * 0.8; // 20% discount
    }
}