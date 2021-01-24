package Assignment5;

public class UnderGrad extends Student {
    boolean isState;
    int creditUpperbound;
    double programFee;

    public UnderGrad(String fName, String lName, String id, int credits, double rate, boolean isState, double programFee){
        super(fName, lName, id, credits, rate);
        this.isState = isState;
        if(isState = true){
            creditUpperbound = 7;
        }
        else{
            creditUpperbound = 12;
        }
        this.programFee = programFee;
    }
    public void computeTuition() {
        if (numCredit >= creditUpperbound) {
            tuition = rate*creditUpperbound + programFee;
        }
        else{
            tuition = rate*numCredit + programFee;
        }
    }
    @Override
    public String toString(){
        return "\nUnderGrad Student:"+"\n"+
                (isState ? "In-State":"Out-Of-State")+
                super.toString()+
                "Student Program Fee:\t"+df1.format(programFee)+"\n\n";
    }
}