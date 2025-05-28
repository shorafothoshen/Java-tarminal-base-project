package ShoppingApp;

class Book extends Product {
    public Book(String name, Double price) {
        super(name, price);
    }

    @Override
    public double applyDiscount() {
        return price * 0.9; // 10% discount
    }
}