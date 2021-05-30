import javax.swing.*;
import java.awt.*;
import java.net.URI;
import java.util.Random;

public class srac {
    private static int pocitadlo = 0;
    private static srac s = new srac();
    public static void main(String[] args){
        s.hlavni();
    }
    public void hlavni(){
            for (int i = 0; i < 50; i++) {
                startovat();
            }
            for(int i = 0; i < 3; i++){
                astley();
            }
    }
    public static void startovat(){
        Random rand = new Random();
        JFrame frame = new JFrame("Byl jsi napálen!!!" + pocitadlo);
        JPanel panel = new JPanel();
        frame.add(panel);
        frame.setLocation(rand.nextInt(1080), rand.nextInt(720));
        frame.setVisible(true);
        frame.setSize(rand.nextInt(500),rand.nextInt(700));
        frame.setResizable(false);
        frame.addWindowListener(new okynko());
        pocitadlo++;
    }
    private static void astley(){
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                desktop.browse(URI.create("https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}