public class example2D {
    public static void main(String[] args) {
        int [][] arr = { {1, 2 , 3}, {4, 5, 6}};
        System.out.println(arr[0][0]); // output is 1
        System.out.println(arr[0][1]);// output is 2
        System.out.println(arr[0][2]);// output is 3
        System.out.println(arr[1][0]);;// output is 4
        System.out.println(arr[1][1]); // outpus is 5
        System.out.println(arr[1][2]); // output is 6
        arr[1][0] = 10;
        System.out.println("New value" + arr[1][0]);

        // print the rest of the items

    }
}
