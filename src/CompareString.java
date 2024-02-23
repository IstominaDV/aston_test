import java.util.Scanner;
import java.lang.String;

public class CompareString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String str_1 = scanner.next();
        System.out.print("Введите вторую строку: ");
        String str_2 = scanner.next();

        if (str_1.equals(str_2))
        	System.out.print("Строки идентичны.");
        else
        	System.out.print("Строки неидентичны.");
        	
	}

}
