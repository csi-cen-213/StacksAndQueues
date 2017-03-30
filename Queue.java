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
  
}