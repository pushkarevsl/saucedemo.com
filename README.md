# Проект автотестов для сайта SauceDemo

## Описание

Фреймворк для автоматизированного тестирования с использованием Selenium, Allure, и Gradle.

## Структура проекта

- `pages` - Page Object классы
- `tests` - Тестовые сценарии
- `helpers` - Утилиты, включая конфигурацию

## Установка и запуск

1. Установите зависимости:

   ```bash
   ./gradlew build

2. Запуск тестов

   ```bash
   ./gradlew test

3. Просмотр отчетов Allure

   ```bash
   allure serve build/allure-results

