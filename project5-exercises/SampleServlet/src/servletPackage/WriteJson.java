package servletPackage;

import java.util.List;

public class WriteJson {
	
	List<Student> data;
	String message;
    public WriteJson(List<Student> data, String message) {
       this.data = data;
       this.message = message;
    }
}
