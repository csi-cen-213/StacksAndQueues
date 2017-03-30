public class Card{
  // Properties
  private int rank;
  private String suite;
  private Card next;
  
  // Constructor
  public Card() {
    this.rank = 0;
    this.suite = "Joker";
    this.next = null;
  }
  
  public Card(int rank, String suite) {
    this.rank = rank;
    this.suite = suite;
    this.next = null;
  }
  
  // Getter/Setter Methods
  
  public int getRank() {
    return this.rank;
  }
  
  public String getSuite() {
    return this.suite;
  }

  public Card getNext() {
    return this.next;
  }
  
  public void setNext(Card next) {
    this.next = next;
  }
  
  // Methods
  
  /* Prints data in node */
  public void print() {
    String rank;
    if (this.rank == 11)
      rank = "J";
    else if (this.rank ==12)
      rank = "Q";
    else if (this.rank ==13)
      rank = "K";
    else if (this.rank ==1)
      rank = "A";
    else 
      rank = Integer.toString(this.rank);
    System.out.print(rank + " of " + this.suite + " ");
  }
  
}