package edu.oakland.translations.services;

import org.springframework.stereotype.Component;
import org.springframework.cache.annotation.Cacheable;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Arrays;

import edu.oakland.translations.models.Translations;
import edu.oakland.translations.models.BookmarksTranslations;

@Component("bookmarks")
public class BookmarksTranslationsService implements ITranslationsService {
    /**
     * Internationalize each string.
     * @param languageCode the IETF language tag from the browser
     **/
    @Cacheable(value = "bookmarks", key = "{ #root.methodName, #languageCode }")
    public Translations getTranslations(String languageCode) {
        BookmarksTranslations lngStrs = new BookmarksTranslations();

        // Set text translations
        switch (languageCode) {
            case "it": // Italian
                lngStrs.setSearch("Ricerca");
                lngStrs.setEdit("Modifica");
                lngStrs.setNewBookmark("Nuovo segnalibro");
                lngStrs.setNewFolder("Nuova cartella");
                lngStrs.setTitle("Titolo");
                lngStrs.setUrl("Url");
                lngStrs.setNote("Nota");
                lngStrs.setSave("Salvare");
                lngStrs.setCancel("Annulla");
                lngStrs.setPreferences("Preferenze");
                lngStrs.setBookmarkPref("Oggetti per pagina"); // should be double checked
                lngStrs.setExpand("Espandere");
                lngStrs.setCollapse("Crollo");
                break;
            case "es": // Spanish 
                lngStrs.setSearch("Buscar");
                lngStrs.setEdit("Editar");
                lngStrs.setNewBookmark("Nuevo marcador");
                lngStrs.setNewFolder("Nueva carpeta");
                lngStrs.setTitle("Título");
                lngStrs.setUrl("Url");
                lngStrs.setNote("Nota");
                lngStrs.setSave("Salvar");
                lngStrs.setCancel("Cancelar");
                lngStrs.setPreferences("Preferencias");
                lngStrs.setBookmarkPref("Artículos por página");
                lngStrs.setExpand("Expandir");
                lngStrs.setCollapse("Colapso");
                break;
            case "fr": // French
                lngStrs.setSearch("Chercher");
                lngStrs.setEdit("Modifier");
                lngStrs.setNewBookmark("Nouveau signet");
                lngStrs.setNewFolder("Nouveau dossier");
                lngStrs.setTitle("Titre");
                lngStrs.setUrl("Url");
                lngStrs.setNote("Remarque");
                lngStrs.setSave("Sauvegarder");
                lngStrs.setCancel("Annuler");
                lngStrs.setPreferences("Préférences");
                lngStrs.setBookmarkPref("Objets par page");
                lngStrs.setExpand("Développer");
                lngStrs.setCollapse("Effondrer");
                break;
            case "de": // German
                lngStrs.setSearch("Suche");
                lngStrs.setEdit("Bearbeiten");
                lngStrs.setNewBookmark("Neues Lesezeichen");
                lngStrs.setNewFolder("Neuer Ordner");
                lngStrs.setTitle("Titel");
                lngStrs.setUrl("Url");
                lngStrs.setNote("Hinweis");
                lngStrs.setSave("sparen");
                lngStrs.setCancel("Stornieren");
                lngStrs.setPreferences("Präferenzen");
                lngStrs.setBookmarkPref("Objekte pro Seite");
                lngStrs.setExpand("Erweitern");
                lngStrs.setCollapse("Zusammenbruch");
                break;
            case "en-GB": // English (Great Britain)
            case "en-US": // English (United States)
            default: // Defaults to English (United States)
                lngStrs.setSearch("Search");
                lngStrs.setEdit("Edit");
                lngStrs.setNewBookmark("New Bookmark");
                lngStrs.setNewFolder("New Folder");
                lngStrs.setTitle("Title");
                lngStrs.setUrl("Url");
                lngStrs.setNote("Note");
                lngStrs.setSave("Save");
                lngStrs.setCancel("Cancel");
                lngStrs.setPreferences("Preferences");
                lngStrs.setBookmarkPref("Items per page");
                lngStrs.setExpand("Expand");
                lngStrs.setCollapse("Collapse");
                break;
        }
        return lngStrs;
    }
}
