package GUI.JFrame;

import javax.swing.JFrame;

public class JFrames {
    
    public static void main(String[] args) {
        
        // create window
        JFrame myWindow = new JFrame();

        // title
        myWindow.setTitle("JFrame");
        // size
        myWindow.setSize(800, 400);
        // show
        myWindow.setVisible(true);
    }
}
