package clock;
import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AnalogClock extends JPanel implements Runnable {
    Thread t = null;
    int hours = 0, minutes = 0, seconds = 0;
    String dateStr = "", dayStr = "";

    public void start() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        while (true) {
            repaint();
            try {
                Thread.sleep(1000); // update every 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Background gradient
        Graphics2D g2 = (Graphics2D) g;
        GradientPaint gp = new GradientPaint(0, 0, new Color(115, 155, 230), getWidth(), getHeight(), new Color(67, 18, 50));
        g2.setPaint(gp);
        g2.fillRect(0, 0, getWidth(), getHeight());

        Calendar cal = Calendar.getInstance();
        hours = cal.get(Calendar.HOUR);
        minutes = cal.get(Calendar.MINUTE);
        seconds = cal.get(Calendar.SECOND);

        Date d = new Date();
        SimpleDateFormat sdfDate = new SimpleDateFormat("dd MMM yyyy");
        SimpleDateFormat sdfDay = new SimpleDateFormat("EEEE");
        dateStr = sdfDate.format(d);
        dayStr = sdfDay.format(d);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2 - 30; 
        int radius = Math.min(centerX, centerY) - 30;

        g2.setStroke(new BasicStroke(8));

        // Unique border (double circle)
        g2.setColor(new Color(3, 3, 3));
        g2.drawOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);
        g2.setColor(new Color(255, 215, 0));
        g2.drawOval(centerX - radius - 10, centerY - radius - 10, 2 * radius + 20, 2 * radius + 20);

        // Numbers on clock
        g2.setFont(new Font("Arial", Font.BOLD, 18));
        g2.setColor(Color.WHITE);
        for (int i = 1; i <= 12; i++) {
            double angle = Math.toRadians(30 * i - 90);
            int x = (int) (centerX + (radius - 25) * Math.cos(angle));
            int y = (int) (centerY + (radius - 25) * Math.sin(angle));
            g2.drawString("" + i, x - 7, y + 7);
        }

        // Second ticks
        g2.setStroke(new BasicStroke(1));
        for (int i = 0; i < 60; i++) {
            double angle = Math.toRadians(6 * i - 90);
            int x1 = (int) (centerX + (radius - 5) * Math.cos(angle));
            int y1 = (int) (centerY + (radius - 5) * Math.sin(angle));
            int x2 = (int) (centerX + radius * Math.cos(angle));
            int y2 = (int) (centerY + radius * Math.sin(angle));
            g2.setColor(Color.LIGHT_GRAY);
            g2.drawLine(x1, y1, x2, y2);
        }

        // Hour hand
        double hourAngle = Math.toRadians((hours % 12 + minutes / 60.0) * 30 - 90);
        int hourX = (int) (centerX + (radius - 100) * Math.cos(hourAngle));
        int hourY = (int) (centerY + (radius - 100) * Math.sin(hourAngle));
        g2.setColor(new Color(255, 255, 255));
        g2.setStroke(new BasicStroke(5));
        g2.drawLine(centerX, centerY, hourX, hourY);

        // Minute hand
        double minuteAngle = Math.toRadians((minutes + seconds / 60.0) * 6 - 90);
        int minX = (int) (centerX + (radius - 60) * Math.cos(minuteAngle));
        int minY = (int) (centerY + (radius - 60) * Math.sin(minuteAngle));
        g2.setColor(new Color(50, 255, 100));
        g2.setStroke(new BasicStroke(3));
        g2.drawLine(centerX, centerY, minX, minY);

        // Second hand
        double secondAngle = Math.toRadians(seconds * 6 - 90);
        int secX = (int) (centerX + (radius - 40) * Math.cos(secondAngle));
        int secY = (int) (centerY + (radius - 40) * Math.sin(secondAngle));
        g2.setColor(Color.RED);
        g2.setStroke(new BasicStroke(2));
        g2.drawLine(centerX, centerY, secX, secY);

        // Center small circle
        g2.setColor(Color.WHITE);
        g2.fillOval(centerX - 6, centerY - 6, 12, 12);

        // Date and Day display
        g2.setFont(new Font("Verdana", Font.BOLD, 20));
        g2.setColor(Color.CYAN);
        g2.drawString(dayStr + ", " + dateStr, centerX - 100, centerY + radius + 40);

        // 💫 Stylish Name in Center Bottom
        g2.setFont(new Font("Serif", Font.BOLD, 26));
        g2.setColor(new Color(255, 223, 0)); // golden yellow
        String name = "By Shabaz";
        FontMetrics fm = g2.getFontMetrics();
        int nameWidth = fm.stringWidth(name);
        g2.drawString(name, centerX - nameWidth / 2, centerY + radius + 80);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Analog Clock with Date, Day & Name");
        AnalogClock clock = new AnalogClock();
        f.add(clock);
        f.setSize(500, 550);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        clock.start();
    }
}
