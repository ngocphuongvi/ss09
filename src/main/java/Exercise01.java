import java.util.Arrays;

public class Exercise01 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int max = Arrays.stream(numbers).max().getAsInt();
        System.out.println("So lon nhat trong mang la: "+max);
    }
}
