package FoodPanda;

class DeliveryService {
    private String deliveryPerson;

    public DeliveryService(String deliveryPerson) {
        this.deliveryPerson = deliveryPerson;
    }

    class Order {
        private String foodItem;
        private double price;
        private String status;

        public Order(String foodItem, double price) {
            this.foodItem = foodItem;
            this.price = price;
            this.status = "Pending";
        }

        public double calculateTotal() {
            return price + 5.0; // Fixed delivery charge
        }

        public void deliverOrder() {
            this.status = "Delivered";
            System.out.println("Order for " + foodItem + " has been delivered by " + deliveryPerson);
        }
    }
}