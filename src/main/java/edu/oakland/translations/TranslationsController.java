package edu.oakland.translations;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import edu.oakland.translations.LanguageStrings;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(value = "/locales")
public class TranslationsController {
  @Autowired LanguageStringsService lngService;

  @RequestMapping(value = "/{lng}/{ns}", produces = "application/json")
  public LanguageStrings translate(@PathVariable("lng") String lng) {
    return lngService.getTranslations(lng);
  }
}
