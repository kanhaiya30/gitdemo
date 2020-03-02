import java.awt.List;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

final class ImmutableClass{
	
private String list;
	
	public ImmutableClass(String test) {
		String cloneTest = new String();
		cloneTest = test.toString();
		this.list = test;
		
	}
	
	public String getList() {
		return list;
	}

	public void setList(String list) {
		this.list = list;
	}
	
	@Override
	public String toString() {
		return "ImmutableClass [list=" + list + "]";
	}
	
}

public class LinkedListTest {
	
	public static void main(String[] args) {
		ImmutableClass imt = new ImmutableClass(new String("test"));
		imt.setList("Test1");
		System.out.println(imt);
	}	
}
