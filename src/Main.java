public class Main {
    public static void main(String[] args) {
        /*
        [A]: !(!(!(false ^ false) || (true && true)))
        [B]: considering that x=3 and y=2: !((x * y) <= 6) && (x - y != 1)
         */

        //A True
        boolean A =!(!(!(false ^ false) || (true && true)));
        //B False
        int x=3;
        int y=2;
        boolean B= !((x * y) <= 6) && (x - y != 1);

        System.out.println("A is "+A);
        System.out.println("B is "+B);
    }
}