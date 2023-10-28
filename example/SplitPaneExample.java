package example;

import java.awt.Color;

import javax.swing.*;

public class SplitPaneExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SplitPane Example");
               
        //Se crea componentes secundarios
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.GREEN);
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.ORANGE);
        
        //Creación de JSplitPane
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel);
       
        //Agrega el JSplitPane al contenedor principal:
        frame.add(splitPane);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
} 