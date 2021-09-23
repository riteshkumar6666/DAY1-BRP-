import java.util.Scanner;
public class Spring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the month : ");
        int month=sc.nextInt();
        System.out.println("Enter the Day : ");
        int Day= sc.nextInt();
        if ((month>=4|| month>=6) && (Day<=30 && Day>=1))
        {
            System.out.println("SUMMER WHEATHER");
        }
        else if(month>6 && month<=8)
        {
            System.out.println("Rainy WHEATHER");
        }
        else
        {
            System.out.println(" WINTER WHEATHER");
        }



    }
}
