class StringManipulation
{
   public static void main (String a[ ])
{ 
StringBuffer str =new StringBuffer ("Object language");
System.out.println("Original String:"+str);
System.out.println("Length of string:"+str.length());
for(int i=0;i<str.length();i++)
{ int p=i+1;
  System.out.println("Character at position"+p+"is"+str.charAt(i));
}
String aString=new String(str.toString() );
int pos= aString indexOf("language");
str.insert(process,"Oriented");
System.out.println("Modified string:"+str);
}
}
