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
public class POE {

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
// Login and registration page
public class LoginPage {
  private boolean isValidLogin = false;
  private boolean isValidRegistration = false;

  public void loginUser(String username, String password) {
    // Check if username and password are valid
    if (username.equals("username1") && password.equals("password1")) {
      isValidLogin = true;
    } else {
      isValidLogin = false;
    }
  }

  public void registerUser(String username, String password) {
    // Check if username and password are valid
    if (username.equals("username2") && password.equals("password2")) {
      isValidRegistration = true;
    } else {
      isValidRegistration = false;
    }
  }

  public boolean isValid() {
    return isValidLogin && isValidRegistration;
  }
}

// Task creator
public class TaskCreator {
  private boolean isValidTask = false;

  public void createTask(String taskName, String taskDescription) {
    // Check if taskName and taskDescription are valid
    if (taskName.equals("task1") && taskDescription.equals("taskDescription1")) {
      isValidTask = true;
    } else {
      isValidTask = false;
    }
  }

  public boolean isValid() {
    return isValidTask;
  }
}

// Task report shower
public class TaskReportShow {
  private List<Task> tasks = new ArrayList<>();

  public void showTasks(boolean includeCompletedTasks) {
    // Check if includeCompletedTasks is true
    if (includeCompletedTasks) {
      tasks.addAll(getCompletedTasks());
    }
    // Display tasks
    for (Task task : tasks) {
      System.out.println(task.getName() + " (" + task.getDescription() + ")");
    }
  }

  private List<Task> getCompletedTasks() {
    // Get completed tasks from database or storage
    return new ArrayList<>();
  }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


  







