import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SolutionViaStream {

    SolutionViaStream() { // Решение с использованием Stream API
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        java.util.stream.Stream<Integer> stream = intList.stream();

        stream.filter(x -> x > 0) // 1. Отфильтруйте положительные числа
                .filter(x -> x % 2 == 0) // 2. Найдите среди этих положительных чисел четные
                .sorted(Comparator.naturalOrder()) // 3. Отсортируйте отфильтрованные числа в порядке возрастания
                .forEach((p) -> System.out.printf("%d ", p)); // 4. Выведите результат на экран
    }

}
