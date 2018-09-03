
public class Card {
	public static void main(String[] args) {
		Poker[] p=new Poker[52];
		for(int i =1;i<14;i++){
			p[i]=new Poker("ºìÌÒ", i);
			System.out.println(p[i].getSuit()+p[i].getNum());
		}
		for(int i =1;i<14;i++){
			p[i]=new Poker("ºÚÌÒ", i);
			System.out.println(p[i].getSuit()+p[i].getNum());
		}
		for(int i =1;i<14;i++){
			p[i]=new Poker("·½¿é", i);
			System.out.println(p[i].getSuit()+p[i].getNum());
		}
		for(int i =1;i<14;i++){
			p[i]=new Poker("Ã·»¨", i);
			System.out.println(p[i].getSuit()+p[i].getNum());
		}
		
	}
	
	
}

class Poker{
	public String suit;
	public int num;
	
	public Poker(String newSuit,int newNum){
		suit=newSuit;
		num=newNum;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}
