import java.util.List;
import java.util.Map;
import java.util.Set;


public class Test {
	
	private String sname;
	private Set setNames;
	private List listName;
	private Map mapNames;
	private Integer sno;
	private Student student;
	
	Test(String sname,Integer sno){
		this.sname = sname;
		this.sno =sno;
	 
	}
	
	Test(){
		System.out.println("test()");
	}
	
	Test(Student st){
		System.out.println("testdfdf");
		this.student=st;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public Set getSetNames() {
		return setNames;
	}

	public void setSetNames(Set setNames) {
		this.setNames = setNames;
	}

	public List getListName() {
		return listName;
	}

	public void setListName(List listName) {
		this.listName = listName;
	}

	public Map getMapNames() {
		return mapNames;
	}

	public void setMapNames(Map mapNames) {
		this.mapNames = mapNames;
	}

	public Integer getSno() {
		return sno;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	

}
