import java.util.Scanner;

/**
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

public class Task4 {

    public static void getString() throws Exception {
        System.out.println("Введите строку:");
        Scanner scan = new Scanner(System.in);
        String res = scan.nextLine();
        if (res.equals("")) {
            scan.close();
            throw new Exception("Нельзя вводить пустую строку");
        }
        scan.close();
    }
    public static void main(String[] args) throws Exception {
        getString();
    }
}
