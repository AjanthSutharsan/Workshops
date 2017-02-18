
import java.util.Scanner;
public class Workshop6
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        int totalNumber = 0;
        int passNumber = 0;
        System.out.println("Enter a mark.");
        int mark = input.nextInt();
        while (mark!=(-99)) {
            totalNumber += 1;
            if (mark>max) {
                max = mark;
            }
            if (mark>=40) {
                passNumber += 1;
            }
            System.out.println("Enter a mark.");
            mark = input.nextInt();
        }
        System.out.println("Total Students = "+totalNumber);
        System.out.println("Number passing = "+passNumber);
        System.out.println("Maximum mark = "+max);
    }


}
