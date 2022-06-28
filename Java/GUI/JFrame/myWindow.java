package GUI.JFrame;

import javax.swing.JFrame;

public class myWindow extends JFrame {
    
    public myWindow() {

        this.setTitle("Raflesh");
        this.setSize(800, 400);
    }

    public static void main(String[] args) {
        
        myWindow raflesh = new myWindow();
        raflesh.setVisible(true);
    }
}
