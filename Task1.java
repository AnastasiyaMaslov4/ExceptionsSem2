import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

public class Task1 {


 public static float floatBack() throws Exception {
    try{
        System.out.println("Введите число типа float:");
        Scanner scan = new Scanner(System.in);
        float res = 0;
        if (scan.hasNextFloat()) {
            res = scan.nextFloat();
            scan.close();
            System.out.println("Ваше число: " + res);
            return res;
        }
    }
    catch(Throwable e) {
        System.out.println(e.getLocalizedMessage());
        System.out.println("Неверный ввод. Попробуйте еще раз.");
        return floatBack();
    }
    return 0;
}


  public static void main(String[] args) throws Exception {
    

   floatBack();

 }
    
}


 