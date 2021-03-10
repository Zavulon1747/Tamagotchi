import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class PassTime {
    static final int DELAY = 1000;

    TimerTask timerTask = new TimerTask() {
        @Override
        public void run() {

        }
    };
    Timer timer = new Timer(, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (ActionsTamagotchi.fullness!=0&&ActionsTamagotchi.health!=0) {

            } else timer.stop()
        }
    });

}
