package ex02_db;

import java.util.List;

public class EmpSelect {
	public static void main(String[] args) {
		List<Emp> list = EmpMethod.find("MANAGER");
		
		for(Emp e : list) {
			System.out.printf("%d,%s,%s,%d \n", e.getEmpno(),e.getEname(),e.getJob(),e.getSalary());
		}
	}
}
