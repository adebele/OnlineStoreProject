package store;

public class Main {
	public static void main(String[] args) {

		System.out.println(camelCase("my name is brain"));
	}
	public static String camelCase(String in){
		String[] s1=in.split(" ");
		String f="";
		for(int i=0; i<s1.length; i++) {
			char c = s1[i].charAt(0);
			String s2= " "+c;
			s2=s2.toUpperCase();
			s1[i]=s2+s1[i].substring(1);
			f+=s1[i];
		}
		
		//TODO
		f=f.trim();
		return f;
	}
}