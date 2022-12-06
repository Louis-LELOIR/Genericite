package ex2;

public class TripletHeterogene<T> {
  private T premier, deuxieme, troisieme;

  public TripletHeterogene(T premier, T deuxieme, T troisieme) {
    this.premier = premier;
    this.deuxieme = deuxieme;
    this.troisieme = troisieme;
  }

  public T getPremier(){
    return premier;
  }

  public T getDeuxieme(){
    return deuxieme;
  }

  public T getTroisieme(){
    return troisieme;
  }

  public void afficher(){
    System.out.println("<premier : " + premier + ", second : " + deuxieme + ", troisieme : " + troisieme);
  }
}