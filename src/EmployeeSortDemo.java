import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSortDemo {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(2, "Bijay"));
		list.add(new Employee(1, "Rupali"));
		list.add(new Employee(1, "Rupali"));
		list.add(new Employee(0, "Anita"));
		
		System.out.println(list);
		
		//Collections.sort(list);
		
		Collections.sort(list, new Employee.NameComparator());
		
		System.out.println(list);
		
	}

}
