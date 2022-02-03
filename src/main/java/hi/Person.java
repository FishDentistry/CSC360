package hi;

public class Person
{
	String firstname;
	String lastname;
	int age;
	/**
	 * @param fname
	 * @param lname
	 * @param age
	 */
	public Person(String fname, String lname, int age)
	{
		this.firstname = fname;
		this.lastname = lname;
		this.age = age;
	}
	/**
	 * @return the fname
	 */
	public String getFname()
	{
		return firstname;
	}
	
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname)
	{
		this.firstname = fname;
	}
	/**
	 * @return the lname
	 */
	public String getLname()
	{
		return lastname;
	}
	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname)
	{
		this.lastname = lname;
	}
	/**
	 * @return the age
	 */
	public int getAge()
	{
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
	
	@Override
	public String toString()
	{
		return "Person: " + firstname + " " + lastname + ", " + age;
	}
	
	public Person makePerson(Person that) throws UnderAgeException
	{
		if (age < 18 || that.age < 18) {
			throw new UnderAgeException();
		}
		Person child = new Person(this.firstname, that.lastname,0);
		return child;
	}
	
	public static void main(String[] args)
	{
		Person r = new Person("Romeo","Mon",15);
		System.out.println("R " + r);
	}
}
