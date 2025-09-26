package ex_23_Collection_DSA;

import java.util.ArrayList;

public class Lab126_nested_array {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Berry");
        fruits.add("Grapes");
        System.out.println(fruits);

        ArrayList<String> veggies =new ArrayList<String>();
        veggies.add("Capsicum");
        veggies.add("Beans");
        veggies.add("carrot");
        System.out.println(veggies);

        ArrayList<String> dairy=new ArrayList<String>();
        dairy.add("Milk");
        dairy.add("Cheese");
        dairy.add("Paneer");
        System.out.println(dairy);

        ArrayList basket=new ArrayList();
        basket.add(fruits);
        basket.add(veggies);
        basket.add(dairy);
        System.out.println(basket);



    }
}
