package extends01;

public class Animal
{

	//属性
	String name;
	char gender;
	int age;
	String address;
	
	//构造
	Animal(String name , char gender , int age , String address)
	{
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.address = address;
		
	}
	
	//方法
	void anMetnod()
	{
		System.out.println(name + "在睡觉");
		System.out.println(name + "在吃饭");
	}
	
	void zwMetnod()
	{
		System.out.println(name + "  年龄:" + age + "岁  生活在:" + address);
	}
}
