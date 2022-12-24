import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        Restaurant restaurant_ = new Restaurant();
        int customerID, orderQty;
    
    try{
        System.out.println("Enter your Customer ID : ");
        customerID = inputan.nextInt();

        System.out.println("Enter how much food you want to make : ");
        orderQty = inputan.nextInt();

        Thread thread1 = new Thread(restaurant_);
        Waiters waiters = new Waiters(orderQty, customerID);
        Thread thread2 = new Thread(waiters);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

    } catch(Exception e){
        System.out.println("Your input must be integer. For example '1' or '2' etc");
    }
    inputan.close();
        
    }
}
