
// import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

class LoginS extends JFrame {  //in this we passed parent JFrame class to LoginS child class. so that's why yhey can directly access the member of JFrame class

    JLabel l1, l2, l3, l4,l5;
    JTextField t1;
    JPasswordField t2;
    JButton b1, b2, b3;

    LoginS(String s1) {  //
        super(s1);
    }

    LoginS() {

    }

    void setComponents() {
        // JLabel l1=new JLabel("welcome");
        // JTextField t1=new JTextField();
        // setLayout(null);
        //  l1.setBounds(200,300,150,30);
        //  t1.setBounds(200,200,100,30);
        //   add(t1);
        //  add(l1);
        Cursor c1 = new Cursor(Cursor.HAND_CURSOR);
        Cursor c2 = new Cursor(Cursor.WAIT_CURSOR);
        Font f1 = new Font("Times New Roman", Font.BOLD, 28);
        Font f2 = new Font("Calibri", Font.ITALIC, 20);
        l5=new JLabel();
        ImageIcon i1=new ImageIcon("C:/Users/deepa/Downloads/download.png");
        l5.setIcon(i1);

       
        l1 = new JLabel("Welcome to coding seekho");
        l1.setFont(f1);
        l1.setForeground(Color.blue);
        l2 = new JLabel("username");
        l2.setCursor(c2);
        l3 = new JLabel("password");
        l3.setFont(f2);
        l3.setForeground(Color.GREEN);
        l4 = new JLabel("");
        t1 = new JTextField();
        t2 = new JPasswordField();
        b1 = new JButton("Login");
        b1.setBackground(Color.red);
        b1.setForeground(Color.WHITE);
        b1.setCursor(c1);
        b2 = new JButton("Clear");
        b3 = new JButton("Add");

        setLayout(null);  // for fixing the layout of label and all
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        l1.setBounds(200, 50, 500, 70);
        l2.setBounds(100, 200, 100, 30);
        l3.setBounds(100, 350, 100, 30);
        l4.setBounds(100, 550, 100, 30);
         l5.setBounds(200, 10, 250, 250);
        t1.setBounds(350, 200, 100, 30);
        t2.setBounds(350, 350, 100, 30);
        b1.setBounds(200, 450, 100, 30);
        b2.setBounds(400, 450, 100, 30);
        b3.setBounds(500, 550, 100, 30);
        b1.addActionListener(new Log()); //it is an interface ka child isliye hme iska parent create krna pdega
        b2.addActionListener(new Clear());
        b3.addActionListener(new Add());
        l2.addMouseListener(new MouseL());

    }

   

    public static void main(String[] args) {
        LoginS s1 = new LoginS("Welcome to new world ");  //here object is created of LoginS class for accessing the member of JFrame
        // JFrame j1=new JFrame("Welcome IN Facebook");

        s1.setSize(800, 800);
        s1.setComponents();
        s1.setVisible(true);
        s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    class Log implements ActionListener {
        // LoginS loginRef;

        // Log(LoginS loginRef) {
        //     this.loginRef = loginRef;
        // }
        public void actionPerformed(ActionEvent e) {
            String s1 = t1.getText();
            String s2 = t2.getText();

            if (s1.equals("coding") && s2.equals("seekho")) {

                JOptionPane.showMessageDialog(null, "Login Successfully");
                //    l4.setText("Login Successful");
            } else {
                JOptionPane.showMessageDialog(null, "Login UnSuccessfully");
                //    l4.setText("Login Unsuccessful");
            }
        }
    }

    class Clear implements ActionListener {
        // LoginS loginRef;

        // Clear(LoginS loginRef) {
        //     this.loginRef = loginRef;
        // }
        public void actionPerformed(ActionEvent e) {
            t1.setText("");
            t2.setText("");
        }
    }

    class Add implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                 //in this t1 and t2  get string  for adding we done it conversion
                int a = Integer.parseInt(t1.getText()); 
                int b = Integer.parseInt(t2.getText());
                int c = a + b;
                l4.setText("Addition is" + c);
            } catch (Exception e2) {
                l4.setText("please enter a number only");
            }
        }
    }

     class MouseL implements MouseListener {

        public void mouseClicked(MouseEvent e1) //these all methods are used to override abstract method in abstract class mouse listener
        {

        }

        public void mouseEntered(MouseEvent e1) {
            l2.setForeground(Color.red);
        }

        public void mouseReleased(MouseEvent e1) {
            l2.setText("Username");
        }

        public void mousePressed(MouseEvent e1) {
            l2.setText("");
        }

        public void mouseExited(MouseEvent e1) {
            l2.setForeground(Color.black);
        }

    }
}
