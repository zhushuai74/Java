package Assignment5;

public class Graduate extends Student {
    double gradFee;

    public Graduate(String fName, String lName, String id, int credits, double rate, double gradFee){
        super(fName, lName, id, credits, rate);
        this.gradFee = gradFee;
    }
    public void computeTuition(){
        tuition = (rate*numCredit + gradFee);
    }
    @Override
    public String toString(){
        return "\nGraduate Student:"+
                super.toString()+
                "Grad Fee:\t\t"+df1.format(gradFee)+"\n";
    }

}

