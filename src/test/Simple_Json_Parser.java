package test;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Simple_Json_Parser {

	public static void main(String[] args) {
		JSONParser parser = new JSONParser();

		// 저장된 JSON파일 읽어와서 데이터를 출력
		try (Reader reader = new FileReader("d:/D_Other/Data.json")) {

			// 저장된 JSON 데이터 출력
			JSONObject jsonObject = (JSONObject) parser.parse(reader);
			System.out.println(jsonObject);
			
			// name이라는 이름의 값 출력
			String name = (String) jsonObject.get("name");
			System.out.println(name);

			// age이라는 이름의 값 출력
			long age = (Long) jsonObject.get("age");
			System.out.println(age);

			// List값 출력
			JSONArray msg = (JSONArray) jsonObject.get("messages");
			Iterator<String> iterator = msg.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
