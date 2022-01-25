## Spring Data MongoDB - REST API exemple
Dans ce projet, nous allons voir un exemple d'API REST pour une entité `Candidate` avec une base de donnée MongoDB. 

### Prérequis
---
Pour travailler dans un projet Spring Boot, vous auriez besoin des spécifications suivantes :<br/>
- Spring Boot v2.0+<br/>
- JDK v1.8+<br/>
- Maven 3+ ou Gradle 4+ - outil de construction<br/>
- Tout IDE prenant en charge Java et Spring Boot (Spring Tool Suite (STS), IntelliJ, VSCode, NetBeans, etc.)<br/>

### Dependances Maven
---
Dans ce tuto nous allons utiliser les dependances de base suivants :
* **Spring Web** - pour inclure Spring MVC et utilise le tomcat comme conteneur intégré par défaut.
* **Spring Data MongoDB** - sert à stocker et à récupérer des données entre une base de données NoSQL et un objet Java (POJO).
* **Spring Boot DevTools** - dépendance pour les rechargements automatiques ou le rechargement en direct des applications.
* **springdoc-openapi-ui** - dépendances pour la documentation de l'API swagger 3.

### Exigences technique
---
- Les données sont stockées dans un SGBD<br/>
- L'application est composé de 5 couches :<br/>
	- La couche de données (model) pour les classes entités (domain object et DTO)<br/>
	- La couche DOA (Repository, Spring Data, JPA, Hibenate et JDBC) pour interagir avec la base de données<br/>
	- La couche métier pour le traitement de la logique métier<br/>
	- La couche infrastructure (controller)  basée sur Rest API pour traiter la logique d'entreprise
	- La couche exception (erreur) est une classe pour la gestion des exceptions

### Exécuter et tester les API
---
Pour tester les APIs vous pouvez utiliser Postman, Swagger, curl ou n'importe quel client HTTP :
* L'API d'URL GET `/api/candidates` - renvoie une liste des candidats
* L'API d'URL GET `/api/candidates/{id}` - renvoie un candidat
* L'API d'URL POST `/api/candidates` - Ajouter un candidat
* L'API d'URL PUT `/api/candidates/{id}` - mettre à jour un candidat
* L'API d'URL DELETE `/api/candidates/{id}` - supprimer un candidat
* L'API d'URL GET `/api/candidates/searchByEmail?email=mot-clé` - rechercehe un candidat par email
* L'API d'URL GET `/api/candidates/searchByExp?expFrom=valeur&expTo=valeur` - rechercehe des candidats entre deux valeurs

Voila ! dans ce repo nous avons réalisé un exemple d'API REST pour un CRUD et des méthodes de requête personnalisées avec Spring Data MongoDB.