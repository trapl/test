/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

/**
 *
 * @author dell
 */
public class Doctor {

    public int ID;
    public String Name;
    public String DOB;
    public String Spec;
    public int Avai;
    public String email;
    public String number;

    public Doctor() {
    }

    public Doctor(int ID, String Name, String DOB, String Spec, int Avai, String email, String number) {
        this.ID = ID;
        this.Name = Name;
        this.DOB = DOB;
        this.Spec = Spec;
        this.Avai = Avai;
        this.email = email;
        this.number = number;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getSpec() {
        return Spec;
    }

    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    public int getAvai() {
        return Avai;
    }

    public void setAvai(int Avai) {
        this.Avai = Avai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int compareTo(Doctor d){
        return this.getDOB().compareTo(d.getDOB());
    }
    
    public String nameOfAvai() {
        int avai = getAvai();
        if (avai == 0) {
            return "In Vacation";
        } else if (avai == 1) {
            return "available";
        } else if (avai == 2) {
            return "busy in emergency case";
        }
        return "in diagnosing case";
    }

    @Override
    public String toString() {
        return ID + "\t" + Name + "\t" + DOB + "\t" + Spec + "\t" + nameOfAvai() + "\t" + email + "\t" + number;
    }

}
