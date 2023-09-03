package javapractice;

public class ReplaceCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Geeks for Geeks";
		char c1='k';
		char c2='t';
		System.out.println(replaceChar(str1, c1, c2));
		
	}
	
	public static String replaceChar(String str,char old, char nw) {
	String result="";
	//Convert String to Array
	char[] words = str.toCharArray();
	char[] temp=new char[words.length];
	for (int i = 0; i < words.length; i++) {
		if(words[i]==(old)) {
			temp[i]=nw;
		}
		else {
			temp[i]=words[i];
		}
	}
	//Convert CharArray to String
	StringBuilder sb=new StringBuilder();
	
    for (int i = 0; i < temp.length; i++) {
		sb.append(temp[i]);
		
	}
    result=sb.toString();
	return result;
	}


}
