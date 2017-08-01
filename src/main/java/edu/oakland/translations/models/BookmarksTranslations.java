package edu.oakland.translations.models;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Arrays;

import lombok.Data;

@Data
public class BookmarksTranslations extends Translations {
  private String search;
  private String edit;
  private String newBookmark;
  private String newFolder;
  private String title;
  private String url;
  private String note;
  private String save;
  private String cancel;
  private String preferences;
  private String bookmarkPref;
  private String expand;
  private String collapse;
}
