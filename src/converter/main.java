package converter;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author : Akshat Gupta      
 */

public class main extends JFrame implements ActionListener {

    private SpringLayout springLayout = new SpringLayout();

    private JButton btn_CFGCNF;

    public main(){

        super("Theory of Computation");
        setLayout(springLayout);
        setSize(500, 200);
        setVisible(true);
        setLocationRelativeTo(null);
        setButtons();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void setButtons(){

        btn_CFGCNF = new JButton("Convert CFG to CNF");
        btn_CFGCNF.setPreferredSize(new Dimension(300, 50));
        btn_CFGCNF.addActionListener(this);
        add(btn_CFGCNF);

        springLayout.putConstraint(SpringLayout.WEST, btn_CFGCNF, 100, SpringLayout.WEST, this);
        springLayout.putConstraint(SpringLayout.NORTH, btn_CFGCNF, 50, SpringLayout.NORTH, this);

    }

    private void closeFrame(){
        WindowEvent closingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closingEvent);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();

        if (button.equals("Convert CFG to CNF")) {
            new CFGtoCNF();
        }
    }

    public static void main(String[] args){

        main ms = new main();
    }


}
