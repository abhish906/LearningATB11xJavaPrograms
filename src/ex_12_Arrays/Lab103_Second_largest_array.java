package ex_12_Arrays;

public class Lab103_Second_largest_array {
    public static void main(String[] args) {
        int a[]={3,8,9,10,10,12,11,12};
        int max=a[0];
        int second=a[1];
        for (int i=0;i<a.length;i++)
        {
            if (a[i]>max)
            {
                second=max;
                max=a[i];
            }
            else if(a[i]>second && a[i]!=max)
            {
                second=a[i];
            }
        }
        System.out.println(second);
    }
}
