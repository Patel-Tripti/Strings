package String;
//reverse the string.....
 class _07s {
    public static void main(String[] args) {
        String s = "tripti";
        int t = s.length();
        String rev = "";
        for(int i = t-1;i>=0;i--){
          rev = rev+(s.charAt(i));
        }
        System.out.println("reverse string is = "+rev);
    }
}
