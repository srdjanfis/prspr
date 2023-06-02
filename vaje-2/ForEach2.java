import java.util.Arrays;
class ForEach2
{
  public static void main(String args[])  {
    String str1 = "wxyz";
		String str2 = "zyxw";
		System.out.println("String-1 : "+str1);
		System.out.println("String-2 : "+str2);
		boolean anagram = true;
		if(str1.length() == str2.length()){
		  char[] cstr1 = str1.toCharArray();
		  char[] cstr2 = str2.toCharArray();
		  Arrays.sort(cstr1);
	  	Arrays.sort(cstr2);
	  	int i = 0;
	  	for(char c1: cstr1){
	  	  if(c1!=cstr2[i]){
	  	    anagram = false;
	  	    break;
	  	  }
	  	  i++;
	  	}

		} else{
		  anagram = false;
		}
		if(anagram){
		  System.out.println("Yes");
		}else{
		  System.out.println("No");
		}



  }
}  
