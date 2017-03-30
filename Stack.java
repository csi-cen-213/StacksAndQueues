public class Stack{
  // Properties
  private Card top = null;

  // Constructor: Using default constructor
  
  // Getter/Setter Methods
  
  public Card peek() {
    return this.top;
  }
  
  public void setTop(Card newCard) {
    this.top = newCard;
  }
  
  /* Traverses & prints list */
  public void print() {
    if (this.isEmpty()) {
      System.out.println("List is empty.");
    }
    else {
      Card tmp = this.top;
      while (tmp != null) {
        tmp.print();
        tmp = tmp.getNext();
      }
      System.out.println("");
    }
  }
  
  public boolean isEmpty() {
    return this.top==null;
  }
  
  public void push(Card newCard) {
    newCard.setNext(this.top);
    this.top = newCard;
  }
  
  public Card pop(){
    if (this.isEmpty()){
      return null;
    }
    else {
      Card tmp = this.top;
      this.top = top.getNext();
      return tmp;
    }
  }
  /*public void add(int index, int data) {
    Card newCard = new Card(data);
    
    if( index > this.size)
      //error
      System.out.println("Index " + index + " does not exist.");
    else {
      // if list is empty, newCard is head
      if (this.isEmpty()) {
        this.head = newCard;
      }
      // adds to front of list
      else if (index == 0) {
        newCard.setNext(head);
        this.head = newCard;
      }
      else if (index == this.size) {
        // adds to end of list
        Card current = this.head;
        while (current.getNext() != null) {
          current = current.getNext();
        }
        current.setNext(newCard);
      }
      else {
        // adds to middle of list
        Card current = this.head;
        for(int i = 0; i < index - 1; i++) {
          current = current.getNext();
        }
        newCard.setNext(current.getNext());
        current.setNext(newCard);
      }
    
    
    

   
    }
  }*/
  
  
  
  
  
  public void destroy() {
    this.top = null;
  }
  
}