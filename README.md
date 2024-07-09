# REST API для управления организациями

Этот проект представляет собой пример REST API для управления информацией об организациях. Приложение разработано на базе Spring Boot и включает в себя следующие функции:

- Получение списка всех организаций
- Поиск организаций по наименованию (частичное совпадение)
- Получение информации об организации по её идентификатору

## Требования

Для запуска и работы с проектом вам потребуется:

- Java 11 или выше
- Maven 3.x
- PostgreSQL

## Запуск приложения

### Настройка базы данных

1. Создайте базу данных PostgreSQL.
2. Укажите настройки подключения в файле `application.yaml`.

### Запуск приложения

1. Соберите проект с помощью Maven:

   ```bash
   mvn clean package
2.Запустите приложение:
```bash
java -jar target/aontt-test-0.0.1-SNAPSHOT.jar
Приложение будет доступно по адресу http://localhost:8080.

Получение списка всех организаций

GET /organizations
Параметры запроса:

search (опционально): Поиск организаций по части полного наименования.
Пример запроса:

GET /organizations
Получение организации по идентификатору

GET /organizations/{id}
Параметры пути:

{id}: Идентификатор организации.
Пример запроса:

GET /organizations/1
Примеры ответов
Ответ на запрос списка организаций:

[
    {
        "id": 1,
        "fullName": "ООО Рога и Копыта",
        "shortName": "Рога и Копыта",
        "inn": "1234567890",
        "ogrn": "0987654321",
        "postalAddress": "г. Москва, ул. Пушкина, д. Колотушкина",
        "legalAddress": "г. Москва, ул. Ленина, д. Сталина",
        "ceoFullName": "Иванов Иван Иванович",
        "ceoBirthDate": "1975-05-15"
    },
    {
        "id": 2,
        "fullName": "АО Быстро и Серьезно",
        "shortName": "Быстро и Серьезно",
        "inn": "9876543210",
        "ogrn": "0123456789",
        "postalAddress": "г. Санкт-Петербург, ул. Комсомольская, д. 1",
        "legalAddress": "г. Санкт-Петербург, ул. Красноармейская, д. 10",
        "ceoFullName": "Петров Петр Петрович",
        "ceoBirthDate": "1980-10-20"
    }
]
Ответ на запрос информации об организации:

{
    "id": 1,
    "fullName": "ООО Рога и Копыта",
    "shortName": "Рога и Копыта",
    "inn": "1234567890",
    "ogrn": "0987654321",
    "postalAddress": "г. Москва, ул. Пушкина, д. Колотушкина",
    "legalAddress": "г. Москва, ул. Ленина, д. Сталина",
    "ceoFullName": "Иванов Иван Иванович",
    "ceoBirthDate": "1975-05-15"
}
