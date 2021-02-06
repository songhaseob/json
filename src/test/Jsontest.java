package test;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

public class Jsontest {

	public static void main(String[] args) {
		Gson gsonObj = new Gson();
		Map<String, String> inputMap = new HashMap<String, String>();
		
		inputMap.put("name", "makesomething");
		inputMap.put("어드레스", "대전광역시 중구 대덕구");
		        
		// MAP -> JSON 예제
		String jsonStr = gsonObj.toJson(inputMap);
		System.out.println("MAP -> JSON 예제 : " + jsonStr);
		        
		// MAP -> JSON 예제
		Map map = gsonObj.fromJson(jsonStr, Map.class);
		System.out.println("JSON -> MAP 예제 : " + map.toString());


	}

}
