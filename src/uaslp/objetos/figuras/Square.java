package uaslp.objetos.figuras;
//CastilloPardoDiego
public class Square extends Shape{
    private double side;
    public Square(){
        super("Cuadrado");
    }
    public Square(double side){
        this();
        this.side=side;
    }
    public double getArea(){
        return Math.pow(side,2);
    }
    public double getPerimeter(){
        return side*4;
    }
    public double getSidesCount(){
        return 4;
    }
    public String toString() {
        return  "■";
    }
}