package extends01;

public class Animal
{

	//����
	String name;
	char gender;
	int age;
	String address;
	
	//����
	Animal(String name , char gender , int age , String address)
	{
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.address = address;
		
	}
	
	//����
	void anMetnod()
	{
		System.out.println(name + "��˯��");
		System.out.println(name + "�ڳԷ�");
	}
	
	void zwMetnod()
	{
		System.out.println(name + "  ����:" + age + "��  ������:" + address);
	}
}
