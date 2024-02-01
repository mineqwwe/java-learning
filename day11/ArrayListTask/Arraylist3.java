package day11.ArrayListTask;

import java.util.ArrayList;

public class Arraylist3 {
    public static void main(String[] args) {
        Employee e1 = new Employee("张三", 3000);
        Employee e2 = new Employee("李四", 3500);
        Employee e3 = new Employee("王五", 4000);
        Employee e4 = new Employee("赵六", 4500);
        Employee e5 = new Employee("田七", 5000);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getName() == "王五") {
                employees.get(i).setName("王小五");
            }
            if (employees.get(i).getName() == "田七") {
                employees.get(i).setSalary(employees.get(i).getSalary() + 300);
            }
            if (employees.get(i).getName() == "赵六") {
                employees.remove(i);
            }
        }
        System.out.println(employees);
    }

}
