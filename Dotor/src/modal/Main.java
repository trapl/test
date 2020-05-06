/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validater val = new Validater();
        DoctorManagement doc = new DoctorManagement();

        do {
            System.out.println("Management a Doctor\n1.Create a Doctor\n"
                    + "2.Edit a Doctor Information\n"
                    + "3.Delete a Doctor\n"
                    + "4.Search doctor by ID and by Name\n"
                    + "5.Sort doctor by DateOfBirth\n6.exit");
            int choice = val.choice("Pls pick your choice", 1, 6);
            switch (choice) {
                case 1:
                    System.out.println("-------Create a Doctor-------");
                    String name = val.input("create Name: ", 50, "Error!!! name must be small than 50 characters");
                    String Dob = val.getDates("Create DOB");
                    String spec = val.input("Create Spec", 255, "Error!!! name must be small than 255 characters");
                    int vail = val.choice("Cretae vail", 0, 3);
                    String email = val.checkMail("Create mail");
                    String mobile = val.checkMoblie("Create mobile");
                    doc.add(name, Dob, spec, vail, email, mobile);
                    break;
                case 2:
                    System.out.println("------Edit a Doctor Information------");
                    doc.update();
                    break;
                case 3:
                    System.out.println("-----Delete a Doctor-----");
                    int id = val.choice("Enter id", 1, 100);
                    if (doc.delete(id)) {
                        System.out.println("Delete Successful");
                    } else {
                        System.out.println("Not found the id");
                    }
                    break;
                case 4:
                    System.out.println("-----Search Dotor by ID and by Name-----");
                    String input = sc.nextLine();
                    if (!doc.search(input)) {
                        System.out.println("can't seek this doctor");
                    }
                    break;
                case 5:
                    System.out.println("-----Sort doctor by DateOfBirth-----");
                    doc.sort();
                    break;
                case 6:
                    System.exit(0);
            }

        } while (true);

    }
}
