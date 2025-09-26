package ex_15_OOPS_Inheritance;

public class Lab109_Single_Inheritance {

    public static void main(String[] args) {
        Father f1=new Father();
        f1.genetics();
        f1.property();
        Son s1= new Son();
        s1.hairs();
        s1.genetics();
        s1.sons_property();
        s1.property();

    }
}
class Father{
    void property()
    {
        System.out.println("1bhk");
    }

    void genetics()
    {
        System.out.println("Genes");
    }

}
class Son extends Father{
    void sons_property()
    {
        System.out.println("2bhk");
    }

    void hairs(){
        System.out.println("hairs");
    }


}

