import java.awt.*;
public class awt1 extends Frame{
    awt1(){
        Frame f=new Frame();
        Label l= new Label ("Emplyee id: ");
        Button b = new Button("Submit");
        TextField t= new TextField();
        l.setBounds(20, 80, 80, 30);
        t.setBounds(20, 100, 800, 30);
        b.setBounds(100, 100, 80, 30);
        f.add(b);
        f.add(l);
        f.add(t);
        f.setSize(400, 300);
        f.setTitle("EMployee");
        f.setLayout(null);
        f.setVisible(true);
    
    }
    public static void main(String[] args) {
        awt1 obj=new awt1();
        
    }
}
      