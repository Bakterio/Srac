import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class okynko implements WindowListener {
    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        for(int i = 0; i < 10; i++){
            srac.startovat();
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {
        for(int i = 0; i < 10; i++){
            srac.startovat();
        }
    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
