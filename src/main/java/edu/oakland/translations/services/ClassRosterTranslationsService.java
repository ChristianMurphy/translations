package edu.oakland.translations.services;

import org.springframework.stereotype.Component;
import org.springframework.cache.annotation.Cacheable;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.oakland.translations.models.Translations;
import edu.oakland.translations.models.ClassRosterTranslations;

@Component("class-roster")
public class ClassRosterTranslationsService implements ITranslationsService {
    private final Logger log = LoggerFactory.getLogger(getClass());
    /**
     * Internationalize each string.
     * @param languageCode the IETF language tag from the browser
     **/
    @Cacheable(value = "class-roster", key = "{ #root.methodName, #languageCode }")
    public Translations getTranslations(String languageCode) {
        ClassRosterTranslations lngStrs = new ClassRosterTranslations();

        // Set text translations
        switch (languageCode) {
            case "it": // Italian
                lngStrs.setTerms("Termini");
                lngStrs.setDownloadICal("Scarica iCal");
                lngStrs.setCourseInfo("Informazioni sul corso");
                lngStrs.setCredits("Crediti");
                lngStrs.setCrn("Crn");
                lngStrs.setLocationAndTime("Posizione e ora");
                lngStrs.setStudents("Studenti");
                lngStrs.setName("Nome");
                lngStrs.setRegistrationStatus("Stato di registrazione");
                lngStrs.setOk("Va bene");
                lngStrs.setCancel("Annulla");
                lngStrs.setFall("Autunno");
                lngStrs.setWinter("Inverno");
                lngStrs.setSpring("Primavera");
                lngStrs.setSummer("Estate");
                lngStrs.setTermMenu("Termini Menu");
                break;
            case "es": // Spanish 
                lngStrs.setTerms("Condiciones");
                lngStrs.setDownloadICal("Descargar iCal");
                lngStrs.setCourseInfo("Información del curso");
                lngStrs.setCredits("Créditos");
                lngStrs.setCrn("Crn");
                lngStrs.setLocationAndTime("Ubicación y Tiempo");
                lngStrs.setStudents("Estudiantes");
                lngStrs.setName("Nombre");
                lngStrs.setRegistrationStatus("Estado de registro");
                lngStrs.setOk("De acuerdo");
                lngStrs.setCancel("Cancelar");
                lngStrs.setFall("Otoño");
                lngStrs.setWinter("Invierno");
                lngStrs.setSpring("Primavera");
                lngStrs.setSummer("Verano");
                lngStrs.setTermMenu("Menú de términos");
                break;
            case "fr": // French
                lngStrs.setTerms("Termes");
                lngStrs.setDownloadICal("Télécharger iCal");
                lngStrs.setCourseInfo("Informations sur le cours");
                lngStrs.setCredits("Crédits");
                lngStrs.setCrn("Crn");
                lngStrs.setLocationAndTime("Lieu et heure");
                lngStrs.setStudents("Élèves");
                lngStrs.setName("Prénom");
                lngStrs.setRegistrationStatus("Statut d'inscription");
                lngStrs.setOk("D'accord");
                lngStrs.setCancel("Annuler");
                lngStrs.setFall("Tomber");
                lngStrs.setWinter("Hiver");
                lngStrs.setSpring("Printemps");
                lngStrs.setSummer("Été");
                lngStrs.setTermMenu("Menu Conditions");
                break;
            case "de": // German
                lngStrs.setTerms("Begriffe");
                lngStrs.setDownloadICal("Herunterladen iCal");
                lngStrs.setCourseInfo("Kursinfo");
                lngStrs.setCredits("Kredite");
                lngStrs.setCrn("Crn");
                lngStrs.setLocationAndTime("Lage und Zeit");
                lngStrs.setStudents("Studenten");
                lngStrs.setName("Name");
                lngStrs.setRegistrationStatus("Anmeldung");
                lngStrs.setOk("OK");
                lngStrs.setCancel("Stornieren");
                lngStrs.setFall("Fallen");
                lngStrs.setWinter("Winter");
                lngStrs.setSpring("Frühling");
                lngStrs.setSummer("Sommer");
                lngStrs.setTermMenu("Begriffe Menü");
                break;
            case "en":
            case "en-US":
            case "en-GB":
            default: // Defaults to English (United States)
                lngStrs.setTerms("Terms");
                lngStrs.setDownloadICal("Download iCal");
                lngStrs.setCourseInfo("Course Info");
                lngStrs.setCredits("Credits");
                lngStrs.setCrn("Crn");
                lngStrs.setLocationAndTime("Location and Time");
                lngStrs.setStudents("Students");
                lngStrs.setName("Name");
                lngStrs.setRegistrationStatus("Registration Status");
                lngStrs.setOk("OK");
                lngStrs.setCancel("Cancel");
                lngStrs.setFall("Fall");
                lngStrs.setWinter("Winter");
                lngStrs.setSpring("Spring");
                lngStrs.setSummer("Summer");
                lngStrs.setTermMenu("Term Menu");
                break;
        }
        return lngStrs;
    }
}
