public class Taxi {
	private int x = 0;
 	private int y = 0; 
 	private int xdest = 0;
 	private int ydest = 0;
	private String platenum = null;
	
	public Taxi (String platenum){
		this.platenum = platenum;
	}
	
	public void run (String s){
		//Attributes
	    for (int i = 0; i < s.length (); i++){
	    	char c = s.charAt (i); 
	    		
	    		if (c == 'l'){
	    			x--;
	    		} 
	    		else if (c == 'r'){
	    			x++;
	    			
	    		} 
	    		else if (c == 'd'){
	    			y--;
	    			
	    		} 
	    		else if (c == 'u'){
	    			y++;
	    			
	    		}
	     		else {
	     							
	    		}
   		 }
	}
	
	public void book (int x, int y) {
		xdest = x;
		ydest = y;
	}
	
	public void reachedDestination(){
			if (x == xdest && y == ydest){
				System.out.println(true);
			}
			else {
				System.out.println(false);
			}
	}
	
	public void printCurrentLocation (){
		System.out.println(x + " " +  y);
	}
	
}