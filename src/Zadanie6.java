import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args)
    {

        System.out.println("Введите x: ");
        Scanner number= new Scanner(System.in);
        String num = number.nextLine(); // считать с консоли
        double x = Integer.parseInt(num, 10);

        System.out.println("Введите y: ");
        Scanner number2= new Scanner(System.in);
        String num2 = number2.nextLine(); // считать с консоли
        double y = Integer.parseInt(num2, 10);

        System.out.println("Введите z: ");
        Scanner number3= new Scanner(System.in);
        String num3 = number3.nextLine(); // считать с консоли
        double z = Integer.parseInt(num3, 10);

        double srednee;
        srednee=(x+y+z)/3;
       int result=(int)srednee/2; //неявное приведение числв с плав.заяпятой в целое
        if (result>3)
        {
            System.out.println("Программа выполнена корректно");
        }

    }
}
