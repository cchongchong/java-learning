import java.util.HashMap;
import java.util.Map;
public class Test{
	public static void main(String[] args){
		//System.console().writer().println("hello");
			Map<String,String> map1=new HashMap<>();
		for(int i=1;i<14;i++){
			map1.put("·½¿é"+i," ");
		}
		Map<String,String> map2=new HashMap<>();
		for(int i=1;i<14;i++){
			map2.put("ºìÌÒ"+i, " ");
		}
		Map<String,String> map3=new HashMap<>();
		for(int i=1;i<14;i++){
			map3.put("ºÚÌÒ"+i, " ");
		}
		Map<String,String> map4=new HashMap<>();
		for(int i=1;i<14;i++){
			map4.put("Ã·»¨"+i, " ");
		}
		map1.putAll(map2);
		map1.putAll(map3);
		map1.putAll(map4);
		for(Map.Entry<String,String> entry:map1.entrySet()){
			System.out.println(entry.getKey()+entry.getValue());
		}





	}	
}