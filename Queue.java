public class Queue{
  // Properties
  private Card front = null;
  private Card back = null;

  // Constructor: Using default constructor
  
  // Getter/Setter Methods
  
  public Card peek() {
    return this.front;
  }
  
  public void enqueue(Card newCard) {
    if (this.isEmpty()) {
      this.front = newCard;
      this.back = newCard;
    }
    else {
      this.back.setNext(newCard);
      this.back = newCard;
    }
  }

  public Card dequeue(){
    if (this.isEmpty()){
      return null;
    }
    else {
      Card tmp = this.front;
      this.front = front.getNext();
      if (this.front == null)
        this.back = null;
      return tmp;
    }
  }
  
  /* Traverses & prints list */
  public void print() {
    if (this.isEmpty()) {
      System.out.println("List is empty.");
    }
    else {
      Card tmp = this.front;
      while (tmp != null) {
        tmp.print();
        tmp = tmp.getNext();
      }
      System.out.println("");
    }
  }
  
  public boolean isEmpty() {
    return this.front==null;
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
    
    
    

   
    // Write pseudocode to do entire add method
    // use addToBeginning, addToEnd to stand in
    // for the stuff we already have done
    this.size++;
    }
  }*/
  
  public void destroy() {
    this.front = null;
    this.back = null;
  }
  
  public void populateDeck() {
    for (int i = 0; i < 4; i++) {
      for (int j = 1; j <= 13; j++) {
        switch (i) {
          case 1: 
            this.enqueue(new Card(j, "hearts"));
            break;
          case 2:
            this.enqueue(new Card(j, "diamonds"));
            break;
          case 3:
            this.enqueue(new Card(j, "clubs"));
            break;
          case 0:
            this.enqueue(new Card(j, "spades"));
            break;
        }
      }
    }
  }
  
}