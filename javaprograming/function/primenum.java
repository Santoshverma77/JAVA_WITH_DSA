import java.util.Scanner;

public class primenum {

    public static boolean primecheck(int n) {
        boolean  primecheck = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
             primecheck=false;
                break;
            }

        }
    
}

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  number to check prime or not : ");
        int n = sc.nextInt();
       if( primecheck(n)){
        System.out.println("the number is prime ");
       }

        sc.close();
    }
}