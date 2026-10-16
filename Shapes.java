/** 
 * A simple graphics program
 */

import java.awt.*;
import javax.swing.*;

public class Shapes extends JPanel {

   private int myWindowWidth = 300;
   private int myWindowHeight = 400;

   public Shapes() {
      JFrame easel = new JFrame();		
      easel.setSize (myWindowWidth, myWindowHeight);
      easel.add (this);
      easel.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      easel.setVisible (true);
   }


   public void paintComponent (Graphics g) {
      OlympicRings(g);
   }

   public void Bullseye(Graphics g){
      for(int i = 300; i>0; i-=10){
            if(i%20 == 0)
               g.setColor(Color.red);
            else
               g.setColor(Color.black);
            g.fillOval((300-i)/2,(300-i)/2,i,i);
      }
   }

   public void OlympicRings(Graphics g){
      g.setColor(Color.black);
      g.drawOval(0,0,40,40);
      g.setColor(Color.yellow);
      g.drawOval(40,0,40,40);
      g.setColor(Color.blue);
      g.drawOval(80,0,40,40);
      g.setColor(Color.green);
      g.drawOval(20,25,40,40);
      g.setColor(Color.red);
      g.drawOval(60,25,40,40);
   }
   

   public static void main(String Args[]){
      new Shapes();
   }
}
