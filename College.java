public class College {

    public boolean college(int avgTemp, int numStudents, boolean csMajor) {
        boolean cheese = true;

        if (avgTemp <= 80)
            cheese = false;
        if (numStudents <= 8000)
            cheese = false;
        if (!csMajor)
            cheese = false;

        //return local variable
        return cheese;
    }
}
 {
    
}
