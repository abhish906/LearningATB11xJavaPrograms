package Tasks;

public enum hexcode {
    red("hx0009"),
    blue("hx0192"),
    green("hx9303");

    private String color;
    hexcode(String color)
    {
        this.color=color;
    }
    String  getlocator() {
        return this.color;

    }

}
