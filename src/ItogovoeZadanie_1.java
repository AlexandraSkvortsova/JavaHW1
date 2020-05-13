import java.util.Scanner;
//import java.util.Scanner;

/*Итоговая задача №1
Ввести с консоли число в бинарном формате.
Перевести его в десятичный формат, записать в переменную int и вывести на экран.
Необходимо использовать циклы, нельзя использования готовые методы языка Java,
для перевода числа из одной системы счисления в другую.
 */
public class ItogovoeZadanie_1 {
    public static void main(String[] args) {

        System.out.println("Введите бинарное число: ");
        Scanner scan= new Scanner(System.in);
        String bin = scan.nextLine(); // считать с консоли бинарное число
       int n = Integer.parseInt(bin, 10);
double dec=0;
int p=n;
// Проверка бинарное число или нет
            for (int i = 1; i <= bin.length(); i++) {
                int k = p % 10;
                if (k > 1) {
                    System.out.println("Вы ввели небинарное число ");
                   System.exit(0);
                }
                p = (p - k) / 10;
            }
// _________________________1010
            // Перевод бинарное в десятиричное
            int l = n;
            for (int i = 0; i < bin.length(); i++) {
                int k = l % 10; //остаток от деления 1 или 0
                l = (l - k) / 10; //новое число
                dec = dec + (k * (Math.pow(2, i)));
                //System.out.println(Math.pow(2,i));
            }
            int dec1 = (int) dec; //запись итогового числа в тип int
            System.out.println("Число " + n + " в двоичном коде соответствует " + dec1 + " в десятичном формате");
    }
}
