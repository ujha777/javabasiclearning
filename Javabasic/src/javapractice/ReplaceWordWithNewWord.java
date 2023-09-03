package javapractice;

public class ReplaceWordWithNewWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Geeks for Geeks";
		String str2="Geeks";
		String str3="Java";
		System.out.println(replaceword(str1, str2, str3));
		
	}
	
	public static String replaceword(String str,String old, String nw) {
	String result="";
	//Convert String to Array
	String[] words = str.split(" ");
	String[] temp=new String[words.length];
	for (int i = 0; i < words.length; i++) {
		if(words[i].equals(old)) {
			temp[i]=nw;
		}
		else {
			temp[i]=words[i];
		}
	}
	//Convert Array to String
	for (String word : temp) {
		result=result+word+" ";
		
	}
	return result;
	}

}
