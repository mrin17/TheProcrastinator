
import java.awt.Color;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JOptionPane;
import javax.swing.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class SliderListener implements ChangeListener{
    
    public MainScreen m;
    
    public SliderListener() {
        
    }
    
    public SliderListener(MainScreen m) {
        this.m = m;
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        JSlider sld = (javax.swing.JSlider) e.getSource();
        int index = Integer.parseInt(sld.getName());
        //JOptionPane.showMessageDialog(m,""+index);
        //get task and change completion percent
        m.taskList.get(index).setCompletion(sld.getValue());
        //JOptionPane.showMessageDialog(m,m.taskList.get(index).completion);
        if (sld.getValue() == 100)
            sld.getParent().setBackground(Color.green);
        else
            sld.getParent().setBackground(Color.white);
    }
}
