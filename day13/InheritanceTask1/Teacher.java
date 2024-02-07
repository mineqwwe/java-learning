package day13.InheritanceTask1;

public class Teacher extends Employee {
    public Teacher() {
    }

    public Teacher(String id, String name, String work) {
        super(id, name, work);
    }

    @Override
    public void work() {
        System.out.println("教研部员工在工作");
    }

}
