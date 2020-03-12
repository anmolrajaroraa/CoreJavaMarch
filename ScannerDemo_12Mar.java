import java.util.Scanner; 

class ScannerDemo{
    public static void main(String args[]){
        // buffer - storage of extra stuff
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        scanner.nextLine(); // is going to fetch the \n that was left in the buffer because of line 8
        String line = scanner.nextLine();
        int i = scanner.nextInt();
        float f = scanner.nextFloat();
        // String line2 = scanner.nextLine();

        System.out.println("Word is " + word);
        System.out.println("Line is " + line);
        System.out.println("i is " + i);
        System.out.println("f is " + f);
        // System.out.println("Line2 is " + line2);

        scanner.close();
    }
}

// \n
// my name is ram\n

// next() -> rakesh