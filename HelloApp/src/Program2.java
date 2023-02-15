import java.util.Scanner;
public class IndexMass {public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("Имя: ");
    String name = in.nextLine();
    System.out.print("Вес: ");
    int weight = in.nextInt();
    System.out.print("Рост: ");
    float height = in.nextFloat();
    float c = weight / (height*height);
    System.out.println("Индекс массы тела "+name+" - "+c);
    in.close();
}
}
