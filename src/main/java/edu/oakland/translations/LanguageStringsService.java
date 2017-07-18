package edu.oakland.translations;

import edu.oakland.translations.LanguageStrings;

import org.springframework.stereotype.Service;
import org.springframework.cache.annotation.Cacheable;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Arrays;

@Service
public class LanguageStringsService implements ILanguageStringsService {
  /**
   * Internationalize each string.
   * @param languageCode the IETF language tag from the browser
   **/
  @Cacheable("translations")
  public LanguageStrings getTranslations(String languageCode) {
    LanguageStrings lngStrs = new LanguageStrings();

    // Set date and time formatting
    Locale locale = Locale.forLanguageTag(languageCode);
    DateFormatSymbols dfs = new DateFormatSymbols(locale);

    String[] months = dfs.getMonths();
    String[] shortMonths = dfs.getShortMonths();
    String[] weekDays = dfs.getWeekdays();
    String[] shortWeekDays = dfs.getShortWeekdays();

    lngStrs.setJanuary(months[0]);
    lngStrs.setFebruary(months[1]);
    lngStrs.setMarch(months[2]);
    lngStrs.setApril(months[3]);
    lngStrs.setMay(months[4]);
    lngStrs.setJune(months[5]);
    lngStrs.setJuly(months[6]);
    lngStrs.setAugust(months[7]);
    lngStrs.setSeptember(months[8]);
    lngStrs.setOctober(months[9]);
    lngStrs.setNovember(months[10]);
    lngStrs.setDecember(months[11]);

    lngStrs.setShortJanuary(shortMonths[0]);
    lngStrs.setShortFebruary(shortMonths[1]);
    lngStrs.setShortMarch(shortMonths[2]);
    lngStrs.setShortApril(shortMonths[3]);
    lngStrs.setShortMay(shortMonths[4]);
    lngStrs.setShortJune(shortMonths[5]);
    lngStrs.setShortJuly(shortMonths[6]);
    lngStrs.setShortAugust(shortMonths[7]);
    lngStrs.setShortSeptember(shortMonths[8]);
    lngStrs.setShortOctober(shortMonths[9]);
    lngStrs.setShortNovember(shortMonths[10]);
    lngStrs.setShortDecember(shortMonths[11]);

    lngStrs.setSunday(weekDays[1]);
    lngStrs.setMonday(weekDays[2]);
    lngStrs.setTuesday(weekDays[3]);
    lngStrs.setWednesday(weekDays[4]);
    lngStrs.setThursday(weekDays[5]);
    lngStrs.setFriday(weekDays[6]);
    lngStrs.setSaturday(weekDays[7]);

    lngStrs.setShortSunday(shortWeekDays[1]);
    lngStrs.setShortMonday(shortWeekDays[2]);
    lngStrs.setShortTuesday(shortWeekDays[3]);
    lngStrs.setShortWednesday(shortWeekDays[4]);
    lngStrs.setShortThursday(shortWeekDays[5]);
    lngStrs.setShortFriday(shortWeekDays[6]);
    lngStrs.setShortSaturday(shortWeekDays[7]);

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

        lngStrs.setWeek("Woche");
        lngStrs.setSchedule("Stundenplan");
        lngStrs.setMonth("Monat");

        lngStrs.setHour7("7 Uhr");
        lngStrs.setHour8("8 Uhr");
        lngStrs.setHour9("9 Uhr");
        lngStrs.setHour10("10 Uhr");
        lngStrs.setHour11("11 Uhr");
        lngStrs.setHour12("12 Uhr");
        lngStrs.setHour13("13 Uhr");
        lngStrs.setHour14("14 Uhr");
        lngStrs.setHour15("15 Uhr");
        lngStrs.setHour16("16 Uhr");
        lngStrs.setHour17("17 Uhr");
        lngStrs.setHour18("18 Uhr");
        lngStrs.setHour19("19 Uhr");
        lngStrs.setHour20("20 Uhr");
        lngStrs.setHour21("21 Uhr");
        lngStrs.setHour22("22 Uhr");
        lngStrs.setHour23("23 Uhr");

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

        lngStrs.setWeek("Week");
        lngStrs.setSchedule("Schedule"); // Just say it different :)
        lngStrs.setMonth("Month");

        lngStrs.setHour7("07:00");
        lngStrs.setHour8("08:00");
        lngStrs.setHour9("09:00");
        lngStrs.setHour10("10:00");
        lngStrs.setHour11("11:00");
        lngStrs.setHour12("12:00");
        lngStrs.setHour13("13:00");
        lngStrs.setHour14("14:00");
        lngStrs.setHour15("15:00");
        lngStrs.setHour16("16:00");
        lngStrs.setHour17("17:00");
        lngStrs.setHour18("18:00");
        lngStrs.setHour19("19:00");
        lngStrs.setHour20("20:00");
        lngStrs.setHour21("21:00");
        lngStrs.setHour22("22:00");
        lngStrs.setHour23("23:00");

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

        lngStrs.setWeek("Week");
        lngStrs.setSchedule("Schedule");
        lngStrs.setMonth("Month");

        lngStrs.setHour7("7am");
        lngStrs.setHour8("8am");
        lngStrs.setHour9("9am");
        lngStrs.setHour10("10am");
        lngStrs.setHour11("11am");
        lngStrs.setHour12("12pm");
        lngStrs.setHour13("1pm");
        lngStrs.setHour14("2pm");
        lngStrs.setHour15("3pm");
        lngStrs.setHour16("4pm");
        lngStrs.setHour17("5pm");
        lngStrs.setHour18("6pm");
        lngStrs.setHour19("7pm");
        lngStrs.setHour20("8pm");
        lngStrs.setHour21("9pm");
        lngStrs.setHour22("10pm");
        lngStrs.setHour23("11pm");

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

        lngStrs.setWeek("Semana");
        lngStrs.setSchedule("Horario");
        lngStrs.setMonth("Mes");

        lngStrs.setHour7("07:00");
        lngStrs.setHour8("08:00");
        lngStrs.setHour9("09:00");
        lngStrs.setHour10("10:00");
        lngStrs.setHour11("11:00");
        lngStrs.setHour12("12:00");
        lngStrs.setHour13("13:00");
        lngStrs.setHour14("14:00");
        lngStrs.setHour15("15:00");
        lngStrs.setHour16("16:00");
        lngStrs.setHour17("17:00");
        lngStrs.setHour18("18:00");
        lngStrs.setHour19("19:00");
        lngStrs.setHour20("20:00");
        lngStrs.setHour21("21:00");
        lngStrs.setHour22("22:00");
        lngStrs.setHour23("23:00");
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

        lngStrs.setWeek("Semaine");
        lngStrs.setSchedule("Programme");
        lngStrs.setMonth("Mois");

        lngStrs.setHour7("07h00");
        lngStrs.setHour8("08h00");
        lngStrs.setHour9("09h00");
        lngStrs.setHour10("10h00");
        lngStrs.setHour11("11h00");
        lngStrs.setHour12("12h00");
        lngStrs.setHour13("13h00");
        lngStrs.setHour14("14h00");
        lngStrs.setHour15("15h00");
        lngStrs.setHour16("16h00");
        lngStrs.setHour17("17h00");
        lngStrs.setHour18("18h00");
        lngStrs.setHour19("19h00");
        lngStrs.setHour20("20h00");
        lngStrs.setHour21("21h00");
        lngStrs.setHour22("22h00");
        lngStrs.setHour23("23h00");

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

        lngStrs.setWeek("Week");
        lngStrs.setSchedule("Schedule");
        lngStrs.setMonth("Month");

        lngStrs.setHour7("7am");
        lngStrs.setHour8("8am");
        lngStrs.setHour9("9am");
        lngStrs.setHour10("10am");
        lngStrs.setHour11("11am");
        lngStrs.setHour12("12pm");
        lngStrs.setHour13("1pm");
        lngStrs.setHour14("2pm");
        lngStrs.setHour15("3pm");
        lngStrs.setHour16("4pm");
        lngStrs.setHour17("5pm");
        lngStrs.setHour18("6pm");
        lngStrs.setHour19("7pm");
        lngStrs.setHour20("8pm");
        lngStrs.setHour21("9pm");
        lngStrs.setHour22("10pm");
        lngStrs.setHour23("11pm");

        break;
    }
    return lngStrs;
  }
}
