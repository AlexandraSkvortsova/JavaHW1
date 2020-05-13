import java.util.Scanner;
//import java.util.Scanner;

/*Итоговая задача №3
Написать программу конверта валют.
Программа должна переодить рубли в доллары по текущему курсу.
Пользователь вводит текущий курс и количество рублей.
Итоговое значение должнобыть округлено до двух знаков после запятой.
 */
public class ItogovoeZadanie_3 {
    public static void main(String[] args) {

        System.out.println("Текущий курс в $: ");
        Scanner scan= new Scanner(System.in);
       float Kurs = scan.nextFloat();
//scan.close();
        System.out.println("Количество рублей: ");
        Scanner scan2= new Scanner(System.in);
        float Count = scan.nextFloat();
       float sum= Count/Kurs;

       sum=sum*100;
        //System.out.println(sum);
     sum=Math.round(sum);
     sum=sum/100;
        System.out.println(sum);
    }
}
