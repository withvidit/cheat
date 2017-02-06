public class UserMainCode {
       public static int vowelcount(String s)
       {
              char a[]=s.toCharArray();
              int n=0;
              for(int i=0;i<a.length;i++)
              {
                     if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u' || a[i]=='A' ||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')
                     {
                           n++;
                     }
              }
              return n;
       }
}
