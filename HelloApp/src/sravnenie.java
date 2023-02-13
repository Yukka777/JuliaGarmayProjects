import java.util.Scanner;
public class sravnenie {public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("Число 1: ");
    int num1 = in.nextInt();
    System.out.print("Число 2: ");
    int num2 = in.nextInt();
    if(num1>num2){
        System.out.println("Первое число больше второго");
    }
    else if(num1<num2){
        System.out.println("Первое число меньше второго");
    }
    else{
        System.out.println("Числа равны");
    }
    in.close();
}}