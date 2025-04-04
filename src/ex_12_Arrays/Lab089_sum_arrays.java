package ex_12_Arrays;

public class Lab089_sum_arrays {
    public static void main(String[] args) {
        int a[]={88,87,67,78,98,67};
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println(sum);
        int add=0;


        for(int n:a)
        {
            add=add+n;
        }
        System.out.println(add);
    }
}
