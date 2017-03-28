public class Main{
  public static void main(String [ ] args) {
    Node card1 = new Node(1,"Hearts");
    Node card2 = new Node(2,"Hearts");
    Node card3 = new Node(3,"Hearts");
    /*card1.print();
    card2.print();
    card3.print();*/
    Stack deck = new Stack();
    deck.push(card1);
    deck.push(card2);
    deck.push(card3);
    deck.print();
    deck.peek().print();
    deck.pop().print();
    deck.pop().print();
    deck.pop().print();
    System.out.println(deck.pop());
  }
}