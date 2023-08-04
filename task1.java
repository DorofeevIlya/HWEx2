package HW2;
import java.util.Scanner;

public class task1 {

public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      System.out.println("Введите дробное число: ");
        while (true){
            String name = console.next();
            try {
                System.out.println(Double.parseDouble(name));
                break;
        }
        catch (NumberFormatException e) {
            System.out.println("Нужно ввести число типа float");
        }
   }
}
}