import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.*;
import javax.swing.*;
public class laba11_2 extends JFrame{
    JButton zap,viv;
    JTextField t2,name,tham,otch,date,group;
    JLabel b1,b2,name1,tham1,otch1,date1,group1;
    String text,put;
    eWork kn = new eWork();
    public laba11_2 (String s) {
        super(s);
        setLayout(new FlowLayout());
        name1 = new JLabel("Введите имя");
        tham1 = new JLabel("Введите фамилию");
        otch1 = new JLabel("Введите отчество");
        date1 = new JLabel("Введите дату рождения");
        group1 = new JLabel("Укажите учебную группу");
        b2 = new JLabel("Введите адрес файла ");
        t2 = new JTextField(30);
        name = new JTextField(30);
        tham = new JTextField(30);
        otch = new JTextField(30);
        date = new JTextField(30);
        group = new JTextField(30);
        b1 = new JLabel("                      ");
        viv = new JButton("Вывод");
        zap = new JButton("Запись");

        add(b2);
        add(t2);
        add(name1);
        add(name);
        add(tham1);
        add(tham);
        add(otch1);
        add(otch);
        add(date1);
        add(date);
        add(group1);
        add(group);

        add(zap);
        add(viv);
        add(b1);

        zap.addActionListener(kn);
        viv.addActionListener(kn);
    }
    public static void main(String[] args){
        laba11_2 g = new laba11_2("Студент");
        g.setVisible(true);
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        g.setSize(500, 250);
        g.setResizable(false);
        g.setLocationRelativeTo(null);

    }
    public class eWork implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource()==zap) {
                    text =
                            name.getText()+"\s"
                                    +tham.getText()+"\s"+otch.getText()+"\s"+date.getText()+"\s"+group.getText();
                    put = t2.getText();
                    File file=new File(put);
                    try {
                        FileWriter fwrite = new FileWriter(file);
                        fwrite.write(text);
                        fwrite.close();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }

                    b1.setText("Запись произошла успешно");
                } else if (e.getSource() == viv) {
                    put = t2.getText();
                    File file=new File(put);
                    BufferedReader fread = new BufferedReader(new FileReader(file));
                    text = fread.readLine();
                    b1.setText("Вывод записи:\s"+text);

                }

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Aдрес или текст введен(ы) неправильно"); }

        }
    }
}
