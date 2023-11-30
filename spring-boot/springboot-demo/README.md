# Project API RESTFul Spring
Criando uma aplicação API RESTFul utilizando Java, Spring e PostegreSQL

## Tecnologias utilizadas

- Java 11
- Spring
- H2 Database
- Swagger (SpringDoc OpenAPI)
- Railway
- PostgreSQL

## Diagrama de classes

```mermaid
classDiagram
  class User {
    - String name
    - Account account
    - List<Feature> features
    - Card card
    - List<News> news
  }

  class Account {
    - String number
    - String agency
    - Float balance
    - Float limit
  }

  class Feature {
    - String icon
    - String description
  }

  class Card {
    - String number
    - Float limit
  }

  class News {
    - String icon
    - String description
  }

  User "1" -- "1" Account
  User "1" -- "1..*" Feature
  User "1" -- "1" Card 
  User "1" -- "1..*" News 



```

### Documentação da API (Swagger)

- Link: https://sdw-2023-api-production-1e0e.up.railway.app/swagger-ui/index.html

### URL da Produção (Railway)

- Link: https://sdw-2023-api-production-1e0e.up.railway.app/
  
