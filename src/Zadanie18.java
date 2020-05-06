import java.io.*;
//import java.util.Scanner;

/*Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.
 */
public class Zadanie18 {
    public static void main(String[] args) {

        String str;
        //Считаем файл и выведем текст
        try (BufferedReader br = new BufferedReader(new FileReader("HomeWork16.txt"))) {
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (FileNotFoundException exc) {
            System.out.println("Ошибка вывода: " + exc);

        } catch (IOException e) { // не понимаю почему, но без этого не работает
            e.printStackTrace();
        }

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Чтобы закончить ввод нажми enter и напиши: 'end'");
        try (FileWriter fw=new FileWriter("HomeWork16.txt"))
        {
            do
            { System.out.println(": ");
                str=br.readLine();
                if (str.compareTo("end")==0) break;
                str =str+"\r\n";
                fw.write(str); // записываем в файл
            }
            while (str.compareTo("end")!=0);

        } catch (IOException e) {
            System.out.println("Ошибка ввода ");
        }

    }
}
