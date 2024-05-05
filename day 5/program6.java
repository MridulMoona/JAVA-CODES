public class program6 {
    private double length;
    private double breadth;

  
    public program6() {
        length = 0;
        breadth = 0;
    }


    public program6(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    public double calculateArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
      
        program6 defaultRectangle = new program6();
        System.out.println("Area of default rectangle: " + defaultRectangle.calculateArea());


        program6 customRectangle = new program6(5.0, 3.0);
        System.out.println("Area of custom rectangle: " + customRectangle.calculateArea());
    }
}