public class UserMainCode {
	public static boolean validatePlayer(String s, String p) {
		boolean k=true;
		char arr1[]=s.toCharArray();
		char arr2[]=p.toCharArray();
		for(int i=0;i<arr1.length;i++){
			if(i%2==0){
				if(arr1[i]=='*'){
					k=false;
					break;
				}
			}
			else{
				if(arr1[i]!='*'){
					k=false;
					break;
				}
			}
		}
		for(int i=0;i<arr2.length;i++){
			if(i%2==0){
				if(arr2[i]=='#'){
					k=false;
					break;
				}
			}
			else{
				if(arr2[i]!='#'){
					k=false;
					break;
				}
			}
		}
		return k;
	}
}
