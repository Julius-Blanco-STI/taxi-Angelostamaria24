public class Something {
    
    public static void main(String[] args) {
    	
    	Taxi x = new Taxi("lyk0324");
    	x.book(10,-1);
    	
    	x.run ("drrrrrrrrrr");
    	
    	//x.run("I am leaving on a helicopter");
    	
    	x.printCurrentLocation();
    		//x:_, y:_
    	//x.book(10,5);
        x.reachedDestination();
    		//false
    
    }
}
 