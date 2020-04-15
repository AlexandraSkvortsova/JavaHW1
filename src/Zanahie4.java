import java.util.Scanner;
public class Zanahie4 {
    public static void main(String[] args)
    {

        System.out.println("Ввести число в бинарном формате: ");
        Scanner binarnoe= new Scanner(System.in);
        String bin = binarnoe.nextLine(); // считать с консоли
        int dec = Integer.parseInt(bin, 2);

        System.out.println("Это же число в десятиричной системе счисления: "+dec);
       // System.out.println("Hi COVID19!");

    }
}
