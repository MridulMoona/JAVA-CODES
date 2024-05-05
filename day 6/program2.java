import java.util.Scanner;

class Plate{
    int length;
    int width;
    public Plate(int length,int width){
        this.length = length;
        this.width =  width;
    }
    public void showDimensions(){
        System.out.println("Dimensions of Plate (in length and width): "+length+" "+width);
    }   
}

class Box extends Plate {
    int height;
    public Box(int length,int width,int height){
        super(length, width);
        this.height=height;
    }
    public void showDimensions(){
        super.showDimensions();
        System.out.println("height: " + height);
    }   
}

class Woodbox extends Box {
    int thick;
    public Woodbox(int length,int width,int height,int thick){
        super(length,width,height);
        this.thick=thick;
    }
    public void showDimensions(){
        super.showDimensions();
        System.out.println("Thick: " + thick);
    }
}

public class program2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter dimensions for Plate here");
        int Platelength = scanner.nextInt();
        int Platewidth = scanner.nextInt();
        
        System.out.println("Enter dimensions for Box here");
        int boxlength = scanner.nextInt();
        int boxwidth = scanner.nextInt();
        int boxheight = scanner.nextInt();
        
        System.out.println("Enter dimensions for Woodbox here");
        int Woodboxlength = scanner.nextInt();
        int Woodboxwidth = scanner.nextInt();
        int Woodboxheight = scanner.nextInt();
        int Woodboxthickness = scanner.nextInt();

        Plate plate = new Plate(Platelength, Platewidth);
        plate.showDimensions();

        Plate box = new Box(boxlength, boxwidth, boxheight);
        box.showDimensions();

        Plate woodbox = new Woodbox(Woodboxlength,Woodboxwidth,Woodboxheight,Woodboxthickness);
        woodbox.showDimensions();

        scanner.close();
    }
}