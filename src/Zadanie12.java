import java.util.Scanner;
import java.io.*;
//import java.util.split;
// Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную. Результат вывести на экран.
// Для введенной с клавиатуры строки необходимо провести отсев пробелов. Результат в виде строки без пробелов вывести на экран.
public class Zadanie12 {
    public static void main(String[] args)
    {

        System.out.println("Введите строку: ");
        Scanner n= new Scanner(System.in); //зададим строковую переменну- выделим память под нее
        String stroka = n.nextLine(); // считать с консоли
       // char[] massive=stroka.toCharArray(); // перевод строки в массив
String[] partsMassive=stroka.split(" ");


       String resultMassive=String.format(partsMassive[0]);
     for (int i=1; i<partsMassive.length; i++)
     {
         resultMassive=String.format(resultMassive+partsMassive[i]);
     }

        //String resultMassive=String.format(partsMassive[i],partsMassive[i-1]);
        System.out.println(resultMassive);


    }
}
