import javax.swing.*;
import java.awt.*;
public class laba11_5 extends JFrame {
    public laba11_5 (String s){
        super(s);
        setSize(1000, 500);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 1, new float[]{5f, 5f}, 0f));
        g.setColor(Color.BLACK);
        //линии сетки по оси y
        g.drawLine(150, 50, 150, 455);
        g.drawLine(250, 50, 250, 455);
        g.drawLine(350, 50, 350, 455);
        g.drawLine(450, 50, 450, 455);
        g.drawLine(550, 50, 550, 455);
        g.drawLine(650, 50, 650, 455);
        g.drawLine(750, 50, 750, 455);
        g.drawLine(850, 50, 850, 455);
        g.drawLine(950, 50, 950, 455);
        //линии сетки по оси x
        g.drawLine(45, 50, 950, 50);
        g.drawLine(45, 100, 950, 100);
        g.drawLine(45, 150, 950, 150);
        g.drawLine(45, 200, 950, 200);
        g.drawLine(45, 250, 950, 250);
        g.drawLine(45, 300, 950, 300);
        g.drawLine(45, 350, 950, 350);
        g.drawLine(45, 400, 950, 400);
        g2d.setStroke(new BasicStroke(2));
        g.drawLine(50, 50, 50, 455);//ось y
        g.drawLine(45, 450, 950, 450);//ось x
        g2d.setStroke(new BasicStroke(4));
        g.setColor(Color.BLACK);
        //фигуры
        int[] x1 = {150, 100,  200, 250,  400,  450,  500,  350,  250, 150};
        int[] y1 = {400, 300,  75, 100,  300,  200,  325,  400,  200, 400};
        g.drawPolyline(x1, y1, x1.length);
        int[] x2 = {450,  550, 500, 600,700,  650, 800, 650, 450};
        int[] y2 = {400,  300, 150, 75, 100,  350, 350, 425, 400};
        g.drawPolyline(x2, y2, x2.length);
        //надписи
        g.setFont(new Font("Serif", Font.ROMAN_BASELINE, 14));
        g.drawString("-10", 40, 475);
        g.drawString("-8", 143, 475);
        g.drawString("-6", 243, 475);
        g.drawString("-4", 343, 475);
        g.drawString("-2", 443, 475);
        g.drawString("0", 546, 475);
        g.drawString("2", 646, 475);
        g.drawString("4", 746, 475);
        g.drawString("6", 846, 475);
        g.drawString("8", 946, 475);

        g.drawString("-8", 27, 453);
        g.drawString("-6", 27, 403);
        g.drawString("-4", 27, 353);
        g.drawString("-2", 27, 303);
        g.drawString("0", 27, 253);
        g.drawString("2", 27, 203);
        g.drawString("4", 27, 153);
        g.drawString("6", 27, 103);
        g.drawString("8", 27, 53);
    }
    public static void main(String args[]){
        new laba11_5("Фигуры");
    }
}
