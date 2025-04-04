package ex_12_Arrays;

public class Lab086_min_array {
    public static void main(String[] args) {
        int[] marks={79,69,87,95,84,92};
        int min=marks[0];

        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]<min)
            {
                min=marks[i];
            }

        }
        System.out.println(min);
    }
}
