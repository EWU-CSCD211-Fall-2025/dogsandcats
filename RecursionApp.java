
public class RecursionApp {

    public static void main(String[] args) {

        int n = 5;

        int res = f(n);
        System.out.println("f(" + n + ") = " + res);

        int res2 = f2(n);
        System.out.println("f2(" + n + ") = " + res2);

    }

    public static int f(int n) {
        int res = 1;

        for (int i = 1; i <= n; i++) {
            res = res * i;
        }

        return res;

   }

   public static int f2(int n) {
       if (n == 1) {
           return 1;
       }

       return n * f2(n);

   }
}
