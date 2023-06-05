import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your heart's desire:\n");
        Scanner input = new Scanner(System.in);
        String userDesire = input.nextLine();
        System.out.println("You entered: " + userDesire);
        if (StringUtils.isNumeric(userDesire)){
            System.out.println(userDesire + " is a numberrr");
        } else {
            System.out.println(userDesire + " is not a numberrr");
        }
        System.out.println("Your desire in swapCase: " + StringUtils.swapCase(userDesire));
        System.out.println("Your string reversed: " + StringUtils.reverse(userDesire));
    }
}