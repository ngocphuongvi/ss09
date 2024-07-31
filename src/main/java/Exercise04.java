import java.util.Arrays;
import java.util.Comparator;

public class Exercise04 {
    public static void main(String[] args) {
        String[] studentName = {"Hoa","Lan","Hai","Duong"};
//        Arrays.stream(arr).sorted();
        String[] sortedNameStrings= Arrays.stream(studentName).sorted().toArray(String[]::new);
        System.out.println("Mang chuoi sau khi sap xep theo bang chu cai: ");
        for(String name : sortedNameStrings){
            System.out.println(name);
        }

        String[] sortedNameStrings2 = Arrays.stream(studentName).sorted(Comparator.reverseOrder()).toArray(String[]::new);
        System.out.println("Mang chuoi sau khi sap xep nguoc bang chu cai: ");
        for(String name : sortedNameStrings2){
            System.out.println(name);
        }
    }
}
