package ShoppingApp;

class Electronics extends Product {
    public Electronics(String name, Double price) {
        super(name, price);
    }

    @Override
    public double applyDiscount() {
        return price * 0.85; // 15% discount
    }
}