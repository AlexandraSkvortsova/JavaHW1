import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.util.Scanner;

/*Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.
 */
public class Zadanie18 {
    public static void main(String[] args) {

        String str;
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
