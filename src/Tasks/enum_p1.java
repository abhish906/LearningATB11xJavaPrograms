package Tasks;

public class enum_p1 {
    public static void main(String[] args) {
        System.out.println(day.Friday);
        System.out.println(day.Tuesday);
        System.out.println(seasons.Winter);
        System.out.println(seasons.Summer);
        System.out.println(hexcode.red.getlocator());
    }
}
//enum (enumeration) is a datatype that is used to define collection of constants . it has fixed sets of value like weekdays, month
enum day{
   Monday,Tuesday,Wednesday,Thursday, Friday,Saturday,Sunday
}
enum seasons{
    Summer,Rainy,Winter
}