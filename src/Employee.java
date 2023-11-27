import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Employee {

        private int id;
        private String Name ;
        private int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        Name = name;
        this.salary=salary;
    }
}

    class Main1 {

        public static void main(String arg[]) {

            Set<Employee> empSet = new HashSet<Employee>();

            empSet.add(new Employee(1, "A", 5000));
            empSet.add(new Employee(2, "B", 6000));
            empSet.add(new Employee(1, "A", 5000));
            empSet.add(new Employee(1, "A", 5000));
            empSet.add(new Employee(1, "E", 5000));

            //empSet.stream().sorted(Comparator.reverseOrder()).
             empSet.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).collect(Collectors.toCollection(LinkedHashSet::new))
                    .forEach(s->System.out.println(s.getId()+":"+s.getSalary()));

            Optional<Employee> employee = empSet.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).collect(Collectors.toCollection(LinkedHashSet::new))
                    .stream().findFirst();
            if(employee.isPresent()){
                System.out.println("pringintg first element>>>>"+employee.get().getSalary()+":"+employee.get().getId());
            }

            // Map<Integer, List<Employee>> empSal=empSet.stream().collect(Collectors.groupingBy(Employee::getSalary));
            //.entrySet().stream().filter();
//            empSal.entrySet().stream()
//        for(Map.Entry emp:empSal.entrySet()){
//            if(emp.getValue().)
//            }
//
//        }
        }
    }

