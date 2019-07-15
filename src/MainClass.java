import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class MainClass {

	static List<Employee> empsUnq = new ArrayList<>();

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();

		emps.add(new Employee("Anil", "Active", new Timestamp((2001-1900), 1, 1, 1, 15, 00, 00)));
		emps.add(new Employee("Anil", "Active", new Timestamp((2002-1900), 1, 1, 1, 15, 00, 00)));
		emps.add(new Employee("Anil", "Active", new Timestamp((2000-1900), 1, 1, 1, 15, 00, 00)));
		
		emps.add(new Employee("Arun", "Active", new Timestamp((2005-1900), 1, 1, 1, 15, 00, 00)));
		emps.add(new Employee("Arun", "Active", new Timestamp((1998-1900), 1, 1, 1, 15, 00, 00)));
		emps.add(new Employee("Arun", "Active", new Timestamp((2008-1900), 1, 1, 1, 15, 00, 00)));
		
		emps.add(new Employee("Ajith", "Active", new Timestamp((2002-1900), 1, 1, 1, 15, 00, 00)));
		emps.add(new Employee("Sunil", "Active", new Timestamp((2003-1900), 1, 1, 1, 15, 00, 00)));
		emps.add(new Employee("Lohith", "Active", new Timestamp((2006-1900), 1, 1, 1, 15, 00, 00)));
		
		
		emps.add(new Employee("Syed", "Active", new Timestamp((2004-1900), 1, 1, 1, 15, 00, 00)));
		emps.add(new Employee("Syed", "Active", new Timestamp((2004-1900), 1, 1, 1, 16, 00, 00)));
		
		emps.forEach(emp -> addToUniqueList(emp));

		empsUnq.forEach(emp -> System.out.println(emp));
	}

	public static void addToUniqueList(Employee emp) {
		Employee empFound = null;
		boolean found = false;
		for (Employee empUnq : empsUnq) {
			if (empUnq.getName().equals(emp.getName())) {
				found = true;
				empFound = empUnq;
				break;
			}
		}

		if (found) {
			if (empFound.getLastUpdated().compareTo(emp.getLastUpdated()) < 0) {
				empsUnq.remove(empFound);
				empsUnq.add(emp);
			}
		} else {
			empsUnq.add(emp);
		}
	}

}
