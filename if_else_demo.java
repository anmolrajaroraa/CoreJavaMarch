import java.util.Scanner;

class IfElse{
    public static void main(String args[]){
        System.out.println("Enter an integer : ");

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if(a > 10){
            System.out.println("A is greater than 10");
        }
        else if(a == 10){
            System.out.println("A is equal to 10");
        }
        else{
            System.out.println("A is less than 10");
        }
    }
}