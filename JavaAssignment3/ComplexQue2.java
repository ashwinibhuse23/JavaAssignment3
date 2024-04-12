package assignment;

public class ComplexQue2 {
	private double real;
	private double img;
	
	
	
	public ComplexQue2(double real, double img) {
		super();
		this.real = real;
		this.img = img;
	}


	//Method
	public ComplexQue2 add(ComplexQue2 num)//second is object
	{
		double real=this.real+num.real;
		double img=this.img+num.img;
		return new ComplexQue2(real,img);
		
	}
	public ComplexQue2 sub(ComplexQue2 num)
	{
		double real=this.real-num.real;
		double img=this.img-num.img;
		return new ComplexQue2(real,img);
	}
	public ComplexQue2 multi(ComplexQue2 num)
	{
		double real=this.real*num.real;
		double img=this.img*num.img;
		return new ComplexQue2(real,img);
	}

	public void display() {
		System.out.println(real+" + "+img+"i");
	}
	
	public static void main(String[] args) {
		ComplexQue2 obj=new ComplexQue2(10, 20);
		ComplexQue2 obj1=new ComplexQue2(20, 30);
		ComplexQue2 result=obj.add(obj1);
		result.display();
		
		ComplexQue2 obj3=new ComplexQue2(10, 20);
		ComplexQue2 obj4=new ComplexQue2(20, 30);
		ComplexQue2 result1=obj.sub(obj4);
		result1.display();
		
		ComplexQue2 obj5=new ComplexQue2(10, 20);
		ComplexQue2 obj6=new ComplexQue2(20, 30);
		ComplexQue2 result2=obj.multi(obj6);
		result2.display();
	}
}



