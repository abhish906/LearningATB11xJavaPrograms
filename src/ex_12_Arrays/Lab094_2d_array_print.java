package ex_12_Arrays;

public class Lab094_2d_array_print {
    public static void main(String[] args) {
        int [][]a={{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<a.length;i++)// here a.length will give the length of the row
        {
            for (int j=0;j<a[i].length;j++)// here a[i].length will give the length of the column
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
