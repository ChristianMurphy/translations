package edu.oakland.translations.models;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Arrays;

import lombok.Data;

@Data
public class CalendarTranslations extends Translations {
  private String Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

  private String shortMonday, shortTuesday, shortWednesday, shortThursday,
      shortFriday, shortSaturday, shortSunday;

  private String January, February, March, April, May, June, July, August,
      September, October, November, December;

  private String shortJanuary, shortFebruary, shortMarch, shortApril, shortMay,
      shortJune, shortJuly, shortAugust, shortSeptember, shortOctober,
      shortNovember, shortDecember;

  private String Week;
  private String Schedule;
  private String Month;

  private String hour7, hour8, hour9, hour10, hour11, hour12, hour13, hour14,
      hour15, hour16, hour17, hour18, hour19, hour20, hour21, hour22, hour23;
}
