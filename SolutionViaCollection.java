import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SolutionViaCollection {

    SolutionViaCollection() { // Решение с использованием Collection API
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> resultList = new ArrayList<>();
        for (Integer i : intList) {
            if (i > 0 && i % 2 == 0) { // 1. Отфильтруйте положительные числа // 2. Найдите среди этих положительных чисел четные
                resultList.add(i);
            }
        }
        resultList.sort(Comparator.naturalOrder()); // 3. Отсортируйте отфильтрованные числа в порядке возрастания
        for (Integer r : resultList) {
            System.out.printf("%d ", r); // 4. Выведите результат на экран
        }
    }

}
