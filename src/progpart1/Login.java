/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progpart1;

import java.util.Scanner;

/**
 *
 * @author Enhle
 */
public class Login {
//global variables
static String username;
static String password;

public static void loginUser(){
//scanner to accept user input    
Scanner scan = new Scanner(System.in);
 
 System.out.println("\n-----------------------------------LOGIN--------------------------------\n");
 
 //do while loop to keep prompt the user
do{
   
    System.out.println("Enter your saved username");
    username = scan.nextLine();
    
    System.out.println("Enter your saved password");
    password = scan.nextLine();
}
while(returnLoginStatus(username,password)!= true);
}    
//method to return login status
static boolean returnLoginStatus(String username, String password){
boolean look = false;

//conditions
if(Register.username.equals(username) && Register.password.equals(password)){

System.out.println("***************************************************************************");
System.out.println("\nWelcome back"+" "+Register.first_name+" "+Register.last_name+" "+"its\n"
        + "nice to see you again");
look = true;
}
else if(!Register.username.equals(username) && !Register.password.equals(password)){
System.out.println("The username or password you entered was incorrect\n");
look = false;
}
else if(Register.username.equals(username) && !Register.password.equals(password)){
System.out.println("The username or password you entered was incorrect\n");
look = false;
}
else if(!Register.username.equals(username) && Register.password.equals(password)){
System.out.println("The username or password you entered was incorrect\n");
look = false;
}
return look;
}
}

