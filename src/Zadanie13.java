import java.util.Scanner;

/*Необходимо провести сравнение длины двух строк,
которые были введены с клавиатуры и записаны в соответствующие переменные.
Вывести на экран строку с наибольшей длиной.
Если длины равны, вывести соответствтующее сообщение.
 */
public class Zadanie13 {
    public static void main(String[] args) {

        System.out.println("Введите строку намбер_1: ");
        Scanner n1 = new Scanner(System.in); //зададим строковую переменну- выделим память под нее
        String stroka1 = n1.nextLine(); // считать с консоли

        System.out.println("Введите строку намбер_2: ");
        Scanner n2 = new Scanner(System.in); //зададим строковую переменну- выделим память под нее
        String stroka2 = n1.nextLine(); // считать с консоли

        if (stroka1.length() < stroka2.length()) {
            System.out.println("Вторая строка больше и имеет длину равную "+stroka2.length());
        } else if (stroka1.length() > stroka2.length()) {
            System.out.println("Первая строка больше и имеет длину равную"+stroka1.length());
        } else {
            System.out.println("Строки имеют одинаковую длину равную " + stroka2.length());

        }
    }
}
