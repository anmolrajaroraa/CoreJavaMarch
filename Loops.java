import java.util.Scanner;

class Loops{
    public static void main(String args[]){
        for(int i = 1; i <= 10; i++ ){
            System.out.println(i);
        }

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        while (i < 10){
            System.out.println("I is " + i);
            i = scanner.nextInt();
        }
    }
}

// 1. i = 0
// 2. i < 10
// 3. System.out.println(i);
// 4. i++ => i = 1
// 5. i < 10
// 6. System.out.println(i);
// ....
// i++ => 10
// i < 10
// Loop finish