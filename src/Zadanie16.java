import java.io.*;
//import java.util.Scanner;


/*Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt
 */



public class Zadanie16 {
    public static void main(String[] args) {

        String str;
        try (BufferedReader(new FileReader("HomeWork16"))){

        }


        //Ввод массива с консоли
       /* System.out.println("введите размер массива: ");
        Scanner n1 = new Scanner(System.in); //зададим строковую переменну- выделим память под нее
        String S = n1.nextLine(); // считать с консоли строковую переменную
        int X = Integer.parseInt(S, 10); //преобразуем в переменную типа int
        int arr[] = new int[X]; // массив заданного размера

        //Заполняем массив
        for (int i = 0; i < X; i++) {
            System.out.println("введите " + i + " элемент массива");
            Scanner n = new Scanner(System.in); //зададим строковую переменну- выделим память под нее
            String num = n.nextLine(); // считать с консоли строковую переменную
            int x = Integer.parseInt(num, 10); //преобразуем в переменную типа int
            arr[i] = x;

        }
//Выводим массива
        System.out.print("Массив arr[");
        for (int j = 0; j < X; j++) {
            if (j < X - 1) {
                System.out.print(arr[j] + ", ");

            } else
                System.out.print(arr[j]);

        }
        System.out.println("]");
        //Создадим отсортированный массив
        for(int k=X-1;k>0; k--)
        {
         for (int r=0;r<k;r++)
         {
             if(arr[r]>arr[r+1])
             {
                int tmp=arr[r];
                arr[r]=arr[r+1];
                arr[r+1]=tmp;
             }

         }

        }
       // выводим отсортированный массив
        System.out.print("Отсортированный массив arr[");
        for ( int a = 0; a < X; a++) {
            if (a < X - 1) {
                System.out.print(arr[a] + ", ");

            } else
                System.out.print(arr[a]);

        }
        System.out.println("]");*/
    }


}
