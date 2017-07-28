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
                case "it": // Italian
                lngStrs.setMajor("Magiore"); //Should double check the following 3
                lngStrs.setMinor("Minore");
                lngStrs.setConcentration("Concentrazione");
                lngStrs.setAddress("Indirizzo");
                lngStrs.setPhoneNumber("Numero di telefono");
                lngStrs.setEmail("Indirizzo electronico");
                lngStrs.setLegalName("Nome legale");
                lngStrs.setPrefFirstName("Nome preferito");
                lngStrs.setApply("Applicare");
                lngStrs.setClose("Chiudere");
                lngStrs.setApplyToGradHeader("Dommanda di laurea");//should double check the following 2
                lngStrs.setApplyToGradBody(
                    "I nostri recordi indicano che voi siete al'ultimo anno e non avete applicato di laurearvi. Se siete pronti, vi suggestiamo di applicare.");
                break;
        }
        return lngStrs;
    }
}
