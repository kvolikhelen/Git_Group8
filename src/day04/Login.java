package day04;

import java.util.ArrayList;
import java.util.Scanner;


public class Login {
    String userName;
    String password;

    public Login(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Login login = new Login("cemo", "cc123456");

        System.out.println("Enter username: ");
        String enterUserName = input.nextLine();
        System.out.println("Enter password");
        String enterPassword = input.nextLine();

        if(login.userName.equals(enterUserName) && login.password.equals(enterPassword)){
            System.out.println("Login successfully...");
        }else {
            System.out.println("Username or password invalid.");
        }






    }

}
