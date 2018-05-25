# Translations

Spring boot application for adding i18n support to portlets and soffits using [i18next](https://www.i18next.com/)

## Overview

This application makes heavy use of the [factory pattern](https://www.tutorialspoint.com/design_pattern/factory_pattern.htm).
This makes it easy to add new portlets and soffits to the translation service. To add a new portlet or soffit.
First make a new model that extends [_Translations.java_](src/main/java/edu/oakland/translations/models/Translations.java) that has all of the translation information.
Anything that is shared across all portlets and soffits can be added to _Transalations.java_.
Then to make a translation service by implementing the [`ITranslationsService`](src/main/java/edu/oakland/translations/services/ITranslationsService.java) interface and have a `@Component("portlet_name")` annotation on the class.

## Caching

When creating a new `@Component` that component's name needs to be appended to the [_application.properties_](https://github.com/Oakland-University/translations/blob/TR-2/src/main/resources/application.properties#L3) file with the rest of the cache names. The `Cacheable` annotation should follow the following format

```java
@Cacheable(value = "portlet_name", key = "{ #root.methodName, #languageCode }")
```

To view the translations go to `/api/v1/locales/{porlet_name}/{lng}/{ns}`. If no portlet or soffit name is found, it will return a 404.

## Building

```sh
./gradlew clean assemble
```

## Deploying

Copy over the compiled war file to tomcat or use the built in tomcat

```sh
./gradlew bootRun
```
