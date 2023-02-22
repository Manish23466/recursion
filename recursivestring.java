import java.util.*;

public class recursivestring {

    static String reverses(String s,int index){
        if(index>=s.length()){
            return " ";
        }
        String smallstring=reverses(s, index+1);
        char newstr=s.charAt(index);
        if(newstr=='a'){
            return smallstring;
        }else{
            return newstr+smallstring; //this is only for removal of a
            //return smallstring+newstr  this is for reverse the string and removal of a
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(reverses(s, 0));

    }
}
