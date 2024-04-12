package assignment;

public class BankQue7 {
	private final String NAME = "SBI";
	public AccountQue7 account[];
	public CustomerQue7 customer[];
	private static double interestRate=0.03;
	static int maxWithdrawelLimit=10000;
	int MAX_SIZE = 10;
	int size = 0;

	public BankQue7() {
		this.account = new AccountQue7[MAX_SIZE];
		this.customer = new CustomerQue7[MAX_SIZE];
	}

	public void addAccount(String accNo, String name, String address, double mobNo) {
		if (size < MAX_SIZE) {
			int i = size;
			account[i] = new AccountQue7(accNo);
			customer[i] = new CustomerQue7(name, address, mobNo, account[i]);
			size++;
			//return account[i];
		} else {
			System.out.println("Bank is full...");
			//return null;
		}

	}

	public void removeBankAccount(String no) {
		for (int i = 0; i < size; i++) {
			if (account[i].accountNumber == no) {
				for(int j=i;j<size-1;j++)
				{
				account[j] = account[j+1];
				customer[j]=customer[j+1];
				
			}
		}
			
	}
		account[size]=null;
		customer[size]=null;
		size--;
	}

	public void displayDetails() {
		for (int i = 0; i < size; i++) {
			customer[i].displayDetails();
		}
	}

	public void updateDetails(String accNo, double mobNo) {
		for (int i = 0; i < size; i++) {
			if (customer[i].getAccount().accountNumber == accNo) {
				customer[i].setMobileNumber(mobNo);
			} 
//			else {
//				System.out.println("customer not found...");
//			}
		}
	}
	
	
	public void applyInterest(AccountQue7 account1)
	{
		double interest=account1.balance*interestRate;
		account1.balance+=interest;
	}

}
