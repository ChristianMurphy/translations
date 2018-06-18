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
    case "it": // Italian
      lngStrs.setGid("GID");
      lngStrs.setMajor("Magiore"); // Should double check the following 3
      lngStrs.setMinor("Minore");
      lngStrs.setConcentration("Concentrazione");
      lngStrs.setAddress("Indirizzo");
      lngStrs.setPhoneNumber("Numero di telefono");
      lngStrs.setEmail("Indirizzo electronico");
      lngStrs.setLegalName("Nome legale");
      lngStrs.setPrefFirstName("Nome preferito");
      lngStrs.setPrefFNameHeader(
          "Cambiare nome preferito?"); // Doris should review this
      lngStrs.setApply("Applicare");
      lngStrs.setClose("Chiudere");
      lngStrs.setApplyToGradHeader(
          "Dommanda di laurea"); // should double check the following 2
      lngStrs.setApplyToGradBody(
          "I nostri recordi indicano che voi siete al'ultimo anno e non avete applicato di laurearvi. Se siete pronti, vi suggestiamo di applicare.");
      lngStrs.setAppliedToGradHeader(
          "Hai fatto domanda per laurearsi"); // Doris, should review this
      lngStrs.setAppliedToGradBody(
          "I nostri record mostrano che hai fatto domanda per laurearsi! Ricorda di controllare periodicamente la tua email per ulteriori informazioni."); // Doris, should review this
      lngStrs.setDisplay("Visualizzare le informazioni personali"); // Doris,
                                                                    // should
                                                                    // review
                                                                    // this
      lngStrs.setSomethingWrong(
          "Vedere qualcosa di sbagliato?"); // Doris, should review this
      lngStrs.setChangeInfo(
          "Fai clic qui per aggiornare le tue informazioni"); // Doris, should
                                                              // review this
      lngStrs.setClassStanding("Classe in piedi"); // Doris, should review this
      break;
    case "fr": // French 
      lngStrs.setGid("Grizzly ID");
      lngStrs.setMajor("Majeur");
      lngStrs.setMinor("Mineur");
      lngStrs.setConcentration("Concentration");
      lngStrs.setAddress("Addresse");
      lngStrs.setPhoneNumber("Numéro de Téléphone");
      lngStrs.setEmail("Email");
      lngStrs.setLegalName("Nom Légal");
      lngStrs.setPrefFirstName("Prénom Préféré");
      lngStrs.setPrefFNameHeader("Changez votre prénom préféré");
      lngStrs.setApply("Postuler");
      lngStrs.setClose("Fermer");
      lngStrs.setApplyToGradHeader("Postuler pour obtenir son diplôme ?");
      lngStrs.setApplyToGradBody(
          "Nos archives indiquent que vous êtes en dernière année d'études de premier cycle et vous n'avez pas encore postulé pour obtenir son diplôme. Si vous êtes prêt à le faire, sélectionnez \"Appliquez\".");
      lngStrs.setAdvisingApplyToGradBody(
          "Nos archives indiquent que cet etudiant est en dernière année d'étude de premier cycle et qu’il n’a pas encore postulé pour obtenir son diplôme.");
      lngStrs.setAppliedToGradHeader("Vous avez postulé pour obtenir son diplôme.");
      lngStrs.setAppliedToGradBody(
          "Nos archives indiquent que vous avez postulé pour obtenir son diplôme. Vérifiez votre messagerie pour plus d'informations.");
      lngStrs.setAdvisingAppliedToGradBody(
          "Nos archives indiquent que ce etudiante a postulé pour obtenir son diplôme.");
      lngStrs.setDisplay("Consulter vos informations personnelles.");
      lngStrs.setSomethingWrong("Voyez-vous quelque chose d'incorrect ?");
      lngStrs.setChangeInfo("Cliquez ici pour mettre à jour vos informations");
      lngStrs.setClassStanding("Status du cours");
      break;
    case "en-GB": // English (Great Britain)
    case "en-US": // English (United States)
    default:      // Defaults to English (United States)
      lngStrs.setGid("Grizzly ID");
      lngStrs.setMajor("Major");
      lngStrs.setMinor("Minor");
      lngStrs.setConcentration("Concentration");
      lngStrs.setAddress("Address");
      lngStrs.setPhoneNumber("Phone Number");
      lngStrs.setEmail("Email");
      lngStrs.setLegalName("Legal Name");
      lngStrs.setPrefFirstName("Preferred First Name");
      lngStrs.setPrefFNameHeader("Change Preferred First Name?");
      lngStrs.setApply("Apply");
      lngStrs.setClose("Close");
      lngStrs.setApplyToGradHeader("Apply to graduate?");
      lngStrs.setApplyToGradBody(
          "Our records indicate that you are a Senior and have not applied to graduate yet. If you are ready to do so please select apply.");
      lngStrs.setAdvisingApplyToGradBody(
          "Our records indicate that this student is a Senior and has not applied to graduate yet.");
      lngStrs.setAppliedToGradHeader("You have applied to graduate");
      lngStrs.setAppliedToGradBody(
          "Our records show you have applied to graduate! Remember to periodically check your email for more information.");
      lngStrs.setAdvisingAppliedToGradBody(
          "Our records indicate that this student has applied to graduate.");
      lngStrs.setDisplay("Display your personal information");
      lngStrs.setSomethingWrong("See something wrong?");
      lngStrs.setChangeInfo("Click here to update your information");
      lngStrs.setClassStanding("Class Standing");
      break;
    }
    return lngStrs;
  }
}
