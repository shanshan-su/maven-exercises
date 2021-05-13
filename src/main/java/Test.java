import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.Scanner;

public class Test {
    public static String getUserInput() {
        System.out.print("Enter Something: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String flipCase(String input) {
        return StringUtils.swapCase(input);
    }

    public static boolean isNumeric(String input) {
        return NumberUtils.isCreatable(input);
    }

    public static void main(String[] args) {
        String userInput = getUserInput();
        System.out.printf("You enterd: %s\n", userInput);

        if (isNumeric(userInput)) {
            System.out.printf("\"%s\" is a number\n", userInput);
        } else {
            System.out.printf("\"%s\" is not a number\n", userInput);
        }

        String flipped = flipCase(userInput);
        System.out.printf("Flipped Case: %s\n", flipped);

        String reversed = StringUtils.reverse(userInput);
        System.out.printf("Reversed: %s\n", reversed);
    }
}
