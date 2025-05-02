public class Car{
public void displayDetails(String showroomName, String modelName, int price){
System.out.println("Showroom name:" + showroomName);
System.out.println("Car model:" + modelName);
System.out.println("Price:" + price);
System.out.println("-------------------");
}
public static void main(String [] args){
Car car = new Car();
car.displayDetails("Elite Motors","Tesla Model S",80000);
car.displayDetails("Elite Motors","BMW X5",75000);
}
}