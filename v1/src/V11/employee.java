package V11;

public class employee {
  int id;
  String name,dept;
  Double salary;

    public employee(int id, String name, String dept, Double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public Double getSalary() {
        return salary;
    }
}
