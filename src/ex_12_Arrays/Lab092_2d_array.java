package ex_12_Arrays;

public class Lab092_2d_array {
    public static void main(String[] args) {

        // 2d array= array of array in
        int [][] a= new int[3][3];
        a[0][0]=1;
        a[0][1]=2;
        a[0][2]=3;
        a[1][0]=4;
        a[1][1]=5;
        a[1][2]=6;
        a[2][0]=7;
        a[2][1]=8;
        a[2][2]=9;

        for (int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();


        }

        int [][]b={{1,2,3},{4,5,6},{7,8,9}};



    }
}
