package ex_05_Type_Casting;

public class Lab042_Type_Casting_Usage {
    public static void main(String[] args) {
        int fees=100;
        float gst=18.45f;

        int total1= fees + (int)gst; // Narrowing Explicit casting- Here data loss has happened
        System.out.println(total1);

        float total2= fees+ gst;//  Widening implicit casting has been done
        float total3=(float)fees+ gst;// Widening explicit casting

        System.out.println(total2);// Widening has been done no data loss occurs
        System.out.println(total3);






    }
}
