 public static String findLargestOddSubstring(String num) {
     //write your code here...
      String subnum;
     for(int i=num.length()-1;i>=0;i--){
         if((num.charAt(i)-'0')%2!=0){
              subnum = num.substring(0,i+1);
              return subnum;
         }
         
     }
     return "-1";
 }