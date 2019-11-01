package h_useful;

public class AssignmentStringMethod {

	public static void main(String[] args) {

		/*String s = new String("hola");
		System.out.println(s);
		//주어진 문자열 (s)를 갖는 String 인스턴스를 생성한다.
		
		char[] c={'H','O','L','A'};
		String a = new String(c);
		System.out.println(a);
		//주어진 문자열(value)을 갖는 String인스턴스를 생성한다.
		
		StringBuffer sb= new StringBuffer("Hello");
		String b = new String(sb);
		System.out.println(b);
		//인스턴스가 갖고 있는 문자열과 같은 내용의 String인스턴스를 생성한다.
*/
		/*String s ="Hello";
		String n ="0123456";
		char c =s.charAt(1);
		char c2 =n.charAt(1);
		System.out.println(c);
		System.out.println(c2);
		
		int i="aaa".compareTo("aaa");
		int i2="aaa".compareTo("bbb");
		int i3="bbb".compareTo("aaa");
		//순서 비교
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		
		
		String s1 = "Hello";
		String s2= s1.concat("world");
		System.out.println(s2);
		
		String cc ="abcdefg";
		boolean b = cc.contains("bc");
		System.out.println(b);
		
		String file="hello.txt";
		boolean ce =file.endsWith("txt");
		System.out.println(ce);
		
		String h="hello";
		boolean sd = h.equals("Hello");
		boolean ed = h.equals("hello");
		System.out.println(sd);
		System.out.println(ed);
		
		String he="hello";
		boolean ig = he.equalsIgnoreCase("Hello");
		boolean ig1 = he.equalsIgnoreCase("heLLo");
		System.out.println(ig);
		System.out.println(ig1);
		
		String a = "hello"; 
		int idx = a.indexOf('o');
		int idx1 = a.indexOf('k');
		System.out.println(idx);
		System.out.println(idx1);
		
		String alf = "ABCDEFG";
		int idx3= alf.indexOf("CD");
		System.out.println(idx3);
		
		String s = new String ("abc");
		String s2 = new String("abc");
		boolean b = (s==s2);
		boolean b2 = s.equals(s2);
		boolean b3= (s.intern()==s2.intern());
		
		System.out.println(b);
		System.out.println(b2);
		System.out.println(b3);
		
		String ja= "java.lang.Object";
		int idx1= ja.lastIndexOf('.');
		int idx2= ja.indexOf('.');
		System.out.println(idx1);
		System.out.println(idx2);
		
		String ja2= "java.lang.java";
		int idx3= ja2.lastIndexOf("java");
		int idx4= ja2.indexOf("java");
		System.out.println(idx3);
		System.out.println(idx4);
		
		String s="Hello";
		int length =s.length();
		System.out.println(length);
		
		String s1 =s.replace('H','C');
		System.out.println(s1);
		
		String ss = "Hellollo";
		String s2 = ss.replace("ll","LL");
		System.out.println(s2);
		
		String ab= "AABBAABB";
		String r = ab.replaceAll("BB","bb");
		System.out.println(r);
		
		String rr = ab.replaceFirst("BB","bb");
		System.out.println(rr);
		
		String animals="dog,cat,bear";
		String[] arr = animals.split(",");
		System.out.println(arr[0]);
		
		String sos = "java.lang.Object";
		boolean bb= sos.startsWith("java");
		boolean cc= sos.startsWith("lang");
		System.out.println(bb);
		System.out.println(cc);
		
		String c =sos.substring(10);
		String d =sos.substring(5,9);
		
		System.out.println(c);
		System.out.println(d);*/
		
		String abc="Hello";
		String ac = abc.toLowerCase();
		System.out.println(ac);

		String ae = abc.toString();
		System.out.println(ae);
		
		String aw = abc.toUpperCase();
		System.out.println(aw);
		
		String s=" Hello World";
		String s1= s.trim();
		System.out.println(s1);
		
		String b=String.valueOf(true);
		String c=String.valueOf('a');
		String i=String.valueOf(100);
		String l=String.valueOf(100L);
		String f=String.valueOf(10f);
		String d=String.valueOf(10.0);
		
		java.util.Date dd= new java.util.Date();
		String date = String.valueOf(dd);
		System.out.println(b);
		System.out.println(c);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(date);
		
		
		
	
	
	}

}
