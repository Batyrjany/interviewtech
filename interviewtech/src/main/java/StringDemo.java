
public class StringDemo {

	public static void main(String[] args) {
		String str1 = "apple";
        String str2 = new String("apple");
        String str3 = "apple";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str3);
        
        String reversed = "";
        
        for(int i = str1.length() -1; i>=0; i--) {
            reversed+=str1.charAt(i);
        }
        System.out.println(reversed);
        
        //Sentence 
        String st = "I like java very much.";
        
        String reversedSentence="";
        
        String[] sentenceArray = st.split(" ");
        
        for(int i = sentenceArray.length-1; i>=0; i--) {
            reversedSentence +=sentenceArray[i]+" ";
        }
        
        reversedSentence = reversedSentence.trim();
        
        reversedSentence.toLowerCase();
        
        System.out.println(reversedSentence);
        
        String reversed1="";
        for (int i =st.length()-1; i >= 0; i--) {
            reversed=reversed+st.charAt(i);
            
            
        }
        
    System.out.println(reversed1);
    }
        
        
        
	}
	

