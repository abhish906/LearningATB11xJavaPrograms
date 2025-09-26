package ex_21_Wrapper;

public class Lab116_wrapper_2 {
    public static void main(String[] args) {


        String a = "10";
        int b = 20;

        Integer a1 = Integer.parseInt(a);// String to wrapper and String to non -primitve
        Integer a2 = Integer.valueOf(a); //String to  wrapper
        System.out.println(a1);
        System.out.println(a2);


        Byte b1 = Byte.parseByte(a);// String to Byte(wrapper /non primitve
        Double d = Double.valueOf(a);
        Float f2= Float.parseFloat(a);//String to Fyte(wrapper /non primitve
        System.out.println(b1);
        System.out.println(d);

// String to primitive type
        int str = Integer.parseInt(a);//String to int
        long str2 = Long.parseLong(a);// String to long
        float str3 = Float.parseFloat(a);// String to float
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);

        // Wrapper to string
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(f2.toString());


        //  Primitive to string
        int age=30;
        Integer np=age;
        System.out.println(np.toString());




    }
}
