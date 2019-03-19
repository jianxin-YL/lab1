package lab1;

public class triangleProblem {
    
	int numOfFifty = 1;
	int numOfTwenty = 1;
	int numOfFive = 2;
	int numOfOne = 3;
	
     public boolean f(int money) {
    	 if(money>=50 && this.numOfFifty>0) {
    		 this.numOfFifty -=1;
    		 return f(money-50);   		 
    	 }	
    	 else {
    		 if (money>=20 && this.numOfTwenty>0) {
    			 this.numOfTwenty -= 1;
    			 return f(money-20);
    		 }
    		 else {
    			 if(money>=5 && this.numOfFive>0) {
    				 this.numOfFive -= 1;
    				 return f(money-5);
    			 }
    			 else {
    				 if(money==1 || money==2 || money==3||money==0) {
    					 return true;
    				 }
    			 }	 
    		 }	 
    	 }
    	 return false;
     }
}
