package day2.ex2;

public class ComMain {
	public static void main(String[] args) {
		Employee[] employees = new Employee[4];
		int idx = 0;
		employees[idx++] = new Programmer("개똥이"); 
		employees[idx++] = new Designer("소똥이"); 
		employees[idx++] = new Programmer("말똥이"); 
		employees[idx++] = new Designer("양똥이"); 
		
		for (Employee e : employees) {
			System.out.println("=======" +e.name+ "=======");
			e.startWork();
			if(e instanceof Programmer) {
				((Programmer)e).work();
			}
			
			e.work();
			e.endWork();
		}
		
	}
}
