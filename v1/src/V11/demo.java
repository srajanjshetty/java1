package V11;

import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        employee e1=new employee(1,"ram","IT",5000.00);
        employee e2=new employee(2,"yam","IT",6000.00);
        employee e3=new employee(3,"sam","IT",7000.00);
        employee e4=new employee(5,"aam","IT",8000.00);
        employee e5=new employee(6,"lam","IT",9000.00);

        ArrayList<employee> emp_list=new ArrayList<>();
        emp_list.add(e1);
        emp_list.add(e2);
        emp_list.add(e3);
        emp_list.add(e4);
        emp_list.add(e5);


        for(employee e:emp_list)
        {
            System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()+" "+e.getDept()) ;
        }
        ArrayList<String> s1=new ArrayList<>();
        s1.add("a");
        s1.add("b");
        s1.add("c");
        s1.add("d");
        s1.add("e");
        System.out.println(s1);
        s1.stream().filter(k->k.startsWith("d")).forEach(k-> System.out.println(k));
        s1.stream().map(k->k.toUpperCase()).forEach(k-> System.out.println(k));
        ArrayList<Integer> s1=new ArrayList<>();
        s1.add("a");
        s1.add("b");
        s1.add("c");
        s1.add("d");
        s1.add("e");
        System.out.println(s1);
    }
}
