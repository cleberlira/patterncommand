package command;

public class SomDesligado implements Command {

	    Som som;
	    public SomDesligado(Som som)
	    {
	        this.som = som;
	    }
	    public void execute()
	    {
	       som.desligar();
	    }
	}

