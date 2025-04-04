import java.util.Scanner;

public class inputoutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int arr[] = new int[10];
        System.out.print("Enter marks of maths : ");
        arr[0]=sc.nextInt();
        System.out.print("Enter marks of chem : ");
        arr[1]=sc.nextInt();
        System.out.print("Enter marks of phy : ");
        arr[2]=sc.nextInt();

        System.out.println("here is your marks ");
        System.out.println("maths:"+arr[0] + " phy:"+arr[1]+" chem:"+arr[2]);

        System.out.println("also here is the lenght of your array "+ arr.length);

        // int input = sc.nextInt();

    }
}