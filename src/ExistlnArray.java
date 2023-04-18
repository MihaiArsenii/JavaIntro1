import java.util.Scanner;
public class ExistlnArray {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int [] numbers = {14, 10, 7, 33, 49};
        System.out.println(" Enter a Number: ");
        int answer = reader.nextInt();
        boolean isFound = false;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            if (answer == numbers[i]) {
                isFound= true;
            }
        }
        if(isFound) {
            System.out.println("Value " + answer + " found in array");
        }
        else {
            System.out.println("Value was not found in array");
        }




    }
}
