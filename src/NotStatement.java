public class NotStatement {
    public static void main(String[] args) {
        String answer = "cold";
        if (!(answer.equals("Hot"))){
            System.out.println(" I will serve the food cold");
        }else{
            System.out.println("I will warm the food");
        }
    }
}
