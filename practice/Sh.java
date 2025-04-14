// String Hndling
public class Sh {
    public static void main(String[] args) {
        String nm="Chaitanya";
        String nm2="Nachiket";

        System.out.println(nm.toUpperCase());
        System.out.println(nm2.toLowerCase());

        System.out.println(nm.length());

        System.out.println(nm+" Patil");
        System.out.println(nm.concat(nm2)); // will join without any space
        System.out.println(nm.equals(nm2)); 
        System.out.println(nm.compareTo(nm2));// will give integer output, if true 0 if false then it will print a random number.

        String a=nm;
        System.out.println(nm);
        System.out.println(a);

        String word="Microsoft Word";
        System.out.println(word.startsWith("m"));
        System.out.println(word.endsWith("d"));
        System.out.println(word.substring(3, 5));
        System.out.println(word.indexOf("o"));
        System.out.println(word.lastIndexOf("o"));
        System.out.println(word.charAt(4));

        String data= "bellbellbell";
        System.out.println(data.replace('b', 'w'));
        String str="    Welcome     ";
        System.out.println(str.trim());

        char ch[]={'s','n','e','h','a'};
        String obj= new String(ch);
        System.out.println(obj);

        String name= "Chaitanya";
        char chr[]=name.toCharArray();

        for(int i=0; i<name.length();i++)
        {
            System.out.print(chr[i]+"\t");
        }
    }
}
