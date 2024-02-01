import java.awt.*;
public class AwtComponents extends Frame{
    AwtComponents(){
        TextField tf=new TextField("ENTER HERE");
        tf.setBounds(200,350,150,100);
        Choice ch=new Choice();
        ch.setBounds(200,250,50,80);
        Checkbox c=new Checkbox("Choice",true);
        c.setBounds(150,150,50,50);
        Button b=new Button("SUBMIT");
        b.setBounds(50,50,50,50);
        ch.add("1");
        ch.add("10");
        ch.add("100");
        ch.add("1000");
        add(ch);
        add(tf);
        add(b);
        add(c);
        setSize(500,500);
        setTitle("Button Example");
        setLayout(null);
        setVisible(true);   
     }
     public static void main(String[] args){
    AwtComponents comp=new AwtComponents();
}
}