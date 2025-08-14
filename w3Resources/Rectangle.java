/*3. Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle. */


public class Rectangle {
    private double witdh , height;

    public Rectangle(double height, double witdh) {
        this.height = height;
        this.witdh = witdh;
    }

    public double getWitdh() {
        return witdh;
    }

    public void setWitdh(double witdh) {
        this.witdh = witdh;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double areaCalculate(){
        double area= witdh*height;
        return area;
    }

    public double perimeterCalculate(){
        double perimeter=2*(witdh+height);
    return perimeter;
    }
public static void main(String[] args) {

    Rectangle obj1= new Rectangle(11.3, 5.4);

    System.out.println(" area : " + obj1.areaCalculate());
    System.out.println(" perimeter : " + obj1.perimeterCalculate());
    
}


}
