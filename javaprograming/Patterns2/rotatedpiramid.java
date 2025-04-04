
public class rotatedpiramid {
    
public static void logic(int row )
{
    for(int i=1;i<=row;i++)
    {
        for(int j=1;j<=row-i;j++)
        {
            System.out.print(" ");
        }
        for(int p=1;p<=i;p++)
        {

            System.out.print("*");
        }
        System.out.println();
    }
}    public static void main(String[] args) {
        
int row=4;
logic(row);

    }
}
