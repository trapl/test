/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Validater {

    Scanner sc = new Scanner(System.in);

    public String input(String mess, int val, String end) {
        System.out.println(mess);
        while (true) {
            try {
                 String name = sc.nextLine();
                if (name.length() < val) {
                    return name;
                }
                System.out.println(end);
                continue;
            } catch (Exception e) {
                System.out.println("end");
            }
        }

    }

    public int choice(String mess, int min, int max) {
        System.out.println(mess);
       do {
           
            try {
                 int choice = Integer.parseInt(sc.nextLine());
                if (choice<= max && choice >= min) {
                    return choice;
                }
                System.out.println("Error!!! pls input between " + min + " and " + max);
            } catch (NumberFormatException e) {
                System.out.println("Pls enter number");
            }
        }while (true);         
            
        
    }

    public String getDates(String mess) {
        System.out.println(mess);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setLenient(false);
        Date date;
        do {
            try {
                System.out.print("Enter date: ");
                date = dateFormat.parse(sc.nextLine());
                return dateFormat.format(date);
            } catch (Exception e) {
                System.out.println("Wrong format pls try again.");
            }
        } while (true);

    }

    public boolean isValid(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    public String checkMail(String mess) {
        System.out.println(mess);
        while (true) {
            try {
                String mail = sc.nextLine();
                if (isValid(mail)) {
                    return mail;
                }
                System.out.println("Error!!! this not email format, pls try again");
                continue;
            } catch (Exception e) {
            }
        }
    }

    public String checkMoblie(String mess) {
        System.out.println(mess);
        while (true) {
            String moblie = sc.nextLine();
            try {
                if (moblie.length() != 10 && moblie.matches("[0-9]+")) {
                    System.out.println("Error!!! pls try again");
                    continue;
                }
                String input = moblie;
                String output = "(" + input.substring(0, 3) + ")" + "-" + input.substring(3, 6) + "-" + input.substring(6, 10);
                return output;
            } catch (Exception e) {
                System.out.println("pls enter num");
            }
        }
    }

    public boolean checkYOrN() {
        String s = "";
        while (true) {
            s = sc.nextLine();
            if (s.toUpperCase().matches("[Y|N]")) {
                return s.toUpperCase().equals("Y");
            } else {
                System.out.println("You must enter y or n");
            }
        }
    }
}
