package Assignment5;

public class StuParser {
    public static Student parseStringToStudent(String lineToParse){
        Student stu;
        String[] strArr = lineToParse.split("\\|");
        if(strArr[0]=="Graduate"){
            stu = new Graduate(strArr[1], strArr[2],strArr[3], Integer.parseInt(strArr[4]), Double.parseDouble(strArr[5]), Double.parseDouble(strArr[6]));
        }else{
            boolean status;
            if (strArr[6] == "Instates"){
                status = true;
            }
            else {
                status = false;
            }
            stu = new UnderGrad(strArr[1], strArr[2],strArr[3], Integer.parseInt(strArr[4]), Double.parseDouble(strArr[5]),status ,Double.parseDouble(strArr[7]));
        }
        return stu;
    }
}
