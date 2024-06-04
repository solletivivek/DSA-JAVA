import java.util.Scanner;

/**
 * PalindromeRec
 */
public class PalindromeRec {

    public static boolean fun(String str,int l){
        if(l >str.length()/2) return true;
        if(str.charAt(l)!=str.charAt(str.length()-l-1)) return false;
        return fun(str, l+1);
    }

    public static String reveStr(String str){
        if (str.isEmpty()) {
            return str;
        }
        return reveStr(str.substring(1))+str.charAt(0);
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       System.out.println(reveStr(str));
       boolean isNew = fun(str, 0);
       if (isNew){
        System.out.println("yes");
       }else{
        System.out.println("no");
       }
    }
}

// // Full Trace Summary:

// // reverseString("madam") -> reverseString("adam") + 'm'
// // reverseString("adam") -> reverseString("dam") + 'a'
// // reverseString("dam") -> reverseString("am") + 'd'
// // reverseString("am") -> reverseString("m") + 'a'
// // reverseString("m") -> reverseString("") + 'm'
// // reverseString("") -> "" (base case)
// // Unwind: "" + 'm' -> "m"
// // Unwind: "m" + 'a' -> "ma"
// // Unwind: "ma" + 'd' -> "mad"
// // Unwind: "mad" + 'a' -> "mada"
// // Unwind: "mada" + 'm' -> "madam"