package packageo;

public class Father {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Father(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Father() {
		
	}
	public String toString() {
		return name+age;
	}
}
