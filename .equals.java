
public class stringequals {

    public static void main(String[] args) {
        
    
    String str1=new String("hello");
    String str2=new String("hello");

    if(str1==str2){
        System.out.println("strings are same");
    }
    else{
        System.out.println("strings are different");
    }

    if(str1.equals(str2)){
        System.out.println("strings are same");
    }
    else{
        System.out.println("strings are different");
    }
}
}
