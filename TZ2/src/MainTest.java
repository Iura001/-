import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest {

    @Test
    public void testSum() {
        TZ2 calculator = new TZ2();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int result = calculator._sum(numbers);
        assertEquals(15, result);
    }

    @Test
    public void testmin() {
        TZ2 mincalculator = new TZ2();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int result = mincalculator._min(numbers);
        assertEquals(1, result);

    }

    @Test
    public void testmax() {
        TZ2 maxcalculator = new TZ2();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int result = maxcalculator._max(numbers);
        assertEquals(5, result);
    }

    @Test
    public void testmult() {
        TZ2 multcalculator = new TZ2();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int result = multcalculator._mult(numbers);
        assertEquals(120, result);
    }

    @Test
    public void testsumvremea() {
        int[] razmeri = {1000, 10000, 1000000};
        for (int razmer : razmeri) {
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < razmer; i++) {
                numbers.add(i);
            }
            long startTime = System.nanoTime();
            TZ2._sum(numbers);
            long endTime = System.nanoTime();
            System.out.println("Время выполнения _sum для " + razmer + " элементов: " + (endTime - startTime) + " нс");
        }
    }

    @Test
    public void testminvremea() {
        int[] razmeri = {1000, 10000, 1000000};
        for (int razmer : razmeri) {
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < razmer; i++) {
                numbers.add(i);
            }
            long startTime = System.nanoTime();
            TZ2._min(numbers);
            long endTime = System.nanoTime();
            System.out.println("Время выполнения _min для " + razmer + " элементов: " + (endTime - startTime) + " нс");
        }
    }
    @Test
    public void testmaxvremea() {
        int[] razmeri = {1000, 10000, 1000000};
        for (int razmer : razmeri) {
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < razmer; i++) {
                numbers.add(i);
            }
            long startTime = System.nanoTime();
            TZ2._max(numbers);
            long endTime = System.nanoTime();
            System.out.println("Время выполнения _max для " + razmer + " элементов: " + (endTime - startTime) + " нс");
        }
    }
    @Test
    public void testmultvremea() {
        int[] razmeri = {1000, 10000, 1000000};
        for (int razmer : razmeri) {
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < razmer; i++) {
                numbers.add(i);
            }
            long startTime = System.nanoTime();
            TZ2._mult(numbers);
            long endTime = System.nanoTime();
            System.out.println("Время выполнения _mult для " + razmer + " элементов: " + (endTime - startTime) + " нс");
        }
    }
    @Test
    public void testpamiati() {
        int[] sizes = {1000, 50000, 1000000};
        for (int size : sizes) {
            long vnaciale = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
            List<Integer> numbers = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                numbers.add(i);
            }
            long vfinale = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
            long mem = vfinale - vnaciale;

            System.out.println("Память, использованная для списка из " + size + " элементов: " + mem + " байт");
        }
    }

}
