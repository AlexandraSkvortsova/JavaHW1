import java.io.*;
//import java.util.Scanner;

/*Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли.
Пользователь при тестировании программы по правилу черного ящика должен понимать,
какой принцип остановки записи в файл он должен подать.
 */
public class Zadanie17 {
    public static void main(String[] args) {

        String str;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Чтобы закончить ввод нажми enter и напиши: 'end'");
        try (FileWriter fw=new FileWriter("HomeWork17.txt"))
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
