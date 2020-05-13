import java.util.Scanner;
//import java.util.Scanner;

/*Итоговая задача №2
Написать программу сортировки, по возрастанию заданного пользователем массива чисел.
Пользователь должен задавать размер массива и наполнять его числами.
Использовать одну из следующих сортировок: прямого выбора, вставки, быстрая, Шелла.
 */
public class ItogovoeZadanie_2 {
    public static void main(String[] args) {
        //Ввод массива с консоли
        System.out.println("введите размер массива: ");
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
        //выведем массив
        for (int i=0; i<X;i++)
        {
            System.out.print(arr[i]+" ");
        }
        // отсортируем прямым выбором
        int min;
        for (int i=0; i<arr.length-1; i++)
        {
            min=i;
            for (int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[i])
                {
                  min=j;
                }
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }

        //выведем отсортированный массив
        System.out.println("отсортируем массив: ");
        for (int i=0; i<X;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
