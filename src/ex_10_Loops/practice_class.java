package ex_10_Loops;

public class practice_class {
    public static void main(String[] args){
        int num=656;
        int sum=0;
        while(num!=0)
        {
            int digit=num%10;
            sum+=digit;
            num/=10;
        }
        System.out.println(sum);

}


}
