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
                lngStrs.setSection("Sezione");
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
                lngStrs.setError("Errore");
                lngStrs.setErrorMessage("Impossibile recuperare i tuoi dati in questo momento. Per favore riprova più tardi.");

                break;
            case "es": // Spanish 
                lngStrs.setTerms("Condiciones");
                lngStrs.setDownloadICal("Descargar iCal");
                lngStrs.setCourseInfo("Información del curso");
                lngStrs.setCredits("Créditos");
                lngStrs.setCrn("Crn");
                lngStrs.setSection("Sección");
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
                lngStrs.setError("Error");
                lngStrs.setErrorMessage("No hemos podido obtener sus datos en este momento. Por favor, inténtelo de nuevo más tarde.");
                break;
            case "fr": // French
                lngStrs.setTerms("Termes");
                lngStrs.setDownloadICal("Télécharger iCal");
                lngStrs.setCourseInfo("Informations sur le cours");
                lngStrs.setCredits("Crédits");
                lngStrs.setCrn("Crn");
                lngStrs.setSection("Quartier");
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
                lngStrs.setError("Erreur");
                lngStrs.setErrorMessage("Nous n'avons pas pu récupérer vos données en ce moment. Veuillez réessayer plus tard.");
                break;
            case "de": // German
                lngStrs.setTerms("Begriffe");
                lngStrs.setDownloadICal("Herunterladen iCal");
                lngStrs.setCourseInfo("Kursinfo");
                lngStrs.setCredits("Kredite");
                lngStrs.setCrn("Crn");
                lngStrs.setSection("Abschnitt");
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
                lngStrs.setError("Fehler");
                lngStrs.setErrorMessage("Wir konnten Ihre Daten zu diesem Zeitpunkt nicht abrufen. Bitte versuchen Sie es später noch einmal.");
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
                lngStrs.setSection("Section");
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
                lngStrs.setError("Error");
                lngStrs.setErrorMessage("We were unable to fetch your data at this time. Please Try again later.");
                break;
        }
        return lngStrs;
    }
}
