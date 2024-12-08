import java.util.HashMap;
import java.util.Scanner;

public class Stobogramatic_Number {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String Num=sc.nextLine();
        if(Strobo(Num)){
            System.out.println("It is a Strobogrmmatic Number");
        }else {
            System.out.println("It is not a Strobogrammatic Number");
        }
    }
    static boolean Strobo(String Num){
        HashMap<Character,Character> Dict=new HashMap<>();
        Dict.put('0','0');
        Dict.put('1','1');
        Dict.put('8','8');
        Dict.put('6','9');
        Dict.put('9','6');
        String New="";
        for(int i=0;i<Num.length();i++){
            if(!Dict.containsKey(Num.charAt(i))){
                return false;
            }
            else{
                New=Dict.get(Num.charAt(i))+New;
            }
        }
//        System.out.println(New+" "+Num);
        if(!Num.equals(New)){
            return false;
        }
        return true;
    };
}
