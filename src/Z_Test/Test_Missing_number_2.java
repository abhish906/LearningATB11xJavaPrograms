package Z_Test;

import java.util.HashSet;
import java.util.Set;

public class Test_Missing_number_2 {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7,8,9};
        int sum=0;



        for(int a:arr)
        {
            sum=sum+a;
        }
        System.out.println(sum);

        int sum1=0;
        for(int i=0;i<=arr.length+1;i++)
        {
            sum1=sum1+i;
        }
        System.out.println(sum1);
        int miss_num=sum1-sum;
        System.out.println(miss_num);




    }
}
