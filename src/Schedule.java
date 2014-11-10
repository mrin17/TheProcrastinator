
import java.util.ArrayList;
import java.awt.Color;
import java.awt.GridLayout;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class Schedule extends javax.swing.JDialog {

    public MainScreen m;
    public Listener l;
    /**
     * Creates new form Schedule
     */
    public Schedule(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        m = (MainScreen) parent;
        l = new Listener(this, m);
        reformat();
    }
    
    //COPIED THIS METHOD FROM MAINSCREEN, edit it if you edit the one in mainscreen
    public void displayTask(Task nTask, int where) {
        JPanel taskPanel = new JPanel();
        SimpleDateFormat formatter = new SimpleDateFormat( "MM/dd/yyyy" );
        taskPanel.setName("" + where); //starts at 1 because we added the task already
        JLabel txt = new JLabel(nTask.name);
        JLabel startdate = new JLabel(formatter.format(nTask.startdate));
        JLabel duedate = new JLabel("Due: "+nTask.duedate);
        JButton button = new JButton();
        button.setName("" + where); //starts at 1 because we added the task already
        button.setText("Edit");
        button.addActionListener(l);
        JLabel times = new JLabel();
        txt.setSize(50, 10);
        taskPanel.add(txt);
        taskPanel.add(startdate);
        taskPanel.add(times);
        taskPanel.add(button);
        taskPanel.add(duedate);
        taskPanel.setSize(182, 70);
        taskPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        txt.setText(nTask.name);
        String starttemptext = nTask.startdate.getHours() + ":" + nTask.startdate.getMinutes();
        String endtemptext = nTask.enddate.getHours() + ":" + nTask.enddate.getMinutes();
        if (nTask.startdate.getMinutes() < 10) {
            starttemptext = nTask.startdate.getHours() + ":0" + nTask.startdate.getMinutes();
        }
        if (nTask.enddate.getMinutes() < 10) {
            endtemptext = nTask.enddate.getHours() + ":0" + nTask.enddate.getMinutes();
        }
        times.setText(starttemptext + "-" + endtemptext);
        jPanel1.setSize(182, 50 * m.taskList.size());
        if (m.taskList.size() > 4) {
            jPanel1.setLayout(new GridLayout(m.taskList.size(), 1));
        } else {
            jPanel1.setLayout(new GridLayout(4, 1));
        }
        jPanel1.add(taskPanel);
        jPanel1.revalidate();
        jPanel1.repaint();
    }
    
    public void reformat() {
        jPanel1.removeAll();
        for (int i = 0; i < m.taskList.size(); i++) {
            displayTask(m.taskList.get(i), i);
        }
        jPanel1.revalidate();
        jPanel1.repaint();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spnScrollPane = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lblTasksToday = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setFocusable(false);
        jPanel1.setMaximumSize(new java.awt.Dimension(181, 32487));
        jPanel1.setPreferredSize(new java.awt.Dimension(181, 181));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 384, Short.MAX_VALUE)
        );

        spnScrollPane.setViewportView(jPanel1);

        lblTasksToday.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTasksToday.setText("Schedule");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spnScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(lblTasksToday)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTasksToday)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Schedule dialog = new Schedule(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTasksToday;
    private javax.swing.JScrollPane spnScrollPane;
    // End of variables declaration//GEN-END:variables
}
