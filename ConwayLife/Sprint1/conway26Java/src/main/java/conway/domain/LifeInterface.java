package main.java.conway.domain;

public interface LifeInterface {
	/* Life, come entità, ha la capacità di calcolare il valore del suo stato alla generazione successiva */
      void nextGeneration();

    /* Life ha la capacità di restituire il valore di una cella a seconda degli indici di riga e colonna (della cella) passati come parametri */
      boolean isAlive(int row, int col);

    /* Life ha la capacità di impostare lo stato di una cella i cui indici di riga e colonna sono passati come parametri a seconda del valore di un booleano */
      void setCell(int row, int col, boolean alive);
    
    /* Life ha la capacità di restituire una cella i cui indici di riga e colonna sono passati come parametri */
      ICell getCell(int x, int y);
    
    /* Life ha la capacità di restituire la griglia */
      IGrid getGrid();
    
    /* Life ha la capacità di resettare la griglia */
      void resetGrid();
}
