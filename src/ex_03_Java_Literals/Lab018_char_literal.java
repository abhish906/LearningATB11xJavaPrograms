package ex_03_Java_Literals;

public class Lab018_char_literal {
    public static void main(String[] args) {
        char c='C';// Only single quote is used for char eg,A to Z,a to z, #@$%^&*!(special char)
       // char d="D"; invalid as char uses only single quote
        char c2='@';
        char c3='&';
        char c4='9';
        char c5=' ';//blank space
        char c6='(';


        //Escape char
        char new_line='\n';// adds new line
        char tab_line='\t';// add tab
        char back_space='\b';// backspaces(deletes char)
        char carriage_return='\r';// deletes first word or sentence before it

        System.out.println("Abhishek"+ new_line +"Salekar");
        System.out.println("Abhishek"+ tab_line +"Salekar");
        System.out.println("Abhishek"+ back_space +"Salekar");
        System.out.println("Abhishek"+ carriage_return +"Salekar");
        System.out.println("Abhishek is good"+ carriage_return +"Salekar");
        System.out.println("Abhishek is not good \r cause Abhishek is the best");


        System.out.println("Hi,This is a first line \n this is a second line \n this is a third line");


        // unicode char
        char rupee='₹';
        System.out.println(rupee);














    }
}
