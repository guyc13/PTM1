package boot;

import server_side.ClientHandler;
import server_side.MySerialServer;
import server_side.MyTestClientHandler;
import server_side.Server;


import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		int port = Integer.parseInt(args[0]);
//		Solver sol = new StringReverser();
//		CacheManager cm = new FileCacheManager<String, String>();
		ClientHandler ch = new MyTestClientHandler();
		
		
		Server s =new MySerialServer();
		s.open(port, ch);
		

//		StringReverser a= new StringReverser();
//		String b=a.solve("ABC");
//		System.out.println(b);
//		
//		FileCacheManager f =new FileCacheManager();
//		
//		boolean test =f.findSolution("ABC");
//		System.out.println(test);
//		f.saveSolution(b, "ABC", "C:\\blumi12");
//		
//		boolean test1 = f.findSolution("ABC");
//		System.out.println(test1);
//		
//		Object d =f.querySolution("ABC", "c:\\blumi12");
//		System.out.println(d);
//		

//		HashMap<String, Integer> map = new HashMap<String, Integer>();
//		
//		System.out.println(map);
//		
//		map.put("a", 10);
//		map.put("b", 20);
//		map.put("c", 30);
//		
//		System.out.println("Size of map is:- "
//                + map.size()); 
//		
//		System.out.println(map);

	}

}
