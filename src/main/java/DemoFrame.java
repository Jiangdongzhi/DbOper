import javax.swing.*;
import java.awt.*;

/**
 * Created by dorianns on 15/6/9.
 */
public class DemoFrame extends JFrame {
    private static final long serialVersionUID = 1L;

    class MyPanel extends JPanel {
        private static final long serialVersionUID = 1L;



        public void paint(Graphics graphics) {

            super.paint(graphics);

            Graphics g2d = (Graphics2D) graphics;

            g2d.setColor(Color.black);
            g2d.draw3DRect(0, 0, 400, 500, true);

            g2d.setColor(Color.cyan);
            g2d.fill3DRect(50, 50, 300, 400, true);

            g2d.setColor(Color.red);
            g2d.fill3DRect(100, 100, 200, 300, true);

            g2d.setColor(Color.green);
            g2d.fill3DRect(150, 150, 100, 200, true);

            g2d.setColor(Color.pink);
            g2d.fill3DRect(200, 200, 0, 100, true);

            g2d.setColor(Color.orange);
            g2d.fillPolygon(new int[]{1, 100, 100, 300, 200, 100}, new int[]{1, 200, 400, 300, 100, 100}, 6);
        }

    }

    public DemoFrame() {

        this.add(new MyPanel());

        this.setSize(800, 600);

    }



    public static void main(String[] args) {

        DemoFrame frame = new DemoFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

    }

}
