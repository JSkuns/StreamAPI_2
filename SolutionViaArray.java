import java.util.Arrays;

public class SolutionViaArray {

    SolutionViaArray() {
        // Решение без использования Collection API и Stream API
        int[] intArray = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        int[] resultArray = new int[intArray.length];
        int count = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] <= 0 || intArray[i] % 2 != 0) continue; // 1. Отфильтруйте положительные числа // 2. Найдите среди этих положительных чисел четные
            resultArray[count] = intArray[i];
            count++;
        }
        resultArray = removeElements(resultArray); // убираем нулевые значения из массива
        Arrays.sort(resultArray); // 3. Отсортируйте отфильтрованные числа в порядке возрастания
        for (int i : resultArray) { // 4. Выведите результат на экран
            System.out.printf("%d ", i);
        }
    }

    private static int[] removeElements(int[] allElements) {
        // считаем количество ненулевых значений
        int n = 0;
        for (int i : allElements) {
            if (i != 0) n++;
        }
        // создаём временный массив
        int[] tempArray = new int[n];
        // копируем ненулевые значения во временный массив
        int j = 0;
        for (int i : allElements) {
            if (i != 0)
                tempArray[j++] = i;
        }
        return tempArray;
    }

}
