package extends01;

public class Person extends Animal{

	//����
	int number;
	
	
	//����
	Person(String name , char gender , int age , String address , int number)
	{
		super(name , gender , age , address);
		this.number = number;
		
	}
	
	//����
	/*void anMetnod()
	{
		super.anMetnod();
		
	}*/
	
	void peMetnod()
	{
		System.out.println(name + "��������");
		System.out.println(name + "����˼��");
	}
}
