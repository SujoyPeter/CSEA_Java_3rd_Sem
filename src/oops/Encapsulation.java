package oops;
 class Students{
	 private String name ;
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s = new Students();
		s.setName("Arpita");
		System.out.println(s.getName());
	}

}
