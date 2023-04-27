import java.util.Arrays;

public class SwapMinAndMaxArrayElement {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, 8, 5};

        int indexOfMinElement = 0;
        int minValue = array[0];
        int indexOfMaxElement = 0;
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            if (current < minValue) {
                minValue = current;
                indexOfMinElement = i;
            }
            if (current > maxValue) {
                maxValue = current;
                indexOfMaxElement = i;
            }
        }
        int temp = array[indexOfMaxElement];
        array[indexOfMaxElement] = array[indexOfMinElement];
        array[indexOfMinElement] = temp;

        System.out.println(Arrays.toString(array));
    }
}
