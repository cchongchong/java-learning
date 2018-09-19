package test2;

public class Poker{
	public Card id2;
	public Card id3;
	public Card id4;
	public Card id5;
	public Card id6;
	public Card id7;
	public Card id8;
	public Card id9;
	public Card id10;
	public Card J;
	public Card Q;
	public Card K;
	public Card A;
	
	public Poker(Integer type){
		this.id2=new Card(2, type);
		this.id3=new Card(3, type);
		this.id4=new Card(4, type);
		this.id5=new Card(5, type);
		this.id6=new Card(6, type);
		this.id7=new Card(7, type);
		this.id8=new Card(8, type);
		this.id9=new Card(9, type);
		this.id10=new Card(10, type);
		this.J=new Card(11, type);
		this.Q=new Card(12, type);
		this.K=new Card(13, type);
		this.A=new Card(14, type);
	}

	public Card getId2() {
		return id2;
	}

	public void setId2(Card id2) {
		this.id2 = id2;
	}

	public Card getId3() {
		return id3;
	}

	public void setId3(Card id3) {
		this.id3 = id3;
	}

	public Card getId4() {
		return id4;
	}

	public void setId4(Card id4) {
		this.id4 = id4;
	}

	public Card getId5() {
		return id5;
	}

	public void setId5(Card id5) {
		this.id5 = id5;
	}

	public Card getId6() {
		return id6;
	}

	public void setId6(Card id6) {
		this.id6 = id6;
	}

	public Card getId7() {
		return id7;
	}

	public void setId7(Card id7) {
		this.id7 = id7;
	}

	public Card getId8() {
		return id8;
	}

	public void setId8(Card id8) {
		this.id8 = id8;
	}

	public Card getId9() {
		return id9;
	}

	public void setId9(Card id9) {
		this.id9 = id9;
	}

	public Card getId10() {
		return id10;
	}

	public void setId10(Card id10) {
		this.id10 = id10;
	}

	public Card getJ() {
		return J;
	}

	public void setJ(Card j) {
		J = j;
	}

	public Card getQ() {
		return Q;
	}

	public void setQ(Card q) {
		Q = q;
	}

	public Card getK() {
		return K;
	}

	public void setK(Card k) {
		K = k;
	}

	public Card getA() {
		return A;
	}

	public void setA(Card a) {
		A = a;
	}

	@Override
	public String toString() {
		return "Poker [id2=" + id2 + ", id3=" + id3 + ", id4=" + id4 + ", id5=" + id5 + ", id6=" + id6 + ", id7=" + id7
				+ ", id8=" + id8 + ", id9=" + id9 + ", id10=" + id10 + ", J=" + J + ", Q=" + Q + ", K=" + K + ", A=" + A
				+ "]";
	}
	
}
