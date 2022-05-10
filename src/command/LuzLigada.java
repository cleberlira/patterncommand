package command;

public class LuzLigada implements Command {
	
	    Luz luz;
	  
	    public LuzLigada(Luz luz)
	    {
	       this.luz = luz;
	    }
	    
	    
	    public void execute()
	    {
	    	luz.ligar();
	    }
	}

