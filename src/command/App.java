package command;

public class App {

	public static void main(String[] args) {
	  ControleRemoto controle = new ControleRemoto();
      Luz luz = new Luz();
      
      Luz luz2 = new Luz();
      
      Som som = new Som();

      //controle.setCommand(new LuzLigada(luz));
      controle.setCommand(new LuzLigada(luz2));
      
      controle.butaopressionado();
      //controle.butaopressionado();
      
      controle.setCommand(new SomComCD(som));
      
      controle.butaopressionado();
     
      controle.setCommand(new SomDesligado(som));
      
      controle.butaopressionado();  

	}

}
