/*
 * 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */



import java.util.Scanner;
public class triangular_number {
    public static void main(String[] args) {
        
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int numb = iScanner.nextInt();
        System.out.println("n-ое треугольного число = " + (numb * (numb + 1) / 2));
        iScanner.close();
    }
}