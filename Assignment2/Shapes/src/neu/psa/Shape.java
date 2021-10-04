package neu.psa;

public class Shape {
    //fields
    String name;
    String color;
    float area;
    float perimeter;

    //getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(float perimeter) {
        this.perimeter = perimeter;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    //Constructors
    public Shape(){

    }

    public Shape(String name, String color){
        this.name = name;
        this.color = color;
    }

    public Shape(String name, String color, float area, float perimeter){
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
    }

    //Methods
    public String printShape(){
        return ("The " + this.name + " has " + this.color + " color");
    }
}
