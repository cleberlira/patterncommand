package command;

public class LuzDesligada implements Command{

	    Luz luz;
	  
	    public LuzDesligada(Luz luz)
	    {
	       this.luz = luz;
	    }
	    
	    
	    public void execute()
	    {
	    	luz.desligar();
	    }
}
