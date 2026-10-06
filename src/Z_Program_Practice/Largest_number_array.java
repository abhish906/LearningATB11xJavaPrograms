package Z_Program_Practice;

public class Largest_number_array {
    public static void main(String[] args) {
        int a[]={8,3,2,21,13,224,34};
        int max=a[0];
        for(int i=0;i< a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
