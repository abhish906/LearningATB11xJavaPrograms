package ex_18_OOPS_abstraction;

public class Lab112_abstract {
    public static void main(String[] args) {
        son s=new son();
        s.loan50k();
        s.loan25k();
        //Father f=new Father();/// for abstract class we can't create objects
        Father f1=new son();
        f1.loan25k();
        f1.loan50k();

    }
}

abstract class Father{
    abstract void loan50k();
    void loan25k(){
        System.out.println("25k loan");
    }
}

class son extends Father{
    @Override
    void loan50k() {
        System.out.println("50k loan");
    }
}