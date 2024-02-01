import java.awt.*;
public class AwtComponents extends Frame{
    AwtComponents(){
        Button b=new Button("SUBMIT");
        b.setBounds(100,500,53,56);
        add(b);
        setSize(500,500);
        setTitle("Button Example");
        setLayout(null);
        setVisible(true);   
     }
     public static void main(String[] args){
    AwtComponents comp=new AwtComponents();
}
}
