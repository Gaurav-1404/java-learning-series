public class C1_StringMethodsDemo {

    public static void main(String[] args) {

        String A = "Hello ";
        String name = new String ("Alex");
        System.out.println(name );
        System.out.print(A);
        System.out.printf("My name is: %s",name);
        // String methods 
        //Length 
        int value = name.length();
        System.out.println("\nthe length of string is: "+ value);

        //Lower case
        String lowerCaseName = name.toLowerCase();
        System.out.println(lowerCaseName);
        
        //upper case
        String upperCaseName = name.toUpperCase();
        System.out.println(upperCaseName);

        //trim string -->remove extra space
        String nonTrimmedString = "    Engineering   ";
        System.out.println(nonTrimmedString);
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        //substring 
        String substring;
        substring = trimmedString.substring(2, 9);
        System.out.println(substring);

        //replace 
        String replaceString = new String();
        replaceString = trimmedString.replace("e", "a");
        System.out.println(replaceString);

        String ext = "Education teacher";
        //startWith 
        boolean startWith = ext.startsWith("du");
        System.out.println(startWith);

        //endsWith
        boolean endWithWith = ext.endsWith("ion");
        System.out.println(endWithWith);

        //CharAT;
        System.out.println(ext.charAt(2));
     
        //indexOf
        System.out.println(ext.indexOf("cat"));

        //lastIndexOf
        System.out.println(ext.lastIndexOf("t"));
        System.out.println(ext.lastIndexOf('a', 5));

        //equals
        System.out.println(ext.equals("Education teacher"));

        //equalsIgnoreCase
        System.out.println(ext.equalsIgnoreCase("Education Teacher"));

        //contains
        System.out.println(ext.contains("uca"));


    }
}