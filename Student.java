public class Student{
    private String myName;
    private String myClub;

    public Student(String name, String club){
        myName = name;
        myClub = club;
    }

    public String getClub(){
        return myClub;
    }

    public String getName(){
        return myName;
    }

    public boolean isSameClub(Student other){
        return this.myClub.equals(other.myClub);
    }
}