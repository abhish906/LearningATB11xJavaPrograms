package ex_12_Arrays;

public class Lab085_Max_Array {
    public static void main(String[] args) {
        int[] marks={79,69,87,95,84,92};
        int max=marks[0];

        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]>max)
            {
                max=marks[i];
            }

        }
        System.out.println(max);


    }
}
