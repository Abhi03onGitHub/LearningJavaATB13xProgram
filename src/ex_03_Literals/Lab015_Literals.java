package ex_03_Literals;

public class Lab015_Literals {

    public static void main(String[] args) {
        int age = 65; // 65

        // Binary Literal
        int binary_num = 0b1010; // Decimal System - 10

        // Octal base? -> 8
        int octal = 0101;

        // Hexadecimal Literals - 16
        int hex = 0Xface;
        //base 16 color combination are in hex - #28a745
        System.out.println("Values are - " + age);
        System.out.println("Values are - " + binary_num);
        System.out.println("Values are - " + octal);
        System.out.println("Values are - " + hex);


    }

}
