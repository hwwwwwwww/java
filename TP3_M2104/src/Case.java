

public abstract class Case {

    private int position;
    
	 public Case(int position) {
		 this.position=position;
	    }
   
    public int getPosition() {
    	return this.position;
    }

   
    public abstract int nouvellePosition(int valeurD�);


   
}
