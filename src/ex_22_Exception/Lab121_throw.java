package ex_22_Exception;

public class Lab121_throw {
    public static void main(String[] args) throws Exception{
        int a=10;
        int b=0;
        try{
           if (a/b==0) {
               throw new wrongexception("Incorrect");
           }
        }
        catch (wrongexception e)
        {
            System.out.println(e.toString());
        }
        catch (ArithmeticException ae)
        {
            System.out.println(ae.toString());
        }
    }
}

class wrongexception extends Exception
{
    public wrongexception(String str)
    {
        super(str);
    }

}

