package edu.oakland.translations.models;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Arrays;

import lombok.Data;

@Data
public class CoursesTranslations extends Translations {
  private String section;
  private String crn;
  private String credits;
  private String courseDetails;
  private String courseTitle;
  private String department;
  private String grade;
  private String description;
  private String close;
  private String courses;
  private String calendar;
  private String grades;
  private String course;
  private String level;
  private String gac;
  private String waitlist;
}
