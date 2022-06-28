package com.learning.innerclass;

public class Employee {
	int salary = 4000;

	class PermEmployee {
		String code = "PE01";
		double hike = 0.45;

		void new_salary() {
			double newSalary = salary * hike;
			System.out.println("Salary:" + newSalary + " code:" + code + " hike:" + hike);
		}
	}

	class TempEmployee {
		String code = "TE01";
		double hike = 0.3;

		void new_salary() {
			double newSalary = salary * hike;
			System.out.println("Salary:" + newSalary + " code:" + code + " hike:" + hike);
		}
	}

	void role() {
		class ContractEmployee {
			String code = "CE01";
			double hike = 0.3;
			
			void new_salary() {
				double newSalary = salary * hike;
				System.out.println("Salary:" + newSalary + " code:" + code + " hike:" + hike);
			}
			
		}
		ContractEmployee c = new ContractEmployee();
		c.new_salary();
		
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee.PermEmployee perm = emp.new PermEmployee();
		Employee.TempEmployee temp = emp.new TempEmployee();
		perm.new_salary();
		temp.new_salary();
		emp.role();
	}

}

