
import java.util.Random;

public class Card2 {
	public static void main(String[] args) {
		Poker[] p=new Poker[52];
		for(int i =0;i<13;i++){
			p[i]=new Poker("红桃", i+1);
			//System.out.println(p[i].getSuit()+p[i].getNum());
		}
		int x=1;
		while(x<13){
			for(int i =13;i<26;i++){
				p[i]=new Poker("黑桃", x++);
				//System.out.println(p[i].getSuit()+p[i].getNum());
			}
		}
		int z=1;
		while(z<13){
			for(int i =26;i<39;i++){
				p[i]=new Poker("方块", z++);
				//System.out.println(p[i].getSuit()+p[i].getNum());
			}
		}
		int j=1;
		while(j<13){
			for(int i =39;i<52;i++){
				p[i]=new Poker("梅花", j++);
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
		int position=0;//随机的位置
		int k=0;
		Poker[] p2=new Poker[52];
		do{
			runcount++;
			//System.out.println(runcount);
			Random random=new Random();
			int r=count-randcount;
			position=random.nextInt(r); //随机下标
			p2[k++]=p[position];
			randcount++;
			p[position]=p[r-1];//最后一位放到position;
			
		}while(randcount<count);
		System.out.println("运算次数"+runcount);

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

