import java.util.Scanner;

public class CompareAndCalculate {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int num_a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int num_b = scanner.nextInt();

        if (num_a > num_b) {
            System.out.println("\na > b");
        } else if (num_a < num_b) {
            System.out.println("\na < b");
        } else {
            System.out.println("\na = b");
        }

        System.out.println("\nСумма: " + (num_a + num_b));
        System.out.println("Вычетание: " + (num_a - num_b));
        System.out.println("Умножение: " + (num_a * num_b));
        System.out.println("Деление: " + ((double) num_a / num_b));
	}

}
