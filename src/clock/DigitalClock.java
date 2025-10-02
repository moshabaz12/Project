package clock;
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock extends JFrame implements Runnable {
    JLabel clockLabel, dateLabel;
    Thread t;

    DigitalClock() {
        // Clock Label
        clockLabel = new JLabel();
        clockLabel.setFont(new Font("Verdana", Font.BOLD, 40));
        clockLabel.setHorizontalAlignment(JLabel.CENTER);
        clockLabel.setForeground(Color.WHITE);

        // Date Label
        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        dateLabel.setHorizontalAlignment(JLabel.CENTER);
        dateLabel.setForeground(Color.YELLOW);

        // Panel with border
        JPanel panel = new JPanel(new GridLayout(2, 1));
        panel.add(clockLabel);
        panel.add(dateLabel);
        panel.setBackground(new Color(30, 30, 30)); // dark background
        panel.setBorder(BorderFactory.createLineBorder(Color.CYAN, 5, true));

        add(panel);
        setTitle("Digital Clock");
        setSize(450, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        try {
            while (true) {
                Date d = new Date();
                
                // Time format
                SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
                clockLabel.setText(timeFormat.format(d));
                
                // Day + Date format
                SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd MMMM yyyy");
                dateLabel.setText(dateFormat.format(d));

                Thread.sleep(1000); // update every 1 second
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new DigitalClock();
    }
}
