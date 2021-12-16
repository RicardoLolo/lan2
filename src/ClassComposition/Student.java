package ClassComposition;

public class Student extends Person{
    public int idStudent;

    public Student(String name, int age) {
        super(name, age);
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent){
        this.idStudent = idStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", idStudent=" + idStudent +
                '}';
    }
}
