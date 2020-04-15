import java.util.Scanner;

public class test5 {
    public static void main(String[] args)
    {

        System.out.println("Ввести число 1: ");
        Scanner number= new Scanner(System.in);
        String num = number.nextLine(); // считать с консоли
        int dec = Integer.parseInt(num, 10);
        if (dec==1)

        System.out.println("Вы ввели число 1");


    }
}
