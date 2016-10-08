package extends01;

public class Test {

	public static void main(String[] args) {
	
		Animal an = new Animal("袋鼠" , 'm' , 5 , "澳大利亚");
		
		an.anMetnod();
		
		an.zwMetnod();
		
		Student st = new Student("小敏" , '女' , 18 , "贵州" , 1531140);
		
		st.anMetnod();
		
		st.peMetnod();
		
		st.stMetnod();
	}

}
