import java.util.Scanner;


public class Zadanie9 {
    public static void main(String[] args)
    {

        System.out.println("Размер массива ввести через enter: ");
        Scanner n= new Scanner(System.in);
        String num = n.nextLine(); // считать с консоли



        int x = Integer.parseInt(num, 10);


int mass[]=new int[x];
// Вввод элементов массива - заполнение массива
for (int i=0; i<x;i++)
{

        System.out.println("введите элемент массива: mass["+i+"] ");
        Scanner t= new Scanner(System.in);
        String f = t.nextLine(); // считать с консоли
        int number = Integer.parseInt(f, 10);
       mass[i]=number;

}
        for (int i=0; i<x;i++)
        {

                System.out.println("элемент массива: mass["+i+"]"+"="+mass[i]*2);

        }
    }
    }