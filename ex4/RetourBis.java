package ex4;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.*;
import java.util.stream.Collectors;

public class RetourBis {
  
  public static <T> T getRandomValue(T[] tableau, T[] tableauBis){
		
    List<T> list = Arrays.asList(tableau);
    List<T> listBis = Arrays.asList(tableauBis);
    
		Collections.shuffle(list);
    Collections.shuffle(listBis);
    
		list.toArray(tableau);
    listBis.toArray(tableauBis);

    //T[] returnedArray;
    //returnedArray.add(tableau);
    //returnedArray.add(tableauBis);
    
    return tableau[0];
    
  }
  
}