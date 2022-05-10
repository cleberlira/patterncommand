package command;

public class SomComCD implements Command{

    Som som;
    public SomComCD(Som som)
    {
        this.som = som;
    }
    public void execute()
    {
       som.ligar();
       som.setCD();
       som.setVolume(11);
    }
	
	
}
