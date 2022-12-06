package ex1;

public class Triplet<P, L, S> {
  private P objetP;
  private L objetL;
  private S objetS;
  
  public Triplet(P objetP, L objetL, S objetS){
    this.objetP = objetP;
    this.objetL = objetL;
    this.objetS = objetS;
  }

  public P getPremier(){
    return this.objetP;
  }

  public L getSecond(){
    return this.objetL;
  }

  public S getTroisieme(){
    return this.objetS;
  }
}