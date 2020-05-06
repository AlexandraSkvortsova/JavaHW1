import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.util.Scanner;

/*Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли.
Пользователь при тестировании программы по правилу черного ящика должен понимать,
какой принцип остановки записи в файл он должен подать.
 */
public class Zadanie17 {
    public static void main(String[] args) {

        String str;
        BufferedReader br
        try (BufferedReader br = new BufferedReader(new FileReader("HomeWork16.txt"))) {
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (FileNotFoundException exc) {
            System.out.println("Ошибка вывода: " + exc);

        } catch (IOException e) { // не понимаю почему, но без этого не работает
            e.printStackTrace();
        }
    }
}
