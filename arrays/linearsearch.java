

public class linearsearch {
    public static void search(int arr[] , int find )
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == find)
            {
                System.out.println("the element found at "+ i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { 4,5,2,8,6,98,9,4};
        int find = 98;
        search(arr,find);
        
    }
}
