package edu.oakland.translations.services;

import org.springframework.stereotype.Component;
import org.springframework.cache.annotation.Cacheable;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Arrays;

import edu.oakland.translations.models.Translations;
import edu.oakland.translations.models.MyDetailsTranslations;

@Component("mydetails")
public class MyDetailsTranslationsService implements ITranslationsService {
    /**
     * Internationalize each string.
     * @param languageCode the IETF language tag from the browser
     **/
    @Cacheable(value = "mydetails", key = "{ #root.methodName, #languageCode }")
    public Translations getTranslations(String languageCode) {
        MyDetailsTranslations lngStrs = new MyDetailsTranslations();

        // Set text translations
        switch (languageCode) {
            case "en-GB": // English (Great Britain)
            case "en-US": // English (United States)
            default: // Defaults to English (United States)
                lngStrs.setMajor("Major");
                lngStrs.setMinor("Minor");
                lngStrs.setConcentration("Concentration");
                lngStrs.setAddress("Address");
                lngStrs.setPhoneNumber("Phone Number");
                lngStrs.setEmail("Email");
                lngStrs.setLegalName("Legal Name");
                lngStrs.setPrefFirstName("Preferred First Name");
                lngStrs.setApply("Apply");
                lngStrs.setClose("Close");
                lngStrs.setApplyToGradHeader("Apply to graduate?");
                lngStrs.setApplyToGradBody(
                    "Our records indicate that you are a Senior and have not applied to graduate yet. If you are ready to do so please select apply.");
                break;
        }
        return lngStrs;
    }
}
