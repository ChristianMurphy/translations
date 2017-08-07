package edu.oakland.translations;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.oakland.translations.models.Translations;

@RestController
@RequestMapping(value = "/api/v1/locales")
public class TranslationsController {
  @Autowired ITranslationsFactory translationsFactory;

  private final Logger log = LoggerFactory.getLogger(getClass());

  @RequestMapping(value = "/{portlet}/{lng}/{ns}",
                  produces = "application/json")
  public Translations
  translate(@PathVariable("lng") String lng,
            @PathVariable("portlet") String portlet,
            final HttpServletResponse response) {
    try {
      return translationsFactory.get(portlet).getTranslations(lng);
    } catch (Exception e) {
      log.info("portlet {} not found", portlet);
      response.setStatus(HttpStatus.NOT_FOUND.value());
      return null;
    }
  }
}
