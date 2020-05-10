import java.io.*;
//import java.util.Scanner;

/*Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.
 */
public class Zadanie18 {
    public static void main(String[] args) {

        String str;
        int k=0, k2=0; // считает строки
        //Считаем файл и выведем текст
        try (BufferedReader br = new BufferedReader(new FileReader("HomeWork18.txt"))) {
            while ((str = br.readLine()) != null) {
                System.out.println(str);

                k++;
                /*if (str!=null)
                {
                  i  ;
                }*/
            }
            System.out.println("*В файле "+k+" строки(а)");
        } catch (FileNotFoundException exc) {
            System.out.println("Ошибка вывода: " + exc);

        } catch (IOException e) { // не понимаю почему, но без этого не работает
            e.printStackTrace();
        }

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Чтобы закончить ввод вам надо ввести такое же количество строк как в начальном файле");
        try (FileWriter fw=new FileWriter("HomeWork18.txt"))
        {
            System.out.println(": ");
            do
            { //System.out.println(": ");
                k2++;
               // System.out.println("K2="+k2);
                str=br.readLine();
               //if (str.compareTo("end")==0) break;

               // if (k2>k) break;
                str =str+"\r\n";
                //k2++;

                fw.write(str); // записываем в файл
            }
            while (k2<k);

        } catch (IOException e) {
            System.out.println("Ошибка ввода ");
        }

    }
}
