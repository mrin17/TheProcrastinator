
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class Listener implements ActionListener{
    
    public MainScreen m;
    public Schedule s;
    
    public Listener() {
        
    }
    
    public Listener(Schedule s, MainScreen m) {
        this.m = m;
        this.s = s;
    }
    
    public Listener(MainScreen m) {
        this.m = m;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int index = Integer.parseInt(((javax.swing.JButton) e.getSource()).getName());
        //JOptionPane.showMessageDialog(m,""+index);
        m.newAddTaskIndex(index);
        if (s != null) {
            s.reformat();
        }
    }
}
