import java.util.Scanner;
public class ArifmeticProgressiya {public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("до какой суммы надо вывести: ");
    int C = in.nextInt();
    Scanner scanner = new Scanner(System.in);
    System.out.print("первое значение арифметической прогрессии: ");
    int A = in.nextInt();
    System.out.print("шаг: ");
    int B = in.nextInt();
    {do A=A+B;
    while (A<C) ;}
    System.out.print(A-B);
    in.close();}
}
