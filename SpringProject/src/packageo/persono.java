package packageo;

public class persono {
	private int id;
	private String name;
	private int age;
	private Father father;
	
	public Father getFather() {
		return father;
	}
	public void setFather(Father father) {
		this.father = father;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	
	public String toString() {
		return id+name+age;
	}
	public persono() {
		
	};
	public persono(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		
	}
	public persono(int id, String name, int age, Father father) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.father = father;
	}

}
