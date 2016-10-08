package extends01;

public class Person extends Animal{

	//属性
	int number;
	
	
	//构造
	Person(String name , char gender , int age , String address , int number)
	{
		super(name , gender , age , address);
		this.number = number;
		
	}
	
	//方法
	/*void anMetnod()
	{
		super.anMetnod();
		
	}*/
	
	void peMetnod()
	{
		System.out.println(name + "正在上网");
		System.out.println(name + "正在思考");
	}
}
