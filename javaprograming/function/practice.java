import java.util.Scanner;

public class practice {

    public static void palindrom(int n ){
        int l=0;
        int p=0;
        for(int i =1;i<=n-1;i++)
        {
            l= n%10;
            n=n/10;
            System.out.print(l);
        }
    }
    public static void main(String[] args) {
       palindrom(12673);

    }
}