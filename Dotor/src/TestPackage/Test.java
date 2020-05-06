/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackage;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;
import modal.Doctor;
import modal.DoctorManagement;
import modal.Validater;

/**
 *
 * @author dell
 */
public class Test {
    ArrayList<Doctor> lst = new ArrayList<Doctor>();
    public Test() {
        lst.add(new Doctor(1, "huy", "14/16/1999", "1", 0, "1@g.com", "(123)-456-7890"));
        lst.add(new Doctor(2, "hai", "11/12/1221", "1", 0, "1@g.com", "(123)-456-7890"));
        lst.add(new Doctor(3, "hoang", "12/11/1221", "1", 0, "1@g.com", "(123)-456-7890"));
        lst.add(new Doctor(4, "thuy", "12/12/1999", "1", 0, "1@g.com", "(123)-456-7890"));
    }
    
     
    public Doctor add(String name, String DOB, String Spec, int avai, String email, String number) {
        int id = 0;
        int length = lst.size();
      
            id = lst.get(length - 1).getID() + 1;
        

     lst.add(new Doctor(id, name, DOB, Spec, avai, email, number));
     
     return lst.get(lst.size() - 1);
    }

    public int getIndex(int id) {
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i).getID() == id) {
                return i;
            }
        }
        return -1;
    }

    public Doctor update(int id,int index,String name,String Dob,String spec,int vail,String email,String mobile ,String y ) {
        Test t = new Test();
        Validater vl = new Validater();
        index = t.getIndex(id);
        if(index!=-1){
        System.out.println("Do you want edit name: ");
        if (t.checkYOrN(y)) {
            
            lst.get(index).setName(name);
        }
        System.out.println("Do you want edit Date of birth: ");
        if (t.checkYOrN(y)) {
     
            lst.get(index).setDOB(Dob);
        }
        System.out.println("Do you want edit specialization: ");
        if (t.checkYOrN(y)) {

            lst.get(index).setSpec(spec);
        }
        System.out.println("Do you want edit availability: ");
        if (t.checkYOrN(y)) {

            lst.get(index).setAvai(vail);
        }
        System.out.println("Do you want edit email: ");
        if (t.checkYOrN(y)) {

            lst.get(index).setEmail(email);
        }
        System.out.println("Do you want edit Phonenumber: ");
        if (t.checkYOrN(y)) {

            lst.get(index).setNumber(mobile);
        }
        return lst.get(index);
        }
        return null;
    }

    public ArrayList<Doctor> sort() {

        Comparator<Doctor> DOB = (o1, o2) -> {
            return o1.getDOB().compareTo(o2.getDOB());

        };

        Collections.sort(lst, DOB);
        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i).toString());
        }
        return lst;
    }

    public boolean delete(int id) {
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i).getID() == id) {
                lst.remove(i);
                return true;
            }
        }
        return false;
    }

    public int search(String input) {
        System.out.println("ID\tName\tDateOfBirth\tSpec\tAvai\tEmail\tMobile");
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i).getName().contains(input) || String.valueOf(lst.get(i).getID()).equals(input)) {
                System.out.println(lst.get(i).toString());
                return 1;
            }

        }
        return -1;
    }
 Scanner sc = new Scanner(System.in);

    public String input(String name,int val) {
          
                if (name.length() < val) {
                    return "1";
                }
        return "-1";
    }

    public int choice(String input, int min, int max) {


            try {
                 int choice = Integer.parseInt(input);
                if (choice<= max && choice >= min) {
                    return choice;
                }
                return -1;
            } catch (NumberFormatException e) {
               return -2;
            }
        
            
        
    }

    public String getDates(String input) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setLenient(false);
        Date date;
            try {
                System.out.print("Enter date: ");
                date = dateFormat.parse(input);
                String d= dateFormat.format(date);
                return d;
            } catch (Exception e) {
               return "-1";
            }
    }

    public boolean isValid(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        if(email.matches(regex)){
            return true;
        }
        return false;
    }

    public String checkMail(String input) {

        while (true) {

                 String mail = input;
                if (isValid(mail)) {
                    return mail;
                }
                return "-1";
           
        }
    }
    

    public String checkMoblie(String input1) {           
 
               String moblie = input1;
            try {
                if (moblie.length() != 10 && moblie.matches("[0-9]+")) {
                    return "-1";
                
                }
                String input = moblie;
                String output = "(" + input.substring(0, 3) + ")" + "-" + input.substring(3, 6) + "-" + input.substring(6, 10);
                return output;
            } catch (Exception e) {
               return "-2";
            }
        
    }

    public boolean checkYOrN(String input) {
        String s = "";
        while (true) {
            s = input;
            if (s.toUpperCase().matches("[Y|N]")) {
                return s.toUpperCase().equals("Y");
            } else {
               return false;
            }
        }
    }
      
    
}
