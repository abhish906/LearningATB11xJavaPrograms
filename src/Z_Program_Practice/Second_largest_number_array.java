package Z_Program_Practice;

public class Second_largest_number_array {
    public static void main(String[] args) {
        int a[]={8,3,2,21,13,224,34,35};
        int max =a[0];
        int second=a[1];
        for(int i=0;i< a.length;i++)
        {
            if(a[i]> max)
            {
               // second=max;
                max =a[i];

            }
            else if (a[i]>second&&a[i]!=max)
            {
                second=a[i];
        }
        }
        System.out.println(max);
        System.out.println(second);
    }
}
