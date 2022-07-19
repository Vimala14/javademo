class defAccessSpecifier
{ 
  void display() 
     { 
         System.out.println("I am using default access specifier"); 
     } 
} 

public class DefAccess {

	public static void main(String[] args) {
		//default
		System.out.println("Dafault Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier(); 		  
        obj.display(); 

	}
}
