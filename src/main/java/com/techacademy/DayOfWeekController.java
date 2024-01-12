package com.techacademy;

//DayOfWeekController.java
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@RestController
public class DayOfWeekController {

 @GetMapping("/dayofweek/{date}")
 public String dispDayOfWeek(@PathVariable String date) {
     // 日付文字列から年、月、日を抽出
     int year = Integer.parseInt(date.substring(0, 4));
     int month = Integer.parseInt(date.substring(4, 6));
     int day = Integer.parseInt(date.substring(6, 8));

     // 曜日を求める
     String dayOfWeek = getDayOfWeek(year, month, day);

     return dayOfWeek;
 }

 private String getDayOfWeek(int year, int month, int day) {
     // Calendarクラスを利用して曜日を求める
     Calendar calendar = Calendar.getInstance();
     calendar.set(year, month - 1, day); // 月は1を引く
     int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

     // 曜日を文字列に変換して返す
     switch (dayOfWeek) {
         case Calendar.SUNDAY:
             return "Sunday";
         case Calendar.MONDAY:
             return "Monday";
         case Calendar.TUESDAY:
             return "Tuesday";
         case Calendar.WEDNESDAY:
             return "Wednesday";
         case Calendar.THURSDAY:
             return "Thursday";
         case Calendar.FRIDAY:
             return "Friday";
         case Calendar.SATURDAY:
             return "Saturday";
         default:
             return "Unknown";
     }
 }
}
