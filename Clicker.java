import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Clicker extends JPanel implements MouseListener, MouseMotionListener {

   private int myWindowWidth = 300;
   private int myWindowHeight = 400;
   private int offset = 15;

   private int DragX = 0;
   private int DragY = 0;


   public Clicker() {
      JFrame myFrame = new JFrame();
      myFrame.setSize(myWindowWidth, myWindowHeight);
      myFrame.add(this);
      myFrame.setVisible(true);

      addMouseListener(this);
      addMouseMotionListener(this);
   }

   public void mouseMoved(MouseEvent e) {
   }

   public void mouseDragged(MouseEvent e) {
      DragX = e.getX();
      DragY = e.getY();
      repaint();

   };

   public void mouseClicked(MouseEvent e) {
      offset = offset + 15;
      repaint();
   }

   public void paintCircle(Graphics g, int x, int y) {
      g.drawOval(x / 2, y / 2, 30, 30);
   }

   public void paintComponent(Graphics g) {
      g.drawString("You're tickling me!", 10, offset);
      g.drawOval(DragX-10,DragY-10,20,20);
   }

   public void mouseReleased(MouseEvent event) {
   }

   public void mousePressed(MouseEvent event) {
   }

   public void mouseEntered(MouseEvent event) {
   }

   public void mouseExited(MouseEvent event) {
   }

   public static void main(String Args[]) {
      new Clicker();
   }

} // end Clicker
