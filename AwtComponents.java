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
        List ls=new List(5);
        ls.setBounds(380,50,80,50);
        Scrollbar s=new Scrollbar();
        s.setBounds(225,50,50,100);
        Panel p=new Panel();
        p.setBounds(150,150,50,50);
        p.setBackground(Color.gray);
        MenuBar mb=new MenuBar();
        Menu m=new Menu("Menu");
        Menu sm=new Menu("Submenu");
        MenuItem i1=new MenuItem("DOSA");
        MenuItem i2=new MenuItem("IDLY");
        MenuItem i3=new MenuItem("POORI");
        MenuItem i4=new MenuItem("BIRIYANI");
        MenuItem i5=new MenuItem("NON-VEG");
        m.add(i1);
        m.add(i2);
        m.add(i3);
        sm.add(i4);;
        sm.add(i5);
        m.add(sm);
        mb.add(m);
        setMenuBar(mb);
        ch.add("1");
        ch.add("10");
        ch.add("100");
        ch.add("1000");
        ls.add("MSD");
        ls.add("RS");
        ls.add("VK");
        ls.add("RJ");
        ls.add("JB");
        add(p);
        add(ch);
        add(l);
        add(tf);
        add(b);
        add(c);
        add(c1);
        add(ls);
        add(s);
        setSize(500,500);
        setTitle("Button Example");
        setLayout(null);
        setVisible(true);   
     }
     public static void main(String[] args){
    AwtComponents comp=new AwtComponents();
}
}