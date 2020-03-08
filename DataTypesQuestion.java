/*

189313010391
long

1283
short
int
long

*/

class DataTypesQues{
    public static void main(String args[]){
        int a = 123;
        if(a >= Byte.MIN_VALUE && a <= Byte.MAX_VALUE){
            System.out.println("Byte");
        }

        int i = (int) 10.5;
        System.out.println(i);
        double d = 10.5;
        System.out.println(d);
        float f = (float) 10.5;
        System.out.println(f);
        float f2 = 10.5f;
        long l2 = 3579088689654346l;
        System.out.println(f2);
        System.out.println(l2);

        char c = '1'; // memory space taken - 1 byte in C/C++, 2 bytes in java
        System.out.println(c);
        // char name[] = {"r", "a", "k", "e", "s", "h"};
        String name = "Ram";
        System.out.println(name);
        String s = "true";

        boolean b = true;
        boolean b2 = false;

        char m = 'र';
        char n = '√';
        char o = 'ß';
        char p = 'ø';

        System.out.println("Values are " + m + n + o + p);

        /*
        Primitive data types
        byte
        short
        int
        long
        double
        float
        char
        boolean

        Reference data types
        String
        Wrapper classes - Integer, Byte, Short, Double, Float, Long, 
        Char, Boolean
        Classes - BigInteger, BigDecimal
        */

        // long l = (long) 23832928393823279976790679;

        String phone_no = "868585858585";
        String veryBigNo = "23832928393823279976790679";
        String veryBigNo2 = "23832928393823279976790679";
        System.out.println(veryBigNo + veryBigNo2);

    }
}