# Translations
Spring boot application for adding i18n support to portlets and soffits using [i18next](https://www.i18next.com/)

## Overview
This application makes heavy use of the [factory pattern](https://www.tutorialspoint.com/design_pattern/factory_pattern.htm). This makes it easy to add new portlets/soffits to the translation service. To add a new portlet/soffit, first make a new model that extends [Transalations](src/main/java/edu/oakland/translations/models/Translations.java) that has all of the translation information. For anything that is shared across all portlets/soffits it can be added to Transalations.java. Then to make a translation service, implement the [ITranslationsService](src/main/java/edu/oakland/translations/services/ITranslationsService.java) interface and have a `@Component("portlet_name")` annotation on the class.

To view the translations go to `/api-v1/locales/{porlet_name}/{lng}/{ns}`. If no portlet/soffit name is found, it will return a 404.
