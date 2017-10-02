public class Yavartamrinclass2 {
    public int d;

    public static void main(String[] args) {
//tamrine one
/////////////////////////////////////////

        //  Fib();

//////////////////////////////////////////

//        long N = 1;
//
//        for (int i = 1; ; i++) {
//            N = fibonacci(i);
//            if(N<1000)
//                System.out.println(N);
//            else
//                break;
//
//    }
//////////////////////////////////////////////tamrintwo
//        Scanner user_input = new Scanner( System.in );
//        String num;
//        System.out.print("Enter your Number: ");
//        num = user_input.next( );
//        if(palindrom(num))
//            System.out.print("is palindrom ");
//        else
//            System.out.print("is not palindrom ");
        /////////////////////////////////////////tamrinthree
//        if(power(64))
//            System.out.print("ok");
//        else
//            System.out.print("no");
        /////////////////////////////////////tamrinfour
//        chap();
/////////////////////////////////////////////tamrinfive

//        System.out.print(masahat(4));

        ///////////////////////////tamrinsix
//       star(9);
        ////////////////////////////////tamrinseven

//        System.out.println(fac(4));
//        System.out.println(factorial(4));


    }

    public static void Fib() {


        long f = 0, g = 1;

        for (int i = 1; f < 1000; i++) {

            f = f + g;

            g = f - g;

            if (f < 1000)

                System.out.println(f);
        }


    }


    public static long fibonacci(int n) {
        if (n <= 1) return n;

        else return fibonacci(n - 1) + fibonacci(n - 2);
    }


    public static boolean palindrom(String temp) {
        String ch = new StringBuilder(temp).reverse().toString();
        if (temp.compareTo(ch) == 0)
            return true;
        return false;
    }

    public static boolean power(int temp) {

        if ((temp & (temp - 1)) == 0)
            return true;
        return false;
    }


    public static void chap() {
        char ch = 'a';
        int ich = ch;
        for (int i = 0; i < 13; i++) {
            System.out.println((char) ich);
            ich = ich + 2;

        }

    }

    public static double masahat(double r) {
        return (3.14 * (r * r));
    }

    public static void star(int num) {
        for (int i = 1; i < num * 2; i = i + 2) {
            if (i <= num)
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            else
                for (int r = 1; r < (num - (i - num)) - 1; r++)
                    System.out.print("*");
            System.out.println("");
        }

    }


    public static double fac(double num) {
        long result = 1;

        while (num > 0) {

            result *= num;

            num--;

        }

        return result;

    }

    public static long factorial(int n) {

        if (n == 0)

            return 1;

        else

            return n * factorial(n - 1);

    }
}
