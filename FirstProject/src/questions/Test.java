package questions;

class Test{

    // static int disp(){
    //     int x,y=10,z=10;
    //     x=(y==z);
    //     System.out.println(x);
    //     return 0;
    // }

    public static void main(String args[]){

        // int x = Test.disp();
        // System.out.println(x);
        //ans -> compilation error

        boolean var  = false;
        if(var = true){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
        //ans -> TRUE

        int k = 0;
        int n = 12;
        while(k < n){
            k = k + 1;
        }
        System.out.println(k);
        // ans -> 12


        char array_variable[] = new char[10];
        for(int i = 0; i < 10; ++i){
            array_variable[i] = 'i';
            System.out.print(array_variable[i] + " ");
            i++;
            ++i;
            // a = i++; //value will be assigned first then i will be incremented (post-inrement operator)
            // a = ++i; //first i will be incremented then value will be assigned (pre-increment operator)
            // a = 1+2+3;
        }

    // int arr[] = new int[5];

        int A[];
        int j = 0;
        A = new int[4];
        while (j < 4){
            A[j] = 10;
            j = j + 1;
        }


        double a = 295.04; //-> int -> 295 ->  byte 
//        295 - 127 = 168
//        -128 ..........    -1 (128 th value) -> 40 -> 0 ........ 40th value (39)
        int b = 300;
        byte c = (byte) a;  //around 50
        byte d = (byte) b; // around 50
        System.out.println(c + " " + d);
    }
}