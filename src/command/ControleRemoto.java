package command;

public class ControleRemoto {

	    Command comando;  
	  
	    public ControleRemoto()
	    {
	    }
	  
	    public void setCommand(Command comando)
	    {
	    	
	    	this.comando = comando;
	    }
	  
	    public void butaopressionado()
	    {
	    	comando.execute();
	    }
	}

