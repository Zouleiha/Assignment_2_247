package Beans;
import java.io.Serializable;

public class GreeterBean implements Serializable {

    public GreeterBean(){

    }
    public String greetMeInReverse (String s)
    {
        char ch[]=s.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        return rev;

    }

}

