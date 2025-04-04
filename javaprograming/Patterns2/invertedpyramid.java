

public class invertedpyramid {
public static void logic(int row)
{
    for(int i=1;i<=row;i++)
    {
        for(int j=1;j<=row-i;j++)
        {
            System.out.print(j);
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        int row=10;
        logic(row);
    }
}
