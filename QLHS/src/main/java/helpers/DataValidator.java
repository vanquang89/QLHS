/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author PC
 */
public class DataValidator {
    public static void validateEmpty(JTextField Field, StringBuilder sb,String errorMessage){
        if(Field.getText().equals("")){
            sb.append(errorMessage).append("");
            Field.setBackground(Color.red);
            Field.requestFocus();
        }else{
            Field.setBackground(Color.white);
            }
        }
        public static void validateEmpty(JPasswordField Field, StringBuilder sb,String errorMessage){
            String password = new String(Field.getPassword());
            if(password.equals("")){
            sb.append(errorMessage).append("\n");
            Field.setBackground(Color.red);
            Field.requestFocus();
        }else{
            Field.setBackground(Color.white);
        }
    }
}
