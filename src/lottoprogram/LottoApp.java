/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottoprogram;

/**
 *
 * @author The Matrix
 */
public class LottoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // set welcome panel to visible
        welcomePane wPane = new welcomePane();
        wPane.setVisible(true);
        // set welcome panel to center of screen
        wPane.setLocationRelativeTo(null);
    }
    
}
