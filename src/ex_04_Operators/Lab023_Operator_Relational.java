package ex_04_Operators;

public class Lab023_Operator_Relational {
    public static void main(String[] args) {
        // < Less Than
        // < =  -> Less than or equal to
        // > Greater
        // > = Greater or equal
        // == ->  Equal to (but checking)
        // != -> Not equal

        // All of them will result boolean output.

        int a = 10;
        int b = 30;
        boolean c = a > b; // 10 >30
        System.out.println(c);

        int age_Abhinav = 33;
        int age_Priyanka = 34;
        boolean result = age_Priyanka >= age_Abhinav;
        System.out.println(result);

        // age_pramod > age_mamitha or age_pramod = age_mamitha
    }
}
