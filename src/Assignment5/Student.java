package Assignment5;

import java.text.DecimalFormat;

public abstract class Student {
    String firstName,lastName,studentID;
    int numCredit;
    double rate,tuition;
    DecimalFormat df1 = new DecimalFormat("$##,##0.00");

    public Student(String fName, String lName, String id, int credits, double rate){
        firstName = fName;
        lastName = lName;
        studentID = id;
        numCredit = credits;
        this.rate = rate;
        tuition = 0.0;
    }
    public int getNumCredit(){
        return numCredit;
    };
    public abstract void computeTuition();
    @Override
    public String toString(){
        return "\nFirst name:\t\t"+firstName+"\n"+
                "Last name:\t\t"+lastName+"\n"+
                "Student ID:\t\t" + studentID+"\n"+
                "Credits:\t\t"+numCredit+"\n"+
                "Rate:\t\t\t"+df1.format(rate)+"\n"+
                "Tuition:\t\t"+df1.format(tuition)+"\n";



    }


}

