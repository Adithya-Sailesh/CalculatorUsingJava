import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.lang.String;
public class Calculator implements ActionListener{
    String b="";
    int rs=0;
    JFrame jf;
    JLabel displayLabel;
    JButton bc,bm,ba,bd,bs,be,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    public Calculator(){
        jf=new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(300, 420);
        displayLabel=new JLabel();
        displayLabel.setBackground(Color.CYAN);
        displayLabel.setBounds(10, 20, 270, 100);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        b7=new JButton("7");
        b7.setBounds(20, 140, 50, 40);
        jf.add(b7);
        b8=new JButton("8");
        b8.setBounds(90, 140, 50, 40);
        jf.add(b8);
        b9=new JButton("9");
        b9.setBounds(160, 140, 50, 40);
        jf.add(b9);
        ba=new JButton("+");
        ba.setBounds(220, 140, 50, 40);
        jf.add(ba);
        //2nd row
        b4=new JButton("4");
        b4.setBounds(20, 200, 50, 40);
        jf.add(b4);
        b5=new JButton("5");
        b5.setBounds(90, 200, 50, 40);
        jf.add(b5);
        b6=new JButton("6");
        b6.setBounds(160, 200, 50, 40);
        jf.add(b6);
        bs=new JButton("-");
        bs.setBounds(220, 200, 50, 40);
        jf.add(bs);
        //3 rd row
        b1=new JButton("1");
        b1.setBounds(20, 260, 50, 40);
        jf.add(b1);
        b2=new JButton("2");
        b2.setBounds(90, 260, 50,40);
        jf.add(b2);
        b3=new JButton("3");
        b3.setBounds(160, 260, 50, 40);
        jf.add(b3);
        bm=new JButton("*");
        bm.setBounds(220, 260, 50, 40);
        jf.add(bm);
        //4th row
        bc=new JButton("clr");
        bc.setBounds(20, 320, 50, 40);
        jf.add(bc);
        b0=new JButton("0");
        b0.setBounds(90, 320, 50,40);
        jf.add(b0);
        be=new JButton("=");
        be.setBounds(160, 320, 50, 40);
        jf.add(be);
        bd=new JButton("/");
        bd.setBounds(220, 320, 50, 40);
        jf.add(bd);
        bm.addActionListener(this);
		bs.addActionListener(this);
		bd.addActionListener(this);
		ba.addActionListener(this);
		b9.addActionListener(this);
		b8.addActionListener(this);
		b7.addActionListener(this);
		b6.addActionListener(this);
		b5.addActionListener(this);
		b4.addActionListener(this);
		b3.addActionListener(this);
		b2.addActionListener(this);
		b1.addActionListener(this);
		b0.addActionListener(this);
		be.addActionListener(this);
		bc.addActionListener(this);
        displayLabel.setOpaque(true);
        jf.add(displayLabel);
        jf.setVisible(true);
    }
    public static void main(String arg[]) {
        new Calculator();}
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b0){
          displayLabel.setText(displayLabel.getText()+"0");
        }else if(e.getSource()==b1){
          displayLabel.setText(displayLabel.getText()+"1");
        }
        else if(e.getSource()==b2){
          displayLabel.setText(displayLabel.getText()+"2");
        }
        else if(e.getSource()==b3){
          displayLabel.setText(displayLabel.getText()+"3");
        }
        else if(e.getSource()==b4){
          displayLabel.setText(displayLabel.getText()+"4");
        }else if(e.getSource()==b5){
          displayLabel.setText(displayLabel.getText()+"5");
        }else if(e.getSource()==b6){
          displayLabel.setText(displayLabel.getText()+"6");
        }else if(e.getSource()==b7){
          displayLabel.setText(displayLabel.getText()+"7");
        }else if(e.getSource()==b8){
          displayLabel.setText(displayLabel.getText()+"8");
        }else if(e.getSource()==b9){
          displayLabel.setText(displayLabel.getText()+"9");
        }else if(e.getSource()==ba){
          displayLabel.setText(displayLabel.getText()+"+");
        }else if(e.getSource()==bs){
          displayLabel.setText(displayLabel.getText()+"-");
        }else if(e.getSource()==bm){
          displayLabel.setText(displayLabel.getText()+"*");
        }else if(e.getSource()==bd){
          displayLabel.setText(displayLabel.getText()+"/");
        }else if(e.getSource()==be){
          String str=displayLabel.getText();
          System.out.println("\n"+str);
          int a[]=new int[10];
          System.out.println("Hello");
          int n=str.length();
          int k=0;
          for(int i=0;i<n;i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
              String temp="";
              temp=temp+str.charAt(i);
              int m = Integer.parseInt(temp);
              a[k]=(int)m;
              k=k+1;
              }
            else{
              b=b+str.charAt(i);
              }rs=a[0];
          }
          for(int i=0;i<b.length();i++){
            if(b.charAt(i)=='+'){
              rs=rs+a[i+1];
            }else if(b.charAt(i)=='-'){
              rs=rs-a[i+1];
            }else if(b.charAt(i)=='*'){
              rs=rs*a[i+1];
            }else{
              rs=rs/a[i+1];
            }
          }
          displayLabel.setText("Result :"+rs);
        }
        else if(e.getSource()==bc){
          displayLabel.setText("");
        }
    }
}
