import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double priceOfCandy, priceOfCookies, oneGOfCandy, oneGOfCookies;
       System.out.println("Enter the price of 1kg Candy: ");
       priceOfCandy = new Scanner(System.in).nextInt();
        System.out.println("Enter the price of 1kg Cookies: ");
        priceOfCookies = new Scanner(System.in).nextInt();
        oneGOfCandy = priceOfCandy / 1000;
        oneGOfCookies = priceOfCookies / 1000;
        System.out.println("300g of candies costs: "+oneGOfCandy*300+" and 400g cookies costs: "+oneGOfCookies*400);
        System.out.println("2kg of candies costs: "+priceOfCandy*2+" and 400g cookies costs: "+priceOfCookies+oneGOfCookies*800);
    }
}