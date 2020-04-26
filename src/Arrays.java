import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Arrays {

	public static void main(String[] args) {
		
		
		
		List<String> employeeNames = new ArrayList<String>();
		Set<Integer> ids = new HashSet<Integer>();
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		

		employeeNames.add("Jeremy");
		employeeNames.add("Jake");
		employeeNames.add("Justin");
		employeeNames.add("Josh");
		employeeNames.add("Jennifer");
		
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		ids.add(5);
		
		int i = 0;
		for (int id : ids) {
			
			String employeeName = employeeNames.get(i);
			i++;
		employeeMap.put(id, employeeName);
		
		}
		
		for (int key : employeeMap.keySet()) {
			
			System.out.println(key + " - " + employeeMap.get(key));
		}
		
		StringBuilder idsBuilder = new StringBuilder();
		
		for (int id: ids) {
			
			idsBuilder.append(id + "-");
			
			System.out.println(idsBuilder.toString());
			
		
		
		StringBuilder namesBuilder = new StringBuilder();
		
		for (String name : employeeNames) {
			
			namesBuilder.append(name + " ");
			
			System.out.println(namesBuilder.toString());
		}

		}
		
}
		 
}
	


