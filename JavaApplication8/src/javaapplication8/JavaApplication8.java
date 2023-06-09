/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;
import javax.swing.JOptionPane;

/**
 *
 * @author 27615
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
       String username = JOptionPane.showInputDialog(null, "Enter a username:");
    String password = JOptionPane.showInputDialog(null, "Enter a password:");
    boolean isRegistered = true;
    JOptionPane.showMessageDialog(null, "Registration successful!");
    
    while(isRegistered) {
      String enteredUsername = JOptionPane.showInputDialog(null, "Enter username:");
      String enteredPassword = JOptionPane.showInputDialog(null, "Enter password:");
      
      if(enteredUsername.equals(username) && enteredPassword.equals(password)) {
        JOptionPane.showMessageDialog(null, "Login successful!");
        isRegistered = false;
      }
      else {
        JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again.");
 }}}} 

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


  







