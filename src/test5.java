import java.util.Scanner;

public class test5 {
    public static void main(String[] args)
    {
/*
        System.out.println("Ввести число 1: ");
        Scanner number= new Scanner(System.in);
        String num = number.nextLine(); // считать с консоли
        int dec = Integer.parseInt(num, 10);
        if (dec==1)

        System.out.println("Вы ввели число 1");

*/
double[] myArray={1.9, 2.9, 3.4, 3.5};

for (int i=0; i<myArray.length;i++)
{
   System.out.println(myArray[i]+" ");
}
double total=0;
        for (int i=0; i<myArray.length;i++)
        {
            total+=myArray[i];
        }
        System.out.println("сумма чисел массива"+total);

        double max=myArray[0];
        for (int i=1; i<myArray.length;i++)
        {
            if (myArray[i]>max)
                max=myArray[i];
        }
System.out.println("наибольший элемент"+max);
    }
}
