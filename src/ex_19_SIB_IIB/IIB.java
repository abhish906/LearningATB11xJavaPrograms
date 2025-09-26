package ex_19_SIB_IIB;

public class IIB {
    public static void main(String[] args) {
        instance i=new instance();
        i.display();


    }
}
class instance{
    //IIB
    {
        System.out.println("HELLO1");
    }
    instance(){
        System.out.println("HELLO2");
    }
    void display()
    {
        System.out.println("HELLO3");
    }


}