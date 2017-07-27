package edu.oakland.translations;

import edu.oakland.translations.services.ITranslationsService;

public interface ITranslationsFactory { ITranslationsService get(String portlet); }
