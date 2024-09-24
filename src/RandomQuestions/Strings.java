package RandomQuestions;
public class Strings
{
    static void greeting(String naam){
        System.out.println("naam:"+naam.hashCode());
        System.out.println("Hola "+naam
        );
        naam+="Khan";
    }
    public static void main(String[] args) {
        String name ="MHK";
        String name2="MHK";
        System.out.println("name:"+name.hashCode());
        System.out.println("name2:"+name2.hashCode());
//        System.out.println("name:"+name.hashCode());
//        greeting(name);
//        System.out.println(name);
    }


}
