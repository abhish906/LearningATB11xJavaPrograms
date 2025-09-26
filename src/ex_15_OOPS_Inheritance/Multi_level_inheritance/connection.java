package ex_15_OOPS_Inheritance.Multi_level_inheritance;

public class connection {
    public static void main(String[] args) {
        Grandfather gf=new Grandfather();
        gf.gf();
        gf.home();
        Father f=new Father();
        f.f();
        f.home();
        f.gf();
        son s=new son();
        s.s();
        s.home();
        s.gf();
        s.f();

        System.out.println("--------------");

        Grandfather gf2=new Father();// dynamic dispatch
        gf2.home();
        Father f2=new son();
        f2.home();
        Grandfather gf3=new son();// bottom up approach from son to grandfather
        gf3.home();


    }
}
