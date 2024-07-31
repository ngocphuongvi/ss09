import java.util.Arrays;

public class Exercise05 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Cac so chan trong mang la: ");
        Arrays.stream(arr).filter(x -> x % 2 == 0).forEach(System.out::println);

        System.out.println("Cac so le trong mang la: ");
        Arrays.stream(arr).filter(x -> x % 2 == 1).forEach(System.out::println);

        System.out.println("Cac so lon hon 7 trong mang la: ");
        Arrays.stream(arr).filter(x -> x>7).forEach(System.out::println);
    }
}
