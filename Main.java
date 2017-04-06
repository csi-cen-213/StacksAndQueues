public class Main{
  public static void main(String [ ] args) {
    Card card1 = new Card(1,"Hearts");
    Card card2 = new Card(2,"Hearts");
    Card card3 = new Card(3,"Hearts");
    Card card4 = new Card(4,"Hearts");
    Card card5 = new Card(5,"Hearts");
    Card card6 = new Card(6,"Hearts");
    /*card1.print();
    card2.print();
    card3.print();*/
    /*Stack deck = new Stack();
    deck.push(card1);
    deck.push(card2);
    deck.push(card3);
    deck.print();
    //deck.peek().print();
    deck.pop().print();
    deck.pop().print();
    deck.pop().print();
    System.out.println(deck.pop());
    Queue deck2 = new Queue();
    deck2.enqueue(card4);
    deck2.enqueue(card5);
    deck2.enqueue(card6);
    deck2.print();
    //deck2.peek().print();
    deck2.dequeue().print();
    deck2.dequeue().print();
    deck2.dequeue().print();
    System.out.println(deck2.dequeue());
    deck2.print();*/
    //Stack deck = new Stack();
    //deck.populateDeck();
    /*deck.addCard(card1);
    deck.addCard(card2);
    deck.addCard(card3);
    deck.addCard(card4);
    deck.addCard(card5);
    deck.addCard(card6);
    deck.print();
    deck.shuffle();
    deck.print();*/
    Queue deck = new Queue();
    deck.addCard(card1);
    deck.addCard(card2);
    deck.addCard(card3);
    deck.addCard(card4);
    //deck.addCard(card5);
    //deck.addCard(card6);
    deck.playWar();
  }

  
}