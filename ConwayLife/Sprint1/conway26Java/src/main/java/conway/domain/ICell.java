package main.java.conway.domain;

public interface ICell {
	/* Una cella ha la capacità di impostare il proprio stato interno a seconda di un valore booleano */
	  void setStatus(boolean v);

	/* Una cella, come entità, ha la capacità di rispondere alla "query" isAlive rispondendo con il valore dello stato */
	  boolean isAlive();
	
	/* Una cella ha la capacità di cambiare il proprio stato da viva a morta e da morta a viva */
	  void switchCellState(); 
}