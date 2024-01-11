import java.util.Scanner;

public class ВводДанных {
    public static void main(String[] args) {
        // Создаем объект Scanner
        Scanner scanner = new Scanner(System.in, "ibm866");

        // Вводим данные с консоли
        System.out.print("Введите ваше имя: ");
        String имя = scanner.nextLine();

        System.out.print("Введите ваш возраст: ");
        int возраст = scanner.nextInt();

        // Выводим введенные данные
        System.out.println("Привет, " + имя + "! Вам " + возраст + " лет.");
        
        // Закрываем Scanner
        scanner.close();
    }
}
