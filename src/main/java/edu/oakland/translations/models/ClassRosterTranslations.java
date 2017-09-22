package edu.oakland.translations.models;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Arrays;

import lombok.Data;

@Data
public class ClassRosterTranslations extends Translations {
  // static text translations
  private String terms;
  private String downloadICal;
  private String courseInfo;
  private String credits;
  private String crn;
  private String section;
  private String locationAndTime;
  private String students;
  private String name;
  private String registrationStatus;
  private String ok;
  private String cancel;
  private String fall;
  private String winter;
  private String spring;
  private String summer;
  private String error;
  private String errorMessage;

  // aria-label translations
  private String termMenu;
}
