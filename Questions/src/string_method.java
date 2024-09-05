public class string_method {
    public static void main(String[]args)
    {
        String name = "Deepika";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name.substring(3));
        System.out.println(name.substring(1,7));
        System.out.println(name.replace('e','i'));
        System.out.println(name.replace("ika","ansh"));
        System.out.println(name.startsWith("D"));
        System.out.println(name.endsWith("i"));
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf("i"));
        System.out.println(name.indexOf("e",1));
        System.out.println(name.equals("deepika"));
        System.out.println(name.equalsIgnoreCase("deepika"));
        System.out.println("bass kar bhai \n nhi ho rha ab");
    }

}
