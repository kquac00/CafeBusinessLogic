import java.util.ArrayList;

public class CafeUtil {
    
    public double getOrderTotal(double[] prices){
        double totalPrice = 0;
        for (double price : prices) {
            totalPrice += price;
        }
        return totalPrice;
    }
    public void displayMenu(ArrayList<String> menuItems){
        for (String menu : menuItems) {
            System.out.println(menu);
        }
    } 
    public int getStreakGoal(){
        int sum = 0;
        for (int i = 1; i <= 10; i++){
            sum += i;
        }
        return sum;
    }
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name");
        String userName = System.console().readLine();
        
        System.out.println("Hello, " + userName + "!");
        
        System.out.println("There are " + customers.size() + " people in front of you.");
        customers.add(userName);
        System.out.println("new list is: " + customers);

    }
}