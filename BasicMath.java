package BasicJavaMath;

import java.util.Arrays;

public class BasicMath {
    public static int sum(int[] numbers) {
        int sum = 0;
        for (int x : numbers) {
            sum += x;
        }
        return sum;
    }

    public static int median(int[] numbers) {
        int[] workingCopy = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(workingCopy);
        return workingCopy[workingCopy.length / 2];
    }
}
