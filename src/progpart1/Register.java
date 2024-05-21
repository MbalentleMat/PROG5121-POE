/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progpart1;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Enhle
 */
public class Register {

//global variables    
public static String first_name;
public static String last_name;
public static String username;
public static String password;

public static boolean on_password;
public static boolean on_username;

//method to register user
public static void registerUser(){
//scanner object to accept user input    
Scanner scan = new Scanner(System.in);

System.out.println("\n-------------------REGISTRATION---------------------\n");

System.out.println("Enter your name:");
first_name = scan.nextLine();

System.out.println("\nEnter your surname:");
last_name = scan.nextLine();

//do while loop to keep prompting the user
do{
System.out.println("\nEnter a username");
username = scan.nextLine();
}
while(checkUserName(username)!=true);

do{
System.out.println("\nEnter a password");
password = scan.nextLine();
}
while(checkPasswordComplexity(password)!=true);
               
}  
//method to check username
static boolean checkUserName(String username){
    
//local variable
boolean look = false;


//condition
if(!username.contains("_") || username.length() > 5){
    System.out.println("\nUsername must contain an underscore and must be atleast 5 characters long");
    look = false;
}
else if(username.contains("_") && username.length() <= 5){
   System.out.println("**********************************************************************");
   System.out.println("\nUsername is saved");
   System.out.println("**********************************************************************");
   look = true;
}

return look;
}
//method to check password complexity
static boolean checkPasswordComplexity(String password){

//local variable    
boolean look = false;


//using Pattern class to check for Uppercases,Numbers and Special Characters 
Pattern check_Caps = Pattern.compile("[QWERTYUIOPASDFGHJKLZXCVBNM]");
Pattern check_Number = Pattern.compile("[0123456789]");
Pattern check_Chars = Pattern.compile("[~`!@#$%^&*()_+=?]");



//condition
if(check_Caps.matcher(password).find()&&check_Number.matcher(password).find()&&check_Chars.matcher(password).find()&&password.length()<=8){

//reset boolean to true;
on_username = true;
//method call
validatePassword();
return true;
}

else{
    
//reset boolean to false    
on_username = false;
//method call
validatePassword();
return false;
}


}

//method to validate password
public static String validatePassword(){

//condition    
if(on_username){
System.out.println("***********************************************************************");
System.out.println("\nPassword is saved");
System.out.println("***********************************************************************");
}
else if(!on_username){
System.out.println("\nPassword does not meet complexity, Password must be 8 character long,"
        + "\nMust have atleast one uppercase letter, Must have a number, and Must be have\n"
        + "a special character");
}
return null;
}
}