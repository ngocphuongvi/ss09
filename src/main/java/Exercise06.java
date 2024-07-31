import java.util.Arrays;

public class Exercise06 {
    public static void main(String[] args) {
        String[] stuName={"Hong","Tran","Nhu","Y"};
        String[] uperCaseStrings= Arrays.stream(stuName).map(x->x.toUpperCase()).toArray(String[]::new);
        System.out.println("Mang chuoi chu in hoa: "+Arrays.toString(uperCaseStrings));
    }
}
