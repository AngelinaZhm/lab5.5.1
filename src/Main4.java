import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть перше ім'я : ");
        String fN = sc.nextLine();
        System.out.println("Введіть друге ім'я : ");
        String sN = sc.nextLine();
        if (fN.equalsIgnoreCase(sN)){
            System.out.println("Імена однакові!");
        }else {
            System.out.println("Імена різні.");
        }
    }
}
