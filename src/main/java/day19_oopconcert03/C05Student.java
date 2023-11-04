package day19_oopconcert03;

/*
    Encapsulation: "Data hidding"
    Why do we need data hidding:
​
    i) Because some data should not be public like "ID"
        "credit card number" or "password"
    ii) We don't want some data to accessible from other classes
​
 */
public class C05Student {
    private String stId = "TH001";
    private String illness = "depression";
    private double gpa = 3.87;
    private boolean disability = false;

        // How to read encapsulated data:
        // get() methods calling encapsulated data are called as getters

    public String getStId(){
        return stId;
    }

    public String getIllness(){
        return illness;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isDisability() {  // For boolean data type getters start with "is" keyword
        return disability;
    }

    // If we need to update encapsulated data:
    public void setStId(String stId){
        this.stId = stId;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }
}