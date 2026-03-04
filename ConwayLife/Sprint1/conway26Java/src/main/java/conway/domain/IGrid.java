package main.java.conway.domain;

public interface IGrid {
	/* Una griglia ha la capacità di comunicare, rispondendo alla "query" getRowsNum, il numero delle righe che la compongono */
	  public int getRowsNum(); 
	  
	/* Una griglia ha la capacità di comunicare, rispondendo alla "query" getColsNum, il numero delle colonne che la compongono */  
	  public int getColsNum();
	
	/* Una griglia ha la capacità di impostare lo stato di una sua cella a seconda dell'indice di riga e colonna della cella e di un valore booleano */
	  public void setCellValue(int x, int y, boolean state);
	  
	/* Una griglia ha la capacità di rispondere alla "query" getCell rispondendo con la cella in corrispondenza degli indici di riga e colonna passati come parametri */  
	  public ICell getCell(int x, int y);
	  
	/* Una griglia ha la capacità di rispondere alla "query" getCellValue rispondendo con il valore della cella in corrispondenza degli indici di riga e colonna passati come parametri */
	  public boolean getCellValue(int x, int y);
	  
	/* Una griglia ha la capacità di resettarsi, quindi riportarsi allo stato iniziale */
	  public void reset();
}