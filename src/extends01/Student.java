package extends01;

public class Student extends Person{

	
	Student(String name , char gender , int age , String address , int number)
	{
		super(name , gender , age , address , number);
		
	}
	
	//����
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
		System.out.println("������" + name + "  ����" + age + "��  ��ס��" + address + "  ѧ�ţ�" + number);
	}
}
