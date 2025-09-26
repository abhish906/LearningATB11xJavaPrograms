package ex_12_Arrays;

public class Lab082_array_1 {

    public static void main(String[] args) {
        int [] a={3,4,5,2,9};
        System.out.println(a[0]);
        System.out.println(a[3]);
        System.out.println(a.length);

        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }

        }
        System.out.println(max);

        int [] b=new int[4];// fixed size array
        b[0]=34;
        b[1]=23;
        b[2]=35;
        b[3]=76;




        System.out.println(b[0]);

    }
}
