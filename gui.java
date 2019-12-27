import javax.swing.*;

import jdk.internal.org.jline.terminal.MouseEvent.Button;
class gui {   
    public static void main(String args[]) {      
        JFrame frame = new JFrame("Mi primera GUI");      
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        frame.setSize(300, 300);      
        Button JButton = newJButton("Presionar");      
        frame.getContentPane().add(JButton); // Agrega el botón al panel de contenido del marco     
        frame.setVisible(true);   
    }
}