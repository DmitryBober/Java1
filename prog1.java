/**
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n)
 */
import java.util.Scanner;

public class prog1 {

 public static void main(String[] args) {
        Scanner NewScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int i = NewScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", Number(i));
        NewScanner.close();
    }
    public static int Number(int n) {
        return (n * (n + 1)) / 2;
    }
}
    
