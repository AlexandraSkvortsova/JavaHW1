import java.util.Scanner;


public class Zadanie7 {
    public static void main(String[] args)
    {

        System.out.println("Введите x: ");
        Scanner n= new Scanner(System.in);
        String num = n.nextLine(); // считать с консоли
        int number = Integer.parseInt(num, 10);
        final int X=3; //final определяет константу
        final int Y=10;
        final int Z=15;

switch (number)
{
    case 3:
    case 10:
    case 15:
        System.out.println("Данное значение имеется в константах");
        break;
    default:
       // mInfoTextView.setText("Invalid month number"); - не работает, не знаю что деать
        System.out.println("Такой константы нет!");
}

    }
}
