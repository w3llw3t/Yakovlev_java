import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.
        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        if (num > 7) {
            System.out.println("Привет!");
        }

        // 2.
        System.out.print("Введите имя: ");
        String name = scanner.next();

        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

        // 3.
        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();

        int[] nums = new int[length];

        System.out.println("Ввведите элементы массива:");
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Элементы массива, кратные 3: ");
        for (int i = 0; i < length; i++) {
            if (nums[i] % 3 == 0) {
                System.out.print(nums[i] + " ");
            }
        }
    }
}