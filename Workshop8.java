
import java.util.Scanner;
public class Workshop8
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        for(int i=0; i<101; i++) {
            System.out.println("Enter the first digit of the barcode");
            int a = input.nextInt();
            System.out.println("Enter the second digit of the barcode");
            int b = input.nextInt();
            System.out.println("Enter the third digit of the barcode");
            int c = input.nextInt();
            System.out.println("Enter the fourth digit of the barcode");
            int d = input.nextInt();
            System.out.println("Enter the fifth digit of the barcode");
            int e = input.nextInt();
            
            int checkDigit = (((a+c)*3)+((b+d)*2)) % 10;
            if (checkDigit==e) {
                counter += 1;
            }
        }
        System.out.println(counter+" barcodes were entered correctly.");
    }


}
