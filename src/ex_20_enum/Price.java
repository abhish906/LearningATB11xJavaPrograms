package ex_20_enum;

public enum Price {

    choc(20),
    milk(30),
    cake(45);

    private int cost;
    Price(int cost)
    {
        this.cost=cost;
    }
   int getlocator()
   {
       return this.cost;
   }



}
