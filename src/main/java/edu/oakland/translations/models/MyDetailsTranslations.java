package edu.oakland.translations.models;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Arrays;

import lombok.Data;

@Data
public class MyDetailsTranslations extends Translations {
    private String major;
    private String minor;
    private String concentration;
    private String address;
    private String phoneNumber;
    private String email;
    private String legalName;
    private String prefFirstName;
    private String apply;
    private String close;
    private String applyToGradHeader;
    private String applyToGradBody;
}
