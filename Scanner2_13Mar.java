import java.util.Scanner;

class ScannerDemo2{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        if( scanner.hasNextInt() ){
            System.out.println("Number found!" + scanner.nextInt() );
        }
        if( scanner.hasNextBoolean() ){
            System.out.println("Number found!" + scanner.nextBoolean() );
        }
        if( scanner.hasNext() ){
            // hasNext will check if there is any word present in buffer or not, if word is found, true will be returned otherwise false
            System.out.println("Word found!" + scanner.next() );
        }

        scanner.close();
    }
}