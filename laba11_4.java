import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import javax.swing.*;
public class laba11_4 extends JFrame{
    JButton I1;
    JLabel t1,t2,t3,t4,t5,t6,t7,t;
    JLabel b1,b2,b3,b4,b5,b6,b7,b;
    eWork kn = new eWork();
    public laba11_4 (String s) {
        super(s);
        setLayout(new FlowLayout());
        b1 = new JLabel("Число 1 ____");
        b2 = new JLabel("Число 2 ____");
        b3 = new JLabel("Число 3 ____");
        b4 = new JLabel("Число 4 ____");
        b5 = new JLabel("Число 5 ____");
        b6 = new JLabel("Число 6 ____");
        b7 = new JLabel("Число 7 ____");


        b = new JLabel("                      ");
        I1 = new JButton("Генерация чисел");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(I1);
        I1.addActionListener(kn);
    }
    public static void main(String[] args){
        laba11_4 g = new laba11_4("Запись/Вывод");
        g.setVisible(true);
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        g.setSize(160, 220);
        g.setResizable(false);
        g.setLocationRelativeTo(null);

    }
    public class eWork implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource()==I1) {
                    Random ran = new Random();

                    b1.setText("Число 1 - " + ran.nextInt(1000));
                    b2.setText(("Число 2 - " + ran.nextInt(1000)));
                    b3.setText(("Число 3 - " + ran.nextInt(1000)));
                    b4.setText(("Число 4 - " + ran.nextInt(1000)));
                    b5.setText(("Число 5 - " + ran.nextInt(1000)));
                    b6.setText(("Число 6 - " + ran.nextInt(1000)));
                    b7.setText(("Число 7 - " + ran.nextInt(1000)));
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(laba11_4.this, ""); }

        }
    }
}
