package test2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Controller {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Set<Poker> pokers=new HashSet<>();
		Poker C=new Poker(1);
		Poker P=new Poker(2);
		Poker R=new Poker(3);
		Poker B=new Poker(4);
		
		Poker[] poker={C,P,R,B};
		for(int i=0;i<poker.length;i++){
			Field[] fields=poker[i].getClass().getDeclaredFields();//获得所有字段
			String name=null;//fieldName
			for(int j=0;j<fields.length;j++){
				name=fields[j].getName();
				name=name.substring(0,1).toUpperCase()+name.substring(1);
				Method m=poker[i].getClass().getMethod("get"+name);
				String type=fields[j].getGenericType().toString();
				if(type.equals("class test2.my.Card")){
					Card value=(Card) m.invoke(poker[i]);
					
					String strSuit=showName(value.getType(),0);
					String strNum=showName(value.getId(),1);
					System.out.println(strSuit+strNum);
				}
			}
		}
	}
	
	// 显示牌的名称
    private static  String showName(Integer i, Integer type) {
        String str = "";

        // 显示花色
        if (type == 0) {
            switch (i) {
            case 1: {
                str = "方块";
                break;
            }
            case 2: {
                str = "梅花";
                break;
            }
            case 3: {
                str = "红桃";
                break;
            }
            case 4: {
                str = "黑桃";
                break;
            }

            default: {
                break;
            }
            }

        }

        // 显示数字
        if (type == 1) {
            if (i < 11) {
                return i.toString();
            } else {
                switch (i) {
                case 11: {
                    str = "J";
                    break;
                }
                case 12: {
                    str = "Q";
                    break;
                }
                case 13: {
                    str = "K";
                    break;
                }
                case 14: {
                    str = "A";
                    break;
                }

                default: {
                    break;
                }
                }
            }
        }

        return str;
    }
}
