
//2. Design a Student Parent class and ZSGSStudent Child class.
package inheritence2;
public class Student {
	
	   
	    String name;
	    int id;
	    int age;
	    Student(){
	        this("",-1,-1);
	    }
	    Student (String name){
	        this.name=name;
	    }
	    Student(String name,int id){
	        this(name);
	        this.id=id;
	    }
	    Student(String name,int id,int age){
	        this(name, id);
	        this.age=age;
	    }
	}
