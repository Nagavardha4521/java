package collections;

public class Student
{
	private int sno;
	private String sname;
	private String course;
	private double fee;
	
	public Student(int sno,String sname,String course,double fee)
	{
		this.sno=sno;
		this.sname=sname;
		this.course=course;
		this.fee=fee;
	}
	public void setSno( int sno)
	{
		this.sno=sno;
	}
	public int getSno()
	{
		return sno;
	}
	public void setSname(String sname)
	{
		this.sname=sname;
	}
	public String getSname()
	{
		return sname;
	}
	public void setCourse(String course)
	{
		this.course=course;
	}
	public String getCourse()
	{
		return course;
	}
	public void setFee(int fee)
	{
		this.fee=fee;
	}
	public double getFee()
	{
		return fee;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student s = (Student)obj;
			
			return this.course.equals(s.course) &&
					this.sno == s.sno;
		}
		
		return false;
	}
	@Override
	public String toString()
	{
		return "\nStudent(" + sno + ", " + sname + ", " + course + ", " + fee + ")";
	}
	

}
