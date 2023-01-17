package csd;

class App {
	public static void main(String [] args)
	{
		ConcatWithHyphenApp.run();	
	}
}

class ConcatWithHyphenApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		String str = "";
		
		for (;;) {
			System.out.print("Input a text:");
			String s = kb.nextLine();
			
			if ("quit".equals(s))
				break;
			
			if (!s.trim().isEmpty())
				str += s.trim() + "-";
		}
		
		if (!str.isEmpty())
			str = str.substring(0, str.length() - 1);
		
		System.out.println(str);
	}
}




