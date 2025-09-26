package ex_22_Exception;

public class Lab119_exception_p3 {
    public static void main(String[] args) {
        // try with multiple catch
        try {
            int a=10/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
