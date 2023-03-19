/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

import java.awt.Component;
import javax.swing.JOptionPane;
/**
 *
 * @author PC
 */
public class MessageQLHSDialog {
    public static void showMessageDialog(Component parent,String content, String titlte){
        JOptionPane.showMessageDialog(parent, content, titlte, JOptionPane.INFORMATION_MESSAGE);
    }
     public static void showErrorDialog(Component parent,String content, String titlte){
        JOptionPane.showMessageDialog(parent, content, titlte, JOptionPane.ERROR_MESSAGE);
    }
    public static int showConfirmDialog(Component parent,String content, String titlte){
        int choose = JOptionPane.showConfirmDialog(parent, content, titlte, JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        return choose;
      }
}
