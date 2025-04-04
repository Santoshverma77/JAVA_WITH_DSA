public class extra {

    public static void main(String[] args) {
        int n=5;
        int curr_num = 1;
        for(int row = 1; row<=n; row++) {
        int num_space = n - row;
        for(int j=1; j<=num_space; j++) {
        System.out.print("\t");
        }
        for(int j=1; j<=row; j++) {
        System.out.print(curr_num + "\t\t");
        curr_num++;
        }
        System.out.println("");
        }
    }
}




