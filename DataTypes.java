class DataTypes{
    public static void main(String args[]){
        byte a = 127;
        int aa = 127;
        byte b = -128;
        short c = -130;
        short d = 150;
        // short e = 50000;
        int e = 50000;

        byte x = (byte) 130;  //type casting

        short y = (short) 32770;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println("X is " + x);
        System.out.println("Y is " + y);
        byte m  = 10;  //primitive data type
        System.out.println("Byte min value is " + Byte.MIN_VALUE); //class
        System.out.println("Byte max value is " + Byte.MAX_VALUE);
        System.out.println("Short min value is " + Short.MIN_VALUE);
        System.out.println("Short max value is " +Short.MAX_VALUE);
        //Short
        //Integer
        //Long
    }
}