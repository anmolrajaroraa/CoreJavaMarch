import java.util.Scanner;

class Loops{
    public static void main(String args[]){
        for(int i = 1; i <= 10; i++ ){

            if(i==5){
                System.out.println("Going to skip a step");
                continue;
            }

            System.out.println(i);
            
            // if(i == 5){
            //     break;
            // }
        }

        Scanner scanner = new Scanner(System.in);

        // int i = scanner.nextInt();
        // while (i < 10){
        //     System.out.println("I is " + i);
        //     i = scanner.nextInt();
        // }

        int j;
        // do{
        //     j = scanner.nextInt();
        //     System.out.println("J is " + j);
        // }while(j < 10);

        while(true){
            j = scanner.nextInt();
            System.out.println("J is " + j);
            if(j == 100){
                break;
            }
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