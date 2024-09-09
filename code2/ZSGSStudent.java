
//2. Design a Student Parent class and ZSGSStudent Child class.
package inheritence2;
	public class ZSGSStudent extends Student{
	    int zsgsId;
	    ZSGSStudent(){
	        super();
	        this.zsgsId=-1;
	    }
	    ZSGSStudent(String name,int id,int zsgsId){
	        super(name,id);
	        this.zsgsId=zsgsId;
	    }
	    ZSGSStudent(String name,int id,int age,int zsgsId){
	        super(name,id,age);
	        this.zsgsId=zsgsId;
	    }
	}




