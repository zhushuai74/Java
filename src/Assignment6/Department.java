package Assignment6;

// Assignment #6: Arizona State University CSE205
//          Name:
//     StudentID:
//       Lecture: (MWF 8:00am)
//   Description: this class represents a department at certain university

public class Department
{
     private String name;
     private int numberOfFaculty;
     private String university;

     public Department()
     {
           name = "?";
           numberOfFaculty = 0;
           university = "?";
     }

    //accesssor method
     public String getDeptName()
     {
           return name;
     }
     public int getNumberOfMembers()
     {
           return numberOfFaculty;
     }
     public String getUniversity()
     {
           return university;
     }

     //mutator methods
     public void setDeptName(String name)
     {
           this.name = name;
     }
     public void setNumberOfMembers(int numFaculty)
     {
           this.numberOfFaculty = numFaculty;
     }
     public void setUniversity(String name)
     {
           this.university = name;
     }

     public String toString()
     {
           return "\nDepartment Name:\t\t" + name + "\nNumber Of Faculty:\t" + numberOfFaculty +
                     "\nUniversity:\t\t" + university + "\n\n";
     }
}

