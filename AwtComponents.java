import java.awt.*;
public class AwtComponents extends Frame{
    AwtComponents(){
        Label l=new Label("MAKING A FORM");
        l.setBounds(80,80,100,80);
        TextField tf=new TextField("ENTER HERE");
        tf.setBounds(200,350,150,100);
        Choice ch=new Choice();
        ch.setBounds(200,250,50,80);
        CheckboxGroup cg=new CheckboxGroup();
        Checkbox c=new Checkbox("Choice",cg,true);
        c.setBounds(150,150,50,50);
        Checkbox c1=new Checkbox("ok",cg,false);
        c1.setBounds(180,200,50,50);
        Button b=new Button("SUBMIT");
        b.setBounds(50,50,50,50);
        ch.add("1");
        ch.add("10");
        ch.add("100");
        ch.add("1000");
        add(ch);
        add(l);
        add(tf);
        add(b);
        add(c);
        add(c1);
        setSize(500,500);
        setTitle("Button Example");
        setLayout(null);
        setVisible(true);   
     }
     public static void main(String[] args){
    AwtComponents comp=new AwtComponents();
}
}