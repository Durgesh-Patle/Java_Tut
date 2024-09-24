// import java.util.regex.Matcher;
import java.util.regex.*;

public class RegEx {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("Dur");  //Pattern 
        Matcher m=p.matcher("Durgesh");    // matcher

        boolean found =m.find();

        if(found==true){
            System.out.println("Pattern Find");
        }
        else{
            System.out.println("Pattern Not Find");
        }
    }
}
