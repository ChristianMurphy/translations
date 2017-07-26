package edu.oakland.translations.services;

import org.springframework.stereotype.Component;
import org.springframework.cache.annotation.Cacheable;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Arrays;

import edu.oakland.translations.models.Translations;
import edu.oakland.translations.models.CoursesTranslations;

@Component("courses")
public class CoursesTranslationsService implements ITranslationsService {
  /**
   * Internationalize each string.
   * @param languageCode the IETF language tag from the browser
   **/
  @Cacheable(value = "courses", key = "{ #root.methodName, #languageCode }")
  public Translations getTranslations(String languageCode) {
    CoursesTranslations lngStrs = new CoursesTranslations();

    // Set text translations
    switch (languageCode) {
    case "de": // German
      lngStrs.setSection("Bereich");
      lngStrs.setCrn("CRN");
      lngStrs.setCredits("Punkte");
      lngStrs.setCourseDetails("Kursdetails");
      lngStrs.setCourseTitle("Kursname");
      lngStrs.setDepartment("Fachbereich");
      lngStrs.setGrade("Note");
      lngStrs.setDescription("Beshreibung");
      lngStrs.setClose("Schließen");
      lngStrs.setCourses("Kurse");
      lngStrs.setCalendar("Kalender");
      lngStrs.setGrades("Noten");
      lngStrs.setCourse("Kurs");
      lngStrs.setLevel("Bildungsebene");
      lngStrs.setGac("Noten und Punkte");

      break;
    case "en-GB": // English (Great Britain)
      lngStrs.setSection("Section");
      lngStrs.setCrn("CRN");
      lngStrs.setCredits("Credits");
      lngStrs.setCourseDetails("Course Details");
      lngStrs.setCourseTitle("Course Title");
      lngStrs.setDepartment("Department");
      lngStrs.setGrade("Grade");
      lngStrs.setDescription("Description");
      lngStrs.setClose("Close");
      lngStrs.setCourses("Courses");
      lngStrs.setCalendar("Calendar");
      lngStrs.setGrades("Grades");
      lngStrs.setCourse("Course");
      lngStrs.setLevel("Level");
      lngStrs.setGac("Grades and Credits");
      break;

    case "en-US": // English (United States)
      lngStrs.setSection("Section");
      lngStrs.setCrn("CRN");
      lngStrs.setCredits("Credits");
      lngStrs.setCourseDetails("Course Details");
      lngStrs.setCourseTitle("Course Title");
      lngStrs.setDepartment("Department");
      lngStrs.setGrade("Grade");
      lngStrs.setDescription("Description");
      lngStrs.setClose("Close");
      lngStrs.setCourses("Courses");
      lngStrs.setCalendar("Calendar");
      lngStrs.setGrades("Grades");
      lngStrs.setCourse("Course");
      lngStrs.setLevel("Level");
      lngStrs.setGac("Grades and Credits");
      break;

    case "es": // Spanish
      lngStrs.setSection("Sección");
      lngStrs.setCrn("CRN");
      lngStrs.setCredits("Créditos");
      lngStrs.setCourseDetails("Detalles del curso");
      lngStrs.setCourseTitle("Título del curso");
      lngStrs.setDepartment("Departamento");
      lngStrs.setGrade("Nota");
      lngStrs.setDescription("Descripción");
      lngStrs.setClose("Cerrar");
      lngStrs.setCourses("Cursos");
      lngStrs.setCalendar("Calendario");
      lngStrs.setGrades("Notas");
      lngStrs.setCourse("Curso");
      lngStrs.setLevel("Nivel");
      lngStrs.setGac("Notas y Créditos");
      break;

    case "fr": // French
      lngStrs.setSection("Section");
      lngStrs.setCrn("CRN");
      lngStrs.setCredits("Crédits");
      lngStrs.setCourseDetails("Course Détails");
      lngStrs.setCourseTitle("Titre de cours");
      lngStrs.setDepartment("Départment");
      lngStrs.setGrade("Qualité");
      lngStrs.setDescription("La description");
      lngStrs.setClose("Conclure");
      lngStrs.setCourses("Cours");
      lngStrs.setCalendar("Calendrier");
      lngStrs.setGrades("Les notes");
      lngStrs.setCourse("Cour");
      lngStrs.setLevel("Niveau");
      lngStrs.setGac("Notes et crédits");
      break;

    case "it": // Italian
      lngStrs.setSection("Sezione");
      lngStrs.setCrn("CRN");
      lngStrs.setCredits("Crediti");
      lngStrs.setCourseDetails("Detagli del corso");
      lngStrs.setCourseTitle("Titolo del corso");
      lngStrs.setDepartment("Departamento");
      lngStrs.setGrade("Nota");
      lngStrs.setDescription("Descrizione");
      lngStrs.setClose("Ciuso");
      lngStrs.setCourses("Corsi");
      lngStrs.setCalendar("Calendario");
      lngStrs.setGrades("Note");
      lngStrs.setCourse("Corso");
      lngStrs.setLevel("Livelo"); // or Grado
      lngStrs.setGac("Note e Crediti");
      break;

    default: // Defaults to English (United States)
      lngStrs.setSection("Section");
      lngStrs.setCrn("CRN");
      lngStrs.setCredits("Credits");
      lngStrs.setCourseDetails("Course Details");
      lngStrs.setCourseTitle("Course Title");
      lngStrs.setDepartment("Department");
      lngStrs.setGrade("Grade");
      lngStrs.setDescription("Description");
      lngStrs.setClose("Close");
      lngStrs.setCourses("Courses");
      lngStrs.setCalendar("Calendar");
      lngStrs.setGrades("Grades");
      lngStrs.setCourse("Course");
      lngStrs.setLevel("Level");
      lngStrs.setGac("Grades and Credits");
      break;
    }
    return lngStrs;
  }
}
