public class StudentMain{
    public static void main(String[] args) {
        Student s1 = new Student("Joe","Mathletes");
        Student s2 = new Student("Joe", "Mathletes");
        Student s3 = new Student("Jeff", "Creative Writing");

        System.out.println(s1.isSameClub(s2));
        System.out.println(s2.isSameClub(s3));
    }
}