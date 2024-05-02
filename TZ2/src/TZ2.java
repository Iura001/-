import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
public class TZ2 {
    public static void main(String[] args) throws IOException {
        List<Integer> numbers = readNumbers("/Users/iuriipostnii/Desktop/numbers1.txt");
        if (!numbers.isEmpty()) {
            System.out.println("Минимальное число: " + _min(numbers));
            System.out.println("Максимальное число: " + _max(numbers));
            System.out.println("Сумма чисел: " + _sum(numbers));
            System.out.println("Произведение чисел: " + _mult(numbers));
        } else {
            System.out.println("Не было введено ни одного числа.");
        }
    }
    private static List<Integer> readNumbers(String filePath) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
        }
        return numbers;
    }
    public static int _min(List<Integer> numbers) {
        int min = numbers.get(0);
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
    public static int _max(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
    public static int _sum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
    public static int _mult(List<Integer> numbers) {
        int mult = 1;
        for (int number : numbers) {
            mult *= number;
        }
        return mult;
    }
}
