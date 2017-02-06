public class UserMainCode {
	static boolean validatePlayer(String s1,String s2,String s3){
		boolean i=false;
		String j[]=s2.split(" ");
		String k[]=s3.split("#");
		int b=j.length;
		int c=k.length;
		if(b==1){
			String p=j[0].substring(0,3);
			p=p.toUpperCase();
			if(s1.equals(k[0]) && p.equals(k[1])){
				i=true;
			}
		}
		else{
			char ch[]=new char[b];
			for(int m=0;m<b;m++){
				ch[m]=j[m].charAt(0);
			}
			String my=new String(ch);
			my=my.toUpperCase();
			if(s1.equals(k[0]) && my.equals(k[1])){
				i=true;
			}
		}
		return i;
	}
}
