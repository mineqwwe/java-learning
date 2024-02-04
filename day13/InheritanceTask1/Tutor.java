

public class Tutor extends Teacher {
    public Tutor() {
    }

    public Tutor(String id, String name, String work) {
        super(id, name, work);
    }

    @Override
    public void work() {
        System.out.println("助教在工作");
    }
}
