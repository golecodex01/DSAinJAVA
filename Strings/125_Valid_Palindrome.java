class Solution {
    public boolean isPalindrome(String s) {
        String clean="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
          if(ch>='A' && ch<='Z'){
            ch=(char)(ch+32);
          }
            clean =clean +ch;
        }
           String newclean="";
        for(int j=0;j<clean.length();j++){
          char ch=clean.charAt(j);
          if((ch>='a' && ch<='z') ||(ch>='0' && ch<='9')  ){
            newclean =newclean+ch;
          }

        }

          int start=0;
          int end=newclean.length()-1;

     while(start<end){
        if(newclean.charAt(start)!=newclean.charAt(end)){
            return false  ;
        }
        else{
            start++;
            end--;
        }
     }
     return true ;

    }
}
