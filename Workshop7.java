
import java.util.Scanner;
public class Workshop7
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int attempts = 0;
        int numberBooking = 0;
        do {
            attempts += 1;
            System.out.println("Enter the number of people for the booking.");
            numberBooking = input.nextInt();
            if (numberBooking<1 || numberBooking>8) {
                System.out.println("The number of people in a booking must be between 1 and 8 inclusive.");
            }
        } while((numberBooking<1 || numberBooking>8) && attempts<3);
    }


}
