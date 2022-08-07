package test;

public class Employee {

	 Integer id;
	 String name;
	 Integer sal;
	 String addrs;
	public Employee(Integer id, String name, Integer sal, String addrs) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.addrs = addrs;
	}
	
	public Employee() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSal() {
		return sal;
	}
	public void setSal(Integer sal) {
		this.sal = sal;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	@Override
	public String toString() {
		return "Employee [name=" + id + ", name=" + name + ", sal=" + sal + ", addrs=" + addrs + "]";
	}
	 
	 
}
