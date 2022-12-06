package ex3;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Retour{
  public static <T> T getRandomValue(T[] tableau){
		List<T> list = Arrays.asList(tableau);
		Collections.shuffle(list);
		list.toArray(tableau);
    return tableau[0];
  }
}