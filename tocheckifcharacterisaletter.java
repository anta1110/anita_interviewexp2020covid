public class HelloWorld{
    
    public static boolean checkifLEtter(String s)
    {
        if(!s.equals(null) && (s!="") && s.chars().allMatch(Character::isLetter))
        return true;
        
        else
        return false;
    }

     public static void main(String []args){
         String s = "!@#";
         
        System.out.println(checkifLEtter(s));
     }
}
