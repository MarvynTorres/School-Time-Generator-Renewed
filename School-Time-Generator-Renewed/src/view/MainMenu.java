package view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author marvy
 */
public class MainMenu {
    public static void main(String[] args){
        new MainMenu();
    }
    
        public MainMenu(){
        
            JFrame jfFrame = new JFrame("Menu principal");
            JPanel jpPanel = new JPanel();
            JLabel jlTitle = new JLabel("Menu Principal");
            JButton jbNewSheet = new JButton("Nova Planilha");
            JButton jbSheets = new JButton("Planilhas Salvas");

            jlTitle.setFont(new Font("Arial", Font.BOLD, 24));

            jpPanel.add(jlTitle);
            jpPanel.add(jbNewSheet);
            jpPanel.add(jbSheets);
            jpPanel.setLayout(new GridLayout(3,3, 10, 10));

            jfFrame.setSize(400,300);
            jfFrame.setLocationRelativeTo(null);
            jfFrame.add(jpPanel);
            jfFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jfFrame.setVisible(true);

            jbNewSheet.addActionListener(e -> openNewSheetMenu());
            jbSheets.addActionListener(e -> openExplorer());
            
        }
    
    private void openExplorer(){
        JFileChooser fileChooser = new JFileChooser();
        
        fileChooser.showOpenDialog(null);
        
        fileChooser.setFileFilter(
            new javax.swing.filechooser.FileNameExtensionFilter("Planilha (*.xls)", "xls")
        );
    }
    
    private void openNewSheetMenu(){
        new NewSheetMenu();
    }
    
}
