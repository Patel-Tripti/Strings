package String;

public class Ass9 {
    public static void main(String[] args) {
        String str1 = "The quick brown fox jumps over the lazy dog.";
       
        String arr[]= str1.split(" ");

        for(int i=0;i<arr.length;i++){
            if(arr[i].equalsIgnoreCase("fox")){
                arr[i]="cat";
          }
        }  
        String newstr = " ";
        for(int i=0;i<arr.length;i++){
            newstr = newstr+arr[i]+" ";
            }
            str1 = newstr;
       System.out.println(str1);
    }
}
