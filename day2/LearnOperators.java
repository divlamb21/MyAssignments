package week1.day2;

public class LearnOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Assignment
		
		int a=7;
		String name="Divya";
		
		//Arithmetic (add,sub,mul,div)
		 int b=4;
		 int c=2;
		 System.out.println(b+c);
		 System.out.println(b-c);
		 System.out.println(b*c);
		 
		 //div to get quotient /
		 System.out.println(b/c);
		 
		 //div to get remainder %
		 System.out.println(b%c);
		 
		 
		//Comparision
		
		 int s=5;
		 int t=6;
		 
		 //Compare two values
		 
		 //equalto ==
		 
		 //If condition satisfy it should return true 
		 //if condition not satisfies it should return false 
		 System.out.println(s==t); // 5==6 false
		 System.out.println(s<t);   //5<6 true
	     System.out.println(s>t);   //5>6 false
	     System.out.println(s!=t); //5 notequalto
	     
	     
	     //lessthanOrEqualto if any one condtion satisfies it will return true
	     
	    System.out.println(s<=t);
	    //greaterThanOrEqualto
	    System.out.println(s>=t);
	    System.out.println("__----------------------------------------------");
		 
		//Logical-We compare two conditions
		//AND && Condition 1 and Condition 2 both condition should satisfy it will return true else false
	    //OR  || Condition 2  any one should satisfy
	    
	    int x=4;
	    int y=5;
	    //AND
	    System.out.println(x==y&&x>y); //4==5  4>5
	   //OR
	    System.out.println(x==y||x<y);  //4==5  4<5
	    
		// Increment Operator
	    System.out.println("---------------------------------------------------");
	   
	    
	    //postIncrement- increase the value by 1 -symbol is( ++))
	    int p=7;
	    System.out.println(p++); //7 at first it will be same vale, it will be incremented in next iteration, it will increment in the current iteration
	    System.out.println(p); // 8 next it will increased
	    
	  //preIncrement symbol ++p
	     
	    System.out.println(++p); // 9 current iteration itself it will increment
	    
	    //Decrement
	    
	   
	    
	    //postdecrement
	    
	    System.out.println(p--); // it will not decrement at first //9
	    System.out.println(p); 
	    
	    //predecrement
	    
	   System.out.println(--p);
	   
	   
	   //int a=7
			//   a++
	   
	   
	   //Control Statements
	   
	   
	}

}
