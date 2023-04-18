import java.util.Scanner;
public class SumTo {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number");
        int answer = reader.nextInt();


        int i=1;
        int sumTotal = 0;
        while (i <= answer ){
            System.out.println(i + " ");
            sumTotal = sumTotal + i;
            i++;
        }
        System.out.println("Sum total is " + sumTotal);
    }
}

