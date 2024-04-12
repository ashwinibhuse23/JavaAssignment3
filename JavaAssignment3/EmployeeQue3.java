package assignment;
import java.util.Scanner;
public class EmployeeQue3 {
		private double salary;
		private int numOfHourOfWork;

		Scanner sc = new Scanner(System.in);

		public void getInfo() {
			System.out.println("Enter the salary of Employee");
			salary = sc.nextDouble();
			System.out.println("Enter the number of hour of work");
			numOfHourOfWork = sc.nextInt();
		}

		public void addSal() {
			if (salary < 500) {
				salary = salary + 10;
				System.out.println("Salary Updated");
			}

		}

		public void addWork() {
			if (numOfHourOfWork > 6) {
				salary = salary + 5;
				System.out.println("Salary Updated");
			}
		}

		public void display() {
			System.out.println("Employee Salary : " + salary);
			System.out.println("Employee Number of hour of work  :  " + numOfHourOfWork);
		}

	}

