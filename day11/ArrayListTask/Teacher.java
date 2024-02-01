package day11.ArrayListTask;

public class Teacher {
    private String name;
    private String profession;

    public Teacher() {
    }

    public Teacher(String name, String profession) {
        this.name = name;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Teacher [name=" + name + ", profession=" + profession + "]";
    }

}
