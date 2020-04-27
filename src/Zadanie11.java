import java.util.Scanner;

// Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную. Результат вывести на экран.
public class Zadanie11 {
    public static void main(String[] args)
    {

        System.out.println("Введите строку: ");
        Scanner n= new Scanner(System.in); //зададим строковую переменну- выделим память под нее
        String num = n.nextLine(); // считать с консоли
       // int number = Integer.parseInt(num, 10);


        System.out.println(num);


    }
}
