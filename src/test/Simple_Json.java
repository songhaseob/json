package test;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Simple_Json {

	public static void main(String[] args) {
		
		//name, value값으로 데이터 입력
		JSONObject obj = new JSONObject();
		 obj.put("name", "홍길동");
	     obj.put("age", 2019);
	     
	     //List형식 데이터 입력(마지막에 List명 있어야함)
	     JSONArray list = new JSONArray();
	     list.add("messages01");
	     list.add("messages02");
	     list.add("messages03");
	 
	     obj.put("messages", list);
	     
	     //변환된 JSON파일을 저장
	     try(FileWriter file = new FileWriter("d:/D_Other/Data.json")) {
			file.write(obj.toJSONString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	     //JSON 내용 확인
	     System.out.println(obj);
	}

}
