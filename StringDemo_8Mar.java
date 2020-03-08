class StringsDemo{
    public static void main(String args[]){
        String s = "Ram";  //-> 99
        String s2 = "Ram";   //-> 99
        String s3 = new String("Ram"); //-> 88
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s == s2);
        System.out.println(s == s3);  // compare memory location of s and s3
        System.out.println(s.equals(s3)); // compare value of s and s3
        
        System.out.println(s.charAt(2));
        char s_arr[] = s.toCharArray();
        System.out.println(s_arr);

        System.out.println(s.replace("a", "x"));
        System.out.println(s);

        // s[0];
        char a[] = {'R', 'a', 'm'};
        char c = a[0];
    } 
}