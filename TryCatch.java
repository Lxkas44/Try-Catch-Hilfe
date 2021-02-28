import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TryCatch{
    public TryCatch(){
        JFrame frame = new JFrame("TryCatch");
        JPanel panel = new JPanel(new GridLayout(1,0));
        frame.add(panel);
        JButton button = new JButton("Try Catch");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try{
                    int[] array = new int[5];
                    int tom = array[10];
                }
                catch(Exception a){
                   JOptionPane.showMessageDialog(null, "Du Hurensohn funzt nicht!!1!1!");      
                }
            }
        });
        panel.add(button);
        
        frame.setPreferredSize(new Dimension(300,300));
        frame.pack();
        frame.setVisible(true);    
    }
}
