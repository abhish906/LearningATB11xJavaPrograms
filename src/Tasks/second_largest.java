package Tasks;

public class second_largest {

    public static void main(String[] args) {
        int [] a={3,4,2,1,1,2,5,6,9,8,11,15,13,10,19};
        int max=a[0];
        int second=a[1];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]> max)
            {
                second=max;
                max=a[i];
            }
            else if(a[i]>second && a[i] !=max){
                second=a[i];
            }
        }
        System.out.println(second);
    }
}
