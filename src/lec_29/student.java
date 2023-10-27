package lec_29;

public class student {

	private String name="kaju";
	private int age = 19;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws Exception  {
		if(age<0) {
			 throw new Exception("bklol tumhari age glt hai ");
			return;
		}
		
		catch (Exception e) {
			 //TODO: handle exception
			e.printstacktrace();
		}
		finally {
			System.out.println("i am in finally blocks");
			
		}
//	public void setAge(int age) throws Exception  {
//		if(age<0) {
//			 throw new Exception("bklol tumhari age glt hai ");
//			return;
//		}
//		this.age = age;
	}
	
}
