package neu.psa;

public class Square extends Shape {
    //fields
    float side;

    //getters and setters
    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    //Constructors
    public Square(float side){
        this.side = side;
    }

    public  Square(String name, String color, float side){
        super(name, color);
        this.side = side;
    }

    //override methods
    @Override
    public float getArea(){
        return side * side;
    }

    @Override
    public float getPerimeter(){
        return 4 * side;
    }

    @Override
    public String printShape(){
        return ("The square is "+ this.color );
    }
}
