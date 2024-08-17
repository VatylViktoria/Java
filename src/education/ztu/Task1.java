package education.ztu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void doTask(){
        String text =
                "Чонгук Альбертович, 26 років, 06.06.1998, викладач, 3 роки досвіду, вул. Колотушкіна 34, istorik100@gmail.com, 0681234567. " +
                "Чімін Васильович, 30 років, 07.07.1994, директор, 6 років досвіду, вул. Шевченка 19, krasav4ick2004@gmail.com, 0971234567. " +
                "Хосок Дмитрович, 19 років, 08.08.2005, прибиральник, 1 рік досвіду, вул. Безхатька 10, dvornik00gmail.com, 0631234567.";
        Matcher matcher = Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+").matcher(text);
        print(matcher);
        matcher = Pattern.compile("[+]?[(]?[0-9]{3}[)]?[-\\s.]?[0-9]{3}[-\\s.]?[0-9]{4,6}").matcher(text);
        print(matcher);
        matcher = Pattern.compile("\\d{2}\\.\\d{2}\\.\\d{4}").matcher(text);
        print(matcher);
        text = text.replaceAll("(\\d{2})\\.(\\d{2})\\.(\\d{4})", "$3-$2-$1");
        System.out.println(text);
        text = text.replaceAll("прибиральник", "замісник директора");
        System.out.println(text);
    }

    private static void print(Matcher matcher){
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
