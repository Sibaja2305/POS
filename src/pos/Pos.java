/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pos;

import Interface.FRMLogin;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Hp EliteBook
 */
public class Pos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        double width = screenSize.getWidth();
        double height = screenSize.getHeight();

        FRMLogin pos = new FRMLogin();

        pos.setBounds(0, 0, ((int) width), ((int) height));
        pos.setVisible(true);
    }
    
}
