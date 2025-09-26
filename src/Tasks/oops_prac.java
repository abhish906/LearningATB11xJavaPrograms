package Tasks;

public class oops_prac {

    public static void main(String[] args) {

        Smartphone s=new Smartphone();
        s.display();
        Smartphone.airplanemode();
        Smartphone s1=new Smartphone(1,"APPlE","IPHONE16") ;
        s1.display();
        s1.features(8);
        s1.features("BLUE");
        s1.setquant(2);
        s1.setbrand("MI");
        s1.setmodel("Note 14");
        System.out.println(s1.getbrand());
        System.out.println(s1.getmodel());
        System.out.println(s1.getquant());

        System.out.println(Smartphone.simcard);
        s1.entercard();
        Smartphone s2=new Smartphone(2,"Samsung","S24Ultra");
        s2.features(16);
        s2.features("RED");
        s2.setquant(3);
        System.out.println(s2.getbrand());
        System.out.println(s2.getmodel());
        System.out.println(s2.getquant());
        s2.entercard();
        System.out.println(Smartphone.simcard);





    }
}
class Smartphone extends old_phone{

    //SIB
    static{
        System.out.println("SMARTPHONE SALE");
    }

    //IIB
    {
        System.out.println("Brand OFFERS");
    }
    //Default const
    Smartphone()
    {
        System.out.println("CHOOSE YOUR SMARTPHONE");
    }

    //Parameterised const
    Smartphone(Integer quant,String brand,String model)
    {
        this.quant=quant;
        this.brand=brand;
        this.model=model;
    }
    //Encapsulation
    private Integer quant;
    private String brand;
    private String model;
    static String simcard="Airtel Sim";


    public Integer getquant(){
        return quant;
    }
    public void setquant(Integer quant){
        this.quant=quant;
    }
    public String getbrand(){
        return brand;
    }
    public void setbrand(String  brand){
        this.brand=brand;
    }
    public String getmodel(){
        return model;
    }
    public void setmodel(String  model){
        this.model=model;
    }

    static void airplanemode(){
        System.out.println("Airplane Mode");
    }
// method overloading
    public void features(String color)
    {
        System.out.println("color = " + color );
    }
    public void features(int ram)
    {
        System.out.println("ram = " + ram);
    }


    // method overriding as it extends parent class methods
    void display(){
        System.out.println("Touch");
    }







}
class old_phone implements simcard{
    void display(){
        System.out.println("Button");
    }
    public void entercard(){
        System.out.println("SIM card is entered");
    }

}

interface simcard{
    void entercard();

}