package HW2;
import java.util.Scanner;

public class task4 {
   public static void main(String[] args) throws Exception
   {
      Scanner console = new Scanner(System.in);
      System.out.println("Введите не пустую строку!: ");
      String name = console.nextLine();
        if (name.isEmpty()!=false){
            throw new RuntimeException ("Нельзя вводить пустую строку");
        }
        System.out.println("Cпасибо, что не ввели пустую строку");
   }
}
