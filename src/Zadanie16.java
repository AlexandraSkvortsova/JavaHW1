import java.io.*;
//import java.util.Scanner;

/*Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt
 */
public class Zadanie16 {
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
