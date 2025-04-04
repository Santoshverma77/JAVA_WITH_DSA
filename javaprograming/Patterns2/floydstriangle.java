

public class floydstriangle {

    public static void logic(int row )
    {
        int count=1;
        for(int i=1;i<=row;i++)
        {

            for(int j=1;j<=i;j++)
            {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int row=7;
        logic(row);
    }
}
