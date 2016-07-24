package Circle;

class Circle {
    private double r;

    public Circle (double radius){
        r = radius;
    }

    public double getS(){
        return Math.PI * r * r;

    }
}
