public class Queue extends Stack{
  // Properties
  private Card bottom = null;

  // Constructor: Using default constructor
  
  // Getter/Setter Methods
  
  @Override
  public void addCard(Card newCard) {
    if (this.isEmpty()) {
      this.top = newCard;
      this.bottom = newCard;
    }
    else {
      this.bottom.setNext(newCard);
      this.bottom = newCard;
    }
  }

  @Override
  public Card removeCard(){
    if (this.isEmpty()){
      return null;
    }
    else {
      Card tmp = this.top;
      this.top = top.getNext();
      if (this.top == null)
        this.bottom = null;
      return tmp;
    }
  }
  
  @Override
  public void destroy() {
    this.top = null;
    this.bottom = null;
  }
  
  public void playWar() {
    this.shuffle();
    int turns = 0;
    Queue other = new Queue();
    Stack ownStack = new Stack();
    Stack otherStack = new Stack();
    for (int i = 0; i < 25; i++) 
      other.addCard(this.removeCard());
    while (!this.isEmpty() && !other.isEmpty()) {
      turns++;
      ownStack.addCard(this.removeCard());
      otherStack.addCard(other.removeCard());
        if (ownStack.peek().getRank() > 
            otherStack.peek().getRank()) {
          // code for this winning
          while (!ownStack.isEmpty()) {
            System.out.print("This: ");
            ownStack.peek().print();
            System.out.print("Other: ");
            otherStack.peek().print();
            System.out.println("This wins this round!");
            this.addCard(ownStack.removeCard());
            this.addCard(otherStack.removeCard());
          }
        }
        else if (ownStack.peek().getRank() < 
                 otherStack.peek().getRank()) {
          // code for other winning
          while (! ownStack.isEmpty()) {
            System.out.print("This: ");
            ownStack.peek().print();
            System.out.print("Other: ");
            otherStack.peek().print();
            System.out.println("Other wins this round!");
            other.addCard(ownStack.removeCard());
            other.addCard(otherStack.removeCard());
          }
        }
        else if (ownStack.peek().getRank() == 
          otherStack.peek().getRank()) {
            System.out.print("This: ");
            ownStack.peek().print();
            System.out.print("Other: ");
            otherStack.peek().print();
            System.out.println("Tie!");
        }
      }
    System.out.println("Turns: " + turns);
    if (this.isEmpty()) 
      System.out.println("Winner: Other");
    else
      System.out.println("Winner: This");
  }
  
}