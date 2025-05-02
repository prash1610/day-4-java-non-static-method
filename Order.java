 public class Order {
 public String getOrderDetails(String restaurantName, String foodItem, int quantity) {
 return "Restaurant Name : " + restaurantName + "\n"+ "Food Item : " + foodItem + "\n"+ "Quantity : " + quantity + "\n"+ "-----------------------------";
    }

    public static void main(String[] args) {
        Order order = new Order();

        String result1 = order.getOrderDetails("Spice Garden", "Paneer Butter Masala", 2);
        System.out.println(result1);

        String result2 = order.getOrderDetails("Spice Garden", "Chicken Biryani", 1);
        System.out.println(result2);
    }
}