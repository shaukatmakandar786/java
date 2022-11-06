public class SubString {
    public static void main(String[] args) {

        String str1 = "TPisTPareTPamTP", str2 = "TP";
        System.out.println("Count of occurrences of a substring recursively are: "+subString_rec(str1, str2));

    }

     static int subString_rec(String str1,String sub){

        if(str1.contains(sub)){

            String s = str1.replaceFirst(sub, "");
            return 1+subString_rec(s,sub);
        }
        return 0;
     }
}
