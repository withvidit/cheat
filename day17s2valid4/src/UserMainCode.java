import java.util.*;
public class UserMainCode {

public boolean validateCity(String a)
{
String first=a.substring(0,2);
String last=a.substring((a.length()-2),(a.length()));
String middle=a.substring(2,(a.length()-2));
if(isAst(middle) && isAlpha(first) && isAlpha(last))
{
return true;
}
else
{
return false;
}
}
public boolean isAlpha(String name) {
   char[] chars = name.toCharArray();

   for (char c : chars) {
       if(!Character.isLetter(c)) {
           return false;
       }
   }

   return true;
}
public boolean isAst(String name) {
   char[] chars = name.toCharArray();

   for (char c : chars) {
       if(!(c=='*')) {
           return false;
       }
   }

   return true;
}
}
