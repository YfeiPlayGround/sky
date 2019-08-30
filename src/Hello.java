public class Hello {

    public static void main(String[] args) {
        int a = 1;
        int b = Integer.MAX_VALUE;

//        a = a ^ b;
//        b = a ^ b;
//        a = a ^ b;
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);



        Hello x = new Hello();
    }


}
