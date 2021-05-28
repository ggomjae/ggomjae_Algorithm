import java.util.*;

public class 완주하지_못한_선수 {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String,Integer> hm = new HashMap<>();

		for(String s : participant){
			if(hm.containsKey(s)) hm.put(s, hm.get(s) + 1);
			else hm.put(s,1);
		}
		for(String s : completion) hm.put(s,hm.get(s) - 1);
		for(String s : hm.keySet()){
			if(hm.get(s) > 0){
				answer = s;
				break;
			}
		}
		return answer;
	}
}
