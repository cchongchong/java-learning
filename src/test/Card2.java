
import java.util.Random;

public class Card2 {
	public static void main(String[] args) {
		Poker[] p=new Poker[52];
		for(int i =0;i<13;i++){
			p[i]=new Poker("����", i+1);
			//System.out.println(p[i].getSuit()+p[i].getNum());
		}
		int x=1;
		while(x<13){
			for(int i =13;i<26;i++){
				p[i]=new Poker("����", x++);
				//System.out.println(p[i].getSuit()+p[i].getNum());
			}
		}
		int z=1;
		while(z<13){
			for(int i =26;i<39;i++){
				p[i]=new Poker("����", z++);
				//System.out.println(p[i].getSuit()+p[i].getNum());
			}
		}
		int j=1;
		while(j<13){
			for(int i =39;i<52;i++){
				p[i]=new Poker("÷��", j++);
				//System.out.println(p[i].getSuit()+p[i].getNum());
			}
		}

//		int i=0;
//		while(i<52){
//			System.out.println(p[i].getSuit()+p[i].getNum());
//			i++;
//		}
		int count=p.length;
		int runcount=0;
		int randcount=0;
		int position=0;//�����λ��
		int k=0;
		Poker[] p2=new Poker[52];
		do{
			runcount++;
			//System.out.println(runcount);
			Random random=new Random();
			int r=count-randcount;
			position=random.nextInt(r); //����±�
			p2[k++]=p[position];
			randcount++;
			p[position]=p[r-1];//���һλ�ŵ�position;
			
		}while(randcount<count);
		System.out.println("�������"+runcount);

		int i=0;
		while(i<52){
			System.out.println(p2[i].getSuit()+p2[i].getNum());
			i++;
		}
		
	}
	
	
}

class Poker{
	public String suit;
	public int num;
	
	public Poker(){
		suit=null;
		num=0;
	}
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

