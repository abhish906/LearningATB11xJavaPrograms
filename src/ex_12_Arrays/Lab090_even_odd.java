package ex_12_Arrays;

public class Lab090_even_odd {
    public static void main(String[] args) {
        int a[]={88,87,67,78,98,67,92,96,85};
        System.out.print("Even Numbers = ");

        for(int n:a) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }
        System.out.print("\nOdd Numbers = ");
            for(int n:a) {

                if (n % 2 != 0) {
                    System.out.print(n + " ");
                }
        }
    }
}
