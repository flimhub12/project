import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[]) {

        int value;

        int[] array = {10, 5, 21, 16, 11, 15};
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the searched value");
        value = input.nextInt();
        boolean isValueFound = false;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                isValueFound = true;
                index = i;

            }

        }

        if (isValueFound) {
            System.out.println(value + " is found at Index " + (index));
        } else {
            System.out.println(value + " is not in the list");
        }


    }
}
