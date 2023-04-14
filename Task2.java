/**
 * Если необходимо, исправьте данный код 
 * try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}

 */

public class Task2 {

    public static void catchedRes(int d, int[] intArray) {
        if (d==0) System.out.println("На ноль делить нельзя");
        else if(intArray.length < 9) System.out.println("Нет элемента с индексом 8");
        else {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }
    }

}
