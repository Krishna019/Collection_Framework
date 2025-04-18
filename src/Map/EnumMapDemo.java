package Map;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {
        //array of size same as enum
        //no hashing
        //ordinal/index is used
        //faster than hashmap
        Map<Day,String> map = new EnumMap<>(Day.class);
        map.put(Day.TUESDAY,"GYM");
        System.out.println(Day.TUESDAY.ordinal());
        map.put(Day.MONDAY, "CRICKET");
        System.out.println(map);
    }
}
enum Day{
    MONDAY,TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY,SATURDAY,SUNDAY
}
