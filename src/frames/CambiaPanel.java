/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;
import javax.swing.JPanel;
/**
 *
 * @author Max
 */
public class CambiaPanel {
    private JPanel panel1;
    private JPanel panel2;
    
    CambiaPanel(JPanel panel1, JPanel panel2){
        
        this.panel1 = panel1;
        this.panel2 = panel2;
        
        this.panel1.removeAll();
        this.panel1.revalidate();
        this.panel1.repaint();
        
        this.panel1.add(this.panel2);
        this.panel2.revalidate();
        this.panel2.repaint();
        
    }
    
    
}
