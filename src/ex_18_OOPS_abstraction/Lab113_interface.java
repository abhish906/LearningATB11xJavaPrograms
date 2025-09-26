package ex_18_OOPS_abstraction;
import com.sun.jdi.event.BreakpointEvent;
public class Lab113_interface {
    public static void main(String[] args) {
        son1 s=new son1();
        s.money();
        System.out.println(s.a);
        System.out.println(s.b);
        m m1=new son1();
        System.out.println(m1.a);

    }
}

interface m{
    int a=10;
    void money();
}
interface f{
    int b=20;
    void money();
}
class son1 implements m,f{
    int c=30;
    int b=40;
    public void money(){

        System.out.println("Son's money");
    }
}
