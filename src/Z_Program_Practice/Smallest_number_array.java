package Z_Program_Practice;

public class Smallest_number_array {
    public static void main(String[] args) {
        int a[]={8,3,2,21,13,224,34};
        int min=a[0];
        for(int i=0;i< a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println(min);
    }
}
