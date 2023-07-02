import javax.swing.*;  
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;
public class CheckBoxExample1 extends JFrame implements ActionListener{  
    JLabel l,l1,l2,l3,l4,l5,lb,l6,la,lc;  
    JCheckBox cb1,cb2,cb3,cb4,cb5,cb6;  
    JButton b;  
    JTextField t1,t2,t4,t5,t6;
    JRadioButton r1,r2;
    CheckBoxExample(){
lc=new JLabel("CONTACT NO. :");lc.setBounds(450,300,150,20);
t6=new JTextField("       ");t6.setBounds(600,300,150,20);
la=new JLabel("SECTION :");la.setBounds(450,470,150,20);
l6=new JLabel("PASSWORD :");l6.setBounds(450,250,150,20);
t5=new JTextField("      ");t5.setBounds(600,250,150,20);
l3=new JLabel("LIBRARY MANAGEMENT SYSTEM");l3.setFont(new Font("Courier", Font.BOLD,35));l3.setBounds(400,10,600,90);
l2=new JLabel("The Available Books are: ");l2.setBounds(450,520,150,10);
l=new JLabel("STUDENT NAME :"); l.setBounds(450,100,150,20);
t1=new JTextField("       ");t1.setBounds(600,100,150,20);
l1=new JLabel("STUDENT ID :");l1.setBounds(450,150,150,20);
t2=new JTextField("            ");t2.setBounds(600,150,150,20);
l4=new JLabel("STUDENT EMAIL:");l4.setBounds(450,200,150,20);
t4=new JTextField("     ");t4.setBounds(600,200,150,20);
l5=new JLabel("GENDER :");l5.setBounds(450,350,80,20);
r1= new JRadioButton("Male");r1.setBounds(450,370,100,20);
r2=new JRadioButton("Female");r2.setBounds(650,370,100,20);
lb=new JLabel("BRANCH :");lb.setBounds(450,420,150,20);
JComboBox j=new JComboBox();

j.addItem("CSE");
j.addItem("IT");
j.addItem("ECE");
j.addItem("EEE");
j.addItem("MBA");
j.setBounds(600,420,150,20);
JComboBox a=new JComboBox();
a.addItem("A");
a.addItem("B");a.addItem("C");a.addItem("D");a.addItem("E");a.addItem("F");
a.setBounds(600,470,150,20);

      cb1=new JCheckBox("Java");  
        cb1.setBounds(480,530,150,20);  
        cb2=new JCheckBox("python");  
        cb2.setBounds(480,550,150,20);  
        cb3=new JCheckBox("DBMS");  
        cb3.setBounds(480,570,150,20);
          cb4=new JCheckBox("COA");  
        cb4.setBounds(480,590,150,20);
          cb5=new JCheckBox("DAA");  
        cb5.setBounds(480,610,150,20);
        cb6=new JCheckBox("P&S");  
        cb6.setBounds(480,630,150,20);
         b=new JButton("Enter");  
        b.setBounds(650,650,80,30);  
        b.addActionListener(this);  
         add(l3);add(l); add(t1);add(l1);add(t2); add(l2);add(l4);add(t4);add(l6);add(t5);add(lc);add(t6);add(a);add(la);add(l5); add(r1);add(r2);add(lb);add(j);add(cb1);add(cb2);add(cb3);add(cb4);add(cb5);add(cb6);add(b);  
       setSize(1370,1370);  

        setLayout(null);  
        setVisible(true);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
    public void actionPerformed(ActionEvent e){  
        int count=0;  
        String msg="";
msg+="selected books are:\n";  
        if(cb1.isSelected()){  
            count+=1;  
            msg="Java \n";
             
        }  
        if(cb2.isSelected()){  
            count+=1;  
            msg+="Python \n";
        }  
        if(cb3.isSelected()){  
            count+=1;  
            msg+="DBMS \n";
        }  
 if(cb4.isSelected()){  
            count+=1;  
            msg+="COA \n";
        }  
 if(cb5.isSelected()){  
            count+=1;  
            msg+="DAA \n";  
        }  
 if(cb6.isSelected()){  
            count+=1;  
            msg+="P&S \n";  
        }  
        msg+="-----------------\n";  
        JOptionPane.showMessageDialog(this,msg+"Number of books: "+count);  
    }  
    public static void main(String[] args) {  
        new CheckBoxExample();  
    }  
}
