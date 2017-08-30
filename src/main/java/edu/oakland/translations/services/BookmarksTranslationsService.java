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
import edu.oakland.translations.models.BookmarksTranslations;

@Component("bookmarks")
public class BookmarksTranslationsService implements ITranslationsService {
    private final Logger log = LoggerFactory.getLogger(getClass());
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
                lngStrs.setDelete("Elimina");
                lngStrs.setAddToFolder("Aggiungi alla cartella");
                lngStrs.setRemoveFromFolder("Rimuovi dalla cartella");
                lngStrs.setNewBookmark("Nuovo segnalibro");
                lngStrs.setNewFolder("Nuova cartella");
                lngStrs.setFolder("cartella");
                lngStrs.setTitle("Titolo");
                lngStrs.setUrl("Url");
                lngStrs.setNote("Nota");
                lngStrs.setSave("Salvare");
                lngStrs.setCancel("Annulla");
                lngStrs.setPreferences("Preferenze");
                lngStrs.setBookmarkPref("Oggetti per pagina"); // should be double checked
                lngStrs.setExpand("Espandere");
                lngStrs.setCollapse("Crollo");
                lngStrs.setPage("Pagina");
                lngStrs.setPreferenceError("Impossibile salvare le preferenz");
                lngStrs.setUnavailable("I tuoi segnalibri non sono attualmente disponibili");
                lngStrs.setDeleteBookmarkConfirm("Sei sicuro di voler eliminare questo segnalibro?");
                lngStrs.setDeleteFolderConfirm("Sei sicuro di voler eliminare questa cartella?");

                lngStrs.setBookmarkMenu("Menu Segnalibri");
                lngStrs.setFolderMenu("Menu di cartella");
                lngStrs.setPreviousPage("Pagina precedente");
                lngStrs.setNextPage("Pagina successiva");
                lngStrs.setCollapseFolder("Chiudi cartella");
                lngStrs.setExpandFolder("Espandi cartella");
                lngStrs.setSearchBookmarks("Cerca segnalibri");
                lngStrs.setSettings("Impostazioni");
                break;
            case "es": // Spanish 
                lngStrs.setSearch("Buscar");
                lngStrs.setEdit("Editar");
                lngStrs.setDelete("Borrar");
                lngStrs.setAddToFolder("Agregar a la carpeta");
                lngStrs.setRemoveFromFolder("Eliminar de la carpeta");
                lngStrs.setNewBookmark("Nuevo marcador");
                lngStrs.setNewFolder("Nueva carpeta");
                lngStrs.setTitle("Título");
                lngStrs.setFolder("carpeta");
                lngStrs.setUrl("Url");
                lngStrs.setNote("Nota");
                lngStrs.setSave("Salvar");
                lngStrs.setCancel("Cancelar");
                lngStrs.setPreferences("Preferencias");
                lngStrs.setBookmarkPref("Artículos por página");
                lngStrs.setExpand("Expandir");
                lngStrs.setCollapse("Colapso");
                lngStrs.setPage("Página");
                lngStrs.setPreferenceError("No se puede guardar la preferencia");
                lngStrs.setUnavailable("Tus marcadores ya no están disponibles");
                lngStrs.setDeleteBookmarkConfirm("¿Estás seguro de que quieres eliminar este marcador?");
                lngStrs.setDeleteFolderConfirm("¿Está seguro de que desea eliminar esta carpeta?");

                lngStrs.setBookmarkMenu("Menú de marcadores");
                lngStrs.setFolderMenu("Menú de carpetas");
                lngStrs.setPreviousPage("Pagina anterior");
                lngStrs.setNextPage("Siguiente página");
                lngStrs.setCollapseFolder("Contraer carpeta");
                lngStrs.setExpandFolder("Expanda la carpeta");
                lngStrs.setSearchBookmarks("Buscar Marcadores");
                lngStrs.setSettings("Configuración");
                break;
            case "fr": // French
                lngStrs.setSearch("Chercher");
                lngStrs.setEdit("Modifier");
                lngStrs.setDelete("Effacer");
                lngStrs.setAddToFolder("Ajouter au dossier");
                lngStrs.setRemoveFromFolder("Supprimer du dossier");
                lngStrs.setNewBookmark("Nouveau signet");
                lngStrs.setNewFolder("Nouveau dossier");
                lngStrs.setFolder("dossier");
                lngStrs.setTitle("Titre");
                lngStrs.setUrl("Url");
                lngStrs.setNote("Remarque");
                lngStrs.setSave("Sauvegarder");
                lngStrs.setCancel("Annuler");
                lngStrs.setPreferences("Préférences");
                lngStrs.setBookmarkPref("Objets par page");
                lngStrs.setExpand("Développer");
                lngStrs.setCollapse("Effondrer");
                lngStrs.setPage("Page");
                lngStrs.setPreferenceError("Impossible d'enregistrer les préférences");
                lngStrs.setUnavailable("Vos favoris ne sont actuellement pas disponibles");
                lngStrs.setDeleteBookmarkConfirm("Êtes vous sûr de vouloir supprimer ce marque-page?");
                lngStrs.setDeleteFolderConfirm("Êtes-vous sûr de vouloir supprimer ce dossier?");

                lngStrs.setBookmarkMenu("Menu Signet");
                lngStrs.setFolderMenu("Menu du dossier");
                lngStrs.setPreviousPage("Page précédente");
                lngStrs.setNextPage("Page suivante");
                lngStrs.setCollapseFolder("Fermer le dossier");
                lngStrs.setExpandFolder("Dossier ouvert");
                lngStrs.setSearchBookmarks("Rechercher des signets");
                lngStrs.setSettings("Paramètres");
                break;
            case "de": // German
                lngStrs.setSearch("Suche");
                lngStrs.setEdit("Bearbeiten");
                lngStrs.setDelete("Löschen");
                lngStrs.setAddToFolder("Zum Ordner hinzufügen");
                lngStrs.setRemoveFromFolder("Aus dem Ordner entfernen");
                lngStrs.setNewBookmark("Neues Lesezeichen");
                lngStrs.setNewFolder("Neuer Ordner");
                lngStrs.setFolder("mappe");
                lngStrs.setTitle("Titel");
                lngStrs.setUrl("Url");
                lngStrs.setNote("Hinweis");
                lngStrs.setSave("sparen");
                lngStrs.setCancel("Stornieren");
                lngStrs.setPreferences("Präferenzen");
                lngStrs.setBookmarkPref("Objekte pro Seite");
                lngStrs.setExpand("Erweitern");
                lngStrs.setCollapse("Zusammenbruch");
                lngStrs.setPage("Seite");
                lngStrs.setPreferenceError("Die Voreinstellung kann nicht gespeichert werden");
                lngStrs.setUnavailable("Ihre Lesezeichen sind derzeit nicht verfügbar");
                lngStrs.setDeleteBookmarkConfirm("Sind Sie sicher, dass Sie dieses Lesezeichen löschen möchten?");
                lngStrs.setDeleteFolderConfirm("Sind Sie sicher, dass Sie diesen Ordner löschen möchten?");

                lngStrs.setBookmarkMenu("Lesezeichen-Menü");
                lngStrs.setFolderMenu("Ordnermenü");
                lngStrs.setPreviousPage("Vorherige Seite");
                lngStrs.setNextPage("Folgeseite");
                lngStrs.setCollapseFolder("Ordner schließen");
                lngStrs.setExpandFolder("Ordner erweitern");
                lngStrs.setSearchBookmarks("Lesezeichen suchen");
                lngStrs.setSettings("Einstellungen");
                break;
            case "en":
            case "en-US":
            case "en-GB":
            default: // Defaults to English (United States)
                lngStrs.setSearch("Search");
                lngStrs.setEdit("Edit");
                lngStrs.setDelete("Delete");
                lngStrs.setAddToFolder("Add to folder");
                lngStrs.setRemoveFromFolder("Remove from folder");
                lngStrs.setNewBookmark("New Bookmark");
                lngStrs.setNewFolder("New Folder");
                lngStrs.setFolder("folder");
                lngStrs.setTitle("Title");
                lngStrs.setUrl("Url");
                lngStrs.setNote("Note");
                lngStrs.setSave("Save");
                lngStrs.setCancel("Cancel");
                lngStrs.setPreferences("Preferences");
                lngStrs.setBookmarkPref("Items per page");
                lngStrs.setExpand("Expand");
                lngStrs.setCollapse("Collapse");
                lngStrs.setPage("Page");
                lngStrs.setPreferenceError("Unable to save Preference");
                lngStrs.setUnavailable("Your bookmarks are currently unavailable");
                lngStrs.setDeleteBookmarkConfirm("Are you sure you want to delete this bookmark?");
                lngStrs.setDeleteFolderConfirm("Are you sure you want to delete this folder?");

                lngStrs.setBookmarkMenu("Bookmark Menu");
                lngStrs.setFolderMenu("Folder Menu");
                lngStrs.setPreviousPage("Previous Page");
                lngStrs.setNextPage("Next Page");
                lngStrs.setCollapseFolder("Collapse Folder");
                lngStrs.setExpandFolder("Expand Folder");
                lngStrs.setSearchBookmarks("Search Bookmarks");
                lngStrs.setSettings("Settings");
                break;
        }
        return lngStrs;
    }
}
