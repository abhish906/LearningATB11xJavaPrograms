package Tasks;

public class Missing_number_array {
    public static void main(String []args)
    {
        int [] num={0,3,1,4,5,6,2,9,7,10};
        System.out.println(missing_number(num));

    }
    public static int missing_number(int[]arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];

        }
        int Actual_sum= (arr.length *(arr.length+1))/2;
        int Missing_number=Actual_sum-sum;
        return Missing_number;
    }


}
