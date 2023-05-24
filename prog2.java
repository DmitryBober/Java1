/**
 * Вычислить n! (произведение чисел от 1 до n)
 */
import java.util.Scanner;

public class prog2 {
    public static void main(String[] args) {
        Scanner NewScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int i = NewScanner.nextInt();
        System.out.printf("Факториал числа: %d\n", getFactorial(i));
        NewScanner.close();
    }
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
           result = result * i;
        }
        return result;
      }
    }

