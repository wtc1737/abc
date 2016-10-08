package extends01;

public class Student extends Person{

	
	Student(String name , char gender , int age , String address , int number)
	{
		super(name , gender , age , address , number);
		
	}
	
	//方法
	/*void anMetnod()
	{
		super.anMetnod();
	}
	void peMetnod()
	{
		super.peMetnod();
	}*/
	void stMetnod()
	{
		System.out.println("姓名：" + name + "  年龄" + age + "岁  家住：" + address + "  学号：" + number);
	}
}
