/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author dell
 */
public class DoctorManagement {

    ArrayList<Doctor> lst = new ArrayList<>();

    public void add(String name, String DOB, String Spec, int avai, String email, String number) {
        int id = 0;
        int length = lst.size();
        if (lst.size() == 0) {
            id = 1;
        } else {
            id = lst.get(length - 1).getID() + 1;
        }

        lst.add(new Doctor(id, name, DOB, Spec, avai, email, number));
    }

    public int getIndex(int id) {
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i).getID() == id) {
                return i;
            }
        }
        return -1;
    }

    public void update() {
        DoctorManagement doc = new DoctorManagement();
        Validater vl = new Validater();
        int id = vl.choice("Enter id", 1, 100);
        int index = doc.getIndex(id);
        if (index != -1) {

        }
        System.out.println("Do you want edit name: ");
        if (vl.checkYOrN()) {
            String name = vl.input("create Name: ", 50, "Error!!! name must be small than 50 characters");
            lst.get(index).setName(name);
        }
        System.out.println("Do you want edit Date of birth: ");
        if (vl.checkYOrN()) {
            String Dob = vl.getDates("Create DOB");
            lst.get(index).setDOB(Dob);
        }
        System.out.println("Do you want edit specialization: ");
        if (vl.checkYOrN()) {
            String spec = vl.input("Create Spec", 255, "Error!!! name must be small than 255 characters");
            lst.get(index).setSpec(spec);
        }
        System.out.println("Do you want edit availability: ");
        if (vl.checkYOrN()) {
            int vail = vl.choice("Cretae vail", 0, 3);
            lst.get(index).setAvai(vail);
        }
        System.out.println("Do you want edit email: ");
        if (vl.checkYOrN()) {
            String email = vl.checkMail("Create mail");
            lst.get(index).setEmail(email);
        }
        System.out.println("Do you want edit Phonenumber: ");
        if (vl.checkYOrN()) {
            String mobile = vl.checkMoblie("Create mobile");
            lst.get(index).setNumber(mobile);
        }

    }

    public void sort() {

        Comparator<Doctor> DOB = (o1, o2) -> {
            return o1.getDOB().compareTo(o2.getDOB());

        };

        Collections.sort(lst, DOB);
        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i).toString());
        }

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

    public boolean search(String input) {
        System.out.println("ID\tName\tDateOfBirth\tSpec\tAvai\tEmail\tMobile");
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i).getName().equals(input) || String.valueOf(lst.get(i).getID()).equals(input)) {
                System.out.println(lst.get(i).toString());
                return true;
            }

        }
        return false;
    }

}
