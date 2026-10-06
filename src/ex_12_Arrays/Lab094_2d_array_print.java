package ex_12_Arrays;

public class Lab094_2d_array_print {
    public static void main(String[] args) {
        int [][]a={{1,2,3,6},{4,5,6,12},{7,8,9,10},{10,11,12,14}};
        int length=a.length;
        int suml=0;
        int sumr=0;

        for(int i=0;i<a.length;i++)// here a.length will give the length of the row
        {
            for (int j=0;j<a.length;j++)// here a[i].length will give the length of the column
            {

                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }

        for(int i=0;i<length;i++) {
            for (int j = 0; j < length; j++) {

                if (i == j)
                    suml = suml + a[i][j];

                if (i + j == length - 1)
                    sumr = sumr + a[i][j];

            }
        }

        System.out.println(suml);
        System.out.println(sumr);


    }
}
