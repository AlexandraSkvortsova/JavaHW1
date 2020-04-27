import java.util.Scanner;

/*Необходимо написать программу, которая будет реализовывать следующие действия:
1. Ввод числа с клавиатуры и запись его в строковую переменную S
2. Конвертация строковой переменной S в числовую переменную X типа int
3. Конвертация числа X типа int в число Y типа double
Все три числа разных типов необходимо в столбик вывести на экран
 */
public class Zadanie14 {
    public static void main(String[] args) {

        System.out.println("Введите число: ");
        Scanner n1 = new Scanner(System.in); //зададим строковую переменну- выделим память под нее
        String S = n1.nextLine(); // считать с консоли 1-й тип
        int X = Integer.parseInt(S, 10); //2-й тип
        double Y=(double)X; //3-й тип

        System.out.println("1-й тип " + S);
        System.out.println("2-й тип " + X);
        System.out.println("3-й тип " + Y);

    }
}
