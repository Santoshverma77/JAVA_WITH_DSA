

public class zeroonetriangle {

    public static void logic(int row )
    {
        int count=1;
        for(int i=1;i<=row;i++)
        {

            for(int j=1;j<=i;j++)
            {
                System.out.print(count);
               if(count==0)
               {
                count=1;
               }
               else{count=0;}
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int row=7;
        logic(row);
    }
}
