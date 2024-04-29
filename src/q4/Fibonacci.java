package q4;

public class Fibonacci {
    public static int calculafibo (int n) {
        if(n<=1){
            return 1;
        }
        int a=0;
        int b=1;
        int temp;

        for (int i=2;i<=n;i++)
        {
            temp = a + b;
            a = b;
            b=temp;
        }

        return b;
    }
}
