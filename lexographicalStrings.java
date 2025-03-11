public class lexographicalStrings{

    public static int checkStrings(String str1, String str2){
      str1 = str1.toLowerCase();
      str2 = str2.toLowerCase();
      for(int i=0; i<str1.length(); i++){
         if(str1.charAt(i) > str2.charAt(i)){
           return 1;
         }
         else if(str1.charAt(i) < str2.charAt(i)){
           return -1;
         }
      }
      return 0;
    }
  
    public static void main(String[] args){
      String str1 = "Siddhant";
      String str2 = "siddhant";
      System.out.print(checkStrings(str1, str2));
    }
  }