package ex_15_OOPS_Inheritance.Single_inheritance;

public class Real_Single_inheritance {
    public static void main(String[] args) {
        Tc_1 t1=new Tc_1();
        t1.tc1();
        t1.start_browser();
        t1.read_excel_file();
        t1.close_browser();
        Tc_2 t2=new Tc_2();
        t2.tc2();
        t2.read_excel_file();
    }
}
