public class Queue{
  // Properties
  private Node front = null;
  private Node back = null;

  // Constructor: Using default constructor
  
  // Getter/Setter Methods
  
  public Node peek() {
    return this.front;
  }
  
  public void enqueue(Node newNode) {
    if (this.isEmpty()) {
      this.front = newNode;
      this.back = newNode;
    }
    else {
      this.back.setNext(newNode);
      this.back = newNode;
    }
  }

  public Node dequeue(){
    if (this.isEmpty()){
      return null;
    }
    else {
      Node tmp = this.front;
      this.front = front.getNext();
      return tmp;
    }
  }
  
  /* Traverses & prints list */
  public void print() {
    if (this.isEmpty()) {
      System.out.println("List is empty.");
    }
    else {
      Node tmp = this.front;
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
    Node newNode = new Node(data);
    
    if( index > this.size)
      //error
      System.out.println("Index " + index + " does not exist.");
    else {
      // if list is empty, newNode is head
      if (this.isEmpty()) {
        this.head = newNode;
      }
      // adds to front of list
      else if (index == 0) {
        newNode.setNext(head);
        this.head = newNode;
      }
      else if (index == this.size) {
        // adds to end of list
        Node current = this.head;
        while (current.getNext() != null) {
          current = current.getNext();
        }
        current.setNext(newNode);
      }
      else {
        // adds to middle of list
        Node current = this.head;
        for(int i = 0; i < index - 1; i++) {
          current = current.getNext();
        }
        newNode.setNext(current.getNext());
        current.setNext(newNode);
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
            this.enqueue(new Node(j, "hearts"));
            break;
          case 2:
            this.enqueue(new Node(j, "diamonds"));
            break;
          case 3:
            this.enqueue(new Node(j, "clubs"));
            break;
          case 0:
            this.enqueue(new Node(j, "spades"));
            break;
        }
      }
    }
  }
  
}