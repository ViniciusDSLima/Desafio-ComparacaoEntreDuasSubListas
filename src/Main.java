import java.util.Scanner;

public class Main {
    public static String FindIntersection(String[] strArr) {
        String[] arr1 = strArr[0].split(", ");
        String[] arr2 = strArr[1].split(", ");

        StringBuilder result = new StringBuilder();
        boolean isFirst = true;

        for(String num1 : arr1){
            for(String num2 : arr2){
                if(num1.equals(num2)){
                    if(!isFirst){
                        result.append(", ");
                    }
                    result.append(num1);
                    isFirst = false;
                }
            }
        }

        if (result.length() == 0){
            return "false";
        }
        else {
            return result.toString();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(FindIntersection((s.nextLine()));
        s.close();

    }

}