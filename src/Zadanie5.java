import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args)
    {

        System.out.println("Ввести число для которого нужна таблица умножения: ");
        Scanner number= new Scanner(System.in);
        String num = number.nextLine(); // считать с консоли
        int dec = Integer.parseInt(num, 10);
        System.out.println(dec+"*1="+dec*1);
        System.out.println(dec+"*2="+dec*2);
        System.out.println(dec+"*3="+dec*3);
        System.out.println(dec+"*4="+dec*4);
        System.out.println(dec+"*5="+dec*5);
        System.out.println(dec+"*6="+dec*6);
        System.out.println(dec+"*7="+dec*7);
        System.out.println(dec+"*8="+dec*8);
        System.out.println(dec+"*9="+dec*9);
        System.out.println(dec+"*10="+dec*10);
       // System.out.println("Hi COVID19!");

    }
}
