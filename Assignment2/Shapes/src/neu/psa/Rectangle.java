package neu.psa;

public class Rectangle extends Shape{
    //fields
    float width;
    float height;

    //getters and setters
    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    //Constructors
    public Rectangle(String name, String color,float width, float height) {
        this.color = color;
        this.name = name;
        this.width = width;
        this.height = height;
    }
    public Rectangle(String name, String color, float side) {
        super(name, color);
        this.width = side;
        this.height = side;
    }
    public Rectangle(float side) {
        this.width = side;
        this.height = side;
    }

    //override methods
    @Override
    public float getArea() {
        return width * height;
    }

    @Override
    public float getPerimeter(){
        return 2*(width + height);
    }

    @Override
    public String printShape() {
        return ("This rectangle is " +this.color+ " color" );
    }
}
