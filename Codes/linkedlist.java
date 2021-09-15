import java.util.LinkedList;
public class linkedlist {
    public String name;
	public String phno;
	public String email;
	public String comname;
	public String modelno;
	    public linkedlist() {
	        name = "";
	        phno = "";
	        email = "";
	        comname = "";
	        modelno = "";
	    }


	    public linkedlist(String name, String phno, String email, String comname, String modelno ) {
	        this.name=name;
	        this.phno=phno;
	        this.email=email;
	        this.comname=comname;
	        this.modelno=modelno;
	        
	        }    
	    @Override
	    public String toString() {
	      return name+"\t"+phno+"\t"+email+"\t"+comname+"\t"+modelno+"\n";
	    }
}







