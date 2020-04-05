package converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author : Akshat Gupta
 *       
 */

public class main extends JFrame implements ActionListener {

    // you can choose your desired layout, in this class we use SpringLayout
    private SpringLayout springLayout = new SpringLayout();

    private JButton btn_CFGCNF;


    public main(){

        // initialize UI
        super("Theory of Computation");
        setLayout(springLayout);
        setSize(500, 200);
        setVisible(true);
        setLocationRelativeTo(null);
        setButtons();

        // close button will not terminate whole program
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void setButtons(){

        // add button navigates to Part 2
        btn_CFGCNF = new JButton("Convert CFG to CNF");
        btn_CFGCNF.setPreferredSize(new Dimension(300, 50));
        btn_CFGCNF.addActionListener(this);
        add(btn_CFGCNF);

        // place convert Part 2 button below NFA to RG button
        springLayout.putConstraint(SpringLayout.WEST, btn_CFGCNF, 100, SpringLayout.WEST, this);
        springLayout.putConstraint(SpringLayout.NORTH, btn_CFGCNF, 50, SpringLayout.NORTH, this);

    }

    // close the frame once button is hit.
    private void closeFrame(){
        WindowEvent closingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closingEvent);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();

        if (button.equals("Convert CFG to CNF")) {
//            closeFrame();

            // Modify codes below to your own part (class)
            new CFGtoCNF();
        }
    }

    public static void main(String[] args){

        main ms = new main();
    }


}
