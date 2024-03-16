/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package managemusic;

/**
 *
 * @author aaron
 */
public class ManageMusic {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // Instantiate the MusicGUI class
        ManageMusicGUI ManageMusicGUI = new ManageMusicGUI();
        
        // Make the GUI visible
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ManageMusicGUI.setVisible(true);
            }
        });
    }
}
