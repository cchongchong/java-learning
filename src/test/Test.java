
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
	//R代表红桃. B代表黑桃. C代表方块. P代表梅花
	public String card1="R1";
	public String card2="R2";
	public String card3="R3";
	public String card4="R4";
	public String card5="R5";
	public String card6="R6";
	public String card7="R7";
	public String card8="R8";
	public String card9="R9";
	public String card10="R10";
	public String card11="R11";
	public String card12="R12";
	public String card13="R13";
	public String card14="B1";
	public String card15="B2";
	public String card16="B3";
	public String card17="B4";
	public String card18="B5";
	public String card19="B6";
	public String card20="B7";
	public String card21="B8";
	public String card22="B9";
	public String card23="B10";
	public String card24="B11";
	public String card25="B12";
	public String card26="B13";
	public String card27="C1";
	public String card28="C2";
	public String card29="C3";
	public String card30="C4";
	public String card31="C5";
	public String card32="C6";
	public String card33="C7";
	public String card34="C8";
	public String card35="C9";
	public String card36="C10";
	public String card37="C11";
	public String card38="C12";
	public String card39="C13";
	public String card40="P1";
	public String card41="P2";
	public String card42="P3";
	public String card43="P4";
	public String card44="P5";
	public String card45="P6";
	public String card46="P7";
	public String card47="P8";
	public String card48="P9";
	public String card49="P10";
	public String card50="P11";
	public String card51="P12";
	public String card52="P13";
	public String getCard1() {
		return card1;
	}
	public void setCard1(String card1) {
		this.card1 = card1;
	}
	public String getCard2() {
		return card2;
	}
	public void setCard2(String card2) {
		this.card2 = card2;
	}
	public String getCard3() {
		return card3;
	}
	public void setCard3(String card3) {
		this.card3 = card3;
	}
	public String getCard4() {
		return card4;
	}
	public void setCard4(String card4) {
		this.card4 = card4;
	}
	public String getCard5() {
		return card5;
	}
	public void setCard5(String card5) {
		this.card5 = card5;
	}
	public String getCard6() {
		return card6;
	}
	public void setCard6(String card6) {
		this.card6 = card6;
	}
	public String getCard7() {
		return card7;
	}
	public void setCard7(String card7) {
		this.card7 = card7;
	}
	public String getCard8() {
		return card8;
	}
	public void setCard8(String card8) {
		this.card8 = card8;
	}
	public String getCard9() {
		return card9;
	}
	public void setCard9(String card9) {
		this.card9 = card9;
	}
	public String getCard10() {
		return card10;
	}
	public void setCard10(String card10) {
		this.card10 = card10;
	}
	public String getCard11() {
		return card11;
	}
	public void setCard11(String card11) {
		this.card11 = card11;
	}
	public String getCard12() {
		return card12;
	}
	public void setCard12(String card12) {
		this.card12 = card12;
	}
	public String getCard13() {
		return card13;
	}
	public void setCard13(String card13) {
		this.card13 = card13;
	}
	public String getCard14() {
		return card14;
	}
	public void setCard14(String card14) {
		this.card14 = card14;
	}
	public String getCard15() {
		return card15;
	}
	public void setCard15(String card15) {
		this.card15 = card15;
	}
	public String getCard16() {
		return card16;
	}
	public void setCard16(String card16) {
		this.card16 = card16;
	}
	public String getCard17() {
		return card17;
	}
	public void setCard17(String card17) {
		this.card17 = card17;
	}
	public String getCard18() {
		return card18;
	}
	public void setCard18(String card18) {
		this.card18 = card18;
	}
	public String getCard19() {
		return card19;
	}
	public void setCard19(String card19) {
		this.card19 = card19;
	}
	public String getCard20() {
		return card20;
	}
	public void setCard20(String card20) {
		this.card20 = card20;
	}
	public String getCard21() {
		return card21;
	}
	public void setCard21(String card21) {
		this.card21 = card21;
	}
	public String getCard22() {
		return card22;
	}
	public void setCard22(String card22) {
		this.card22 = card22;
	}
	public String getCard23() {
		return card23;
	}
	public void setCard23(String card23) {
		this.card23 = card23;
	}
	public String getCard24() {
		return card24;
	}
	public void setCard24(String card24) {
		this.card24 = card24;
	}
	public String getCard25() {
		return card25;
	}
	public void setCard25(String card25) {
		this.card25 = card25;
	}
	public String getCard26() {
		return card26;
	}
	public void setCard26(String card26) {
		this.card26 = card26;
	}
	public String getCard27() {
		return card27;
	}
	public void setCard27(String card27) {
		this.card27 = card27;
	}
	public String getCard28() {
		return card28;
	}
	public void setCard28(String card28) {
		this.card28 = card28;
	}
	public String getCard29() {
		return card29;
	}
	public void setCard29(String card29) {
		this.card29 = card29;
	}
	public String getCard30() {
		return card30;
	}
	public void setCard30(String card30) {
		this.card30 = card30;
	}
	public String getCard31() {
		return card31;
	}
	public void setCard31(String card31) {
		this.card31 = card31;
	}
	public String getCard32() {
		return card32;
	}
	public void setCard32(String card32) {
		this.card32 = card32;
	}
	public String getCard33() {
		return card33;
	}
	public void setCard33(String card33) {
		this.card33 = card33;
	}
	public String getCard34() {
		return card34;
	}
	public void setCard34(String card34) {
		this.card34 = card34;
	}
	public String getCard35() {
		return card35;
	}
	public void setCard35(String card35) {
		this.card35 = card35;
	}
	public String getCard36() {
		return card36;
	}
	public void setCard36(String card36) {
		this.card36 = card36;
	}
	public String getCard37() {
		return card37;
	}
	public void setCard37(String card37) {
		this.card37 = card37;
	}
	public String getCard38() {
		return card38;
	}
	public void setCard38(String card38) {
		this.card38 = card38;
	}
	public String getCard39() {
		return card39;
	}
	public void setCard39(String card39) {
		this.card39 = card39;
	}
	public String getCard40() {
		return card40;
	}
	public void setCard40(String card40) {
		this.card40 = card40;
	}
	public String getCard41() {
		return card41;
	}
	public void setCard41(String card41) {
		this.card41 = card41;
	}
	public String getCard42() {
		return card42;
	}
	public void setCard42(String card42) {
		this.card42 = card42;
	}
	public String getCard43() {
		return card43;
	}
	public void setCard43(String card43) {
		this.card43 = card43;
	}
	public String getCard44() {
		return card44;
	}
	public void setCard44(String card44) {
		this.card44 = card44;
	}
	public String getCard45() {
		return card45;
	}
	public void setCard45(String card45) {
		this.card45 = card45;
	}
	public String getCard46() {
		return card46;
	}
	public void setCard46(String card46) {
		this.card46 = card46;
	}
	public String getCard47() {
		return card47;
	}
	public void setCard47(String card47) {
		this.card47 = card47;
	}
	public String getCard48() {
		return card48;
	}
	public void setCard48(String card48) {
		this.card48 = card48;
	}
	public String getCard49() {
		return card49;
	}
	public void setCard49(String card49) {
		this.card49 = card49;
	}
	public String getCard50() {
		return card50;
	}
	public void setCard50(String card50) {
		this.card50 = card50;
	}
	public String getCard51() {
		return card51;
	}
	public void setCard51(String card51) {
		this.card51 = card51;
	}
	public String getCard52() {
		return card52;
	}
	public void setCard52(String card52) {
		this.card52 = card52;
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Test c=new Test();
		Field[] f=c.getClass().getDeclaredFields();
		String name=null;
		System.out.println("R代表红桃. B代表黑桃. C代表方块. P代表梅花");
		for(int i=0;i<f.length;i++){
			name=f[i].getName();
			name=name.substring(0, 1).toUpperCase()+name.substring(1);
			String type=f[i].getGenericType().toString();
			if(type.equals("class java.lang.String")){
				Method m=c.getClass().getMethod("get"+name);
				String value=(String) m.invoke(c);					
				System.out.println(value);
			}
		}
		
		
	}
	
}


