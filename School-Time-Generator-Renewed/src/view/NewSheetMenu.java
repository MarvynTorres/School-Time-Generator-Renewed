/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author marvy
 */
public class NewSheetMenu {
    
    public NewSheetMenu(){
        JFrame jfFrame = new JFrame("Criar planilha");
        JPanel jpPanel = new JPanel();
        JButton jbNewSheet = new JButton("Nova Planilha");
        
        jpPanel.add(jbNewSheet);
        
        jpPanel.setLayout(new GridLayout(3, 3, 10, 10));
        
        jfFrame.add(jpPanel);
        jfFrame.setSize(500,300);
        jfFrame.setLocationRelativeTo(null);
        jfFrame.setVisible(true);
        jfFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
