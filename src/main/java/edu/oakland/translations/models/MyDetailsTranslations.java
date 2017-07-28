package edu.oakland.translations.models;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Arrays;

import lombok.Data;

@Data
public class MyDetailsTranslations extends Translations {
    private String gid;
    private String major;
    private String minor;
    private String concentration;
    private String address;
    private String phoneNumber;
    private String email;
    private String legalName;
    private String prefFirstName;
    private String prefFNameHeader;
    private String apply;
    private String close;
    private String applyToGradHeader;
    private String applyToGradBody;
    private String appliedToGradHeader;
    private String appliedToGradBody;
    private String display;
    private String somethingWrong;
    private String changeInfo;
    private String classStanding;
}
