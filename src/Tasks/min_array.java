package Tasks;

public class min_array {
    public static void main(String[]args)
    {
        int[] num={54,34,23,11,98};
        int min=num[0];
        for(int i=0;i<num.length;i++)
        {
            if(num[i]<min)
            {
                min=num[i];
            }
        }
        System.out.println(min);
    }
}
