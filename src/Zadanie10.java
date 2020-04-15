import java.util.Scanner;


public class Zadanie10 {
    public static void main(String[] args)
    {

        System.out.println("Размер массива ввести через enter: ");
        Scanner n= new Scanner(System.in);
        String num = n.nextLine(); // считать с консоли


        Scanner n2= new Scanner(System.in);
        String num2 = n2.nextLine(); // считать с консоли
        int x = Integer.parseInt(num, 10);
        int y = Integer.parseInt(num2, 10);

int mass[][]=new int[x][y];
// Вввод элементов массива - заполнение массива
for (int i=0; i<x;i++)
{ for (int j=0; j<y;j++)
    {
        System.out.println("введите элемент массива: mass["+i+"]["+j+"]");
        Scanner t= new Scanner(System.in);
        String f = t.nextLine(); // считать с консоли
        int number = Integer.parseInt(f, 10);
       mass[i][j]=number ;
    };
}
        for (int i=0; i<1;i++)
        {
            System.out.print("первая строка матрицы: ");
            for (int j = 0; j < y; j++)
            {
                System.out.print(mass[i][j]*3+" ");
            }
        }
    }
    }