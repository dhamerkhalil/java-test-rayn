<img src="https://logodownload.org/wp-content/uploads/2023/06/bandeira-france-flag-0.png" alt="fr-flag" style="width:100px;"/>

## Objectif du projet

Ce projet a pour objectif d'évaluer les compétences intrinsèques des candidats de Automata pour intervenir sur nos projets Back-end **Java** de manière *autonome*.

Les compétences mesurées sont : 
1. Utilisation de **Maven** en multi module projects
2. Compréhension des cycles de vies des produits
3. Réalisation de tests unitaires et d'intégrations
4. Réalisation d'un code de qualité
5. Investissement dans des erreurs simples et moyennes
6. Développement d'une feature complète

Nous vous demandons de faire attention à la qualité et de réaliser ces tâches avec la qualité d'un produit qui doit aller en production. La scalabilité et la maintenabilité sont des critères importants.


---

## Réalisation

Afin de réaliser le test, veuillez *forker* le projet puis nous donner accès à ce repository avec vos modifications.

Pour rendre le projet, veuillez notifier par mail les personnes suivantes : 
- remi.gelibert@akt.io
- alexis.segura@akt.io
- dorian.henault@akt.io
- damien.lenci@akt.io

---

## Context
Vous venez d'être embauché en tant que développeur dans une entreprise qui propose une application de type réseau social : AutoMeta.

Le projet a été implémenté par des stagiaires. L'entreprise vous a embauché pour terminer le MVP et vérifier que le projet
est de bonne qualité. La direction compte beaucoup sur vous, en particulier le CTO.

On attend de vous un regard critique sur le projet. Il y a de nombreux problèmes : dans le code, dans les POM,
dans les dépendances, au niveau de la sécurité...

Le projet est un projet Maven multi-modules composé de : 
- `automata-commons` (contient des éléments de la couche commune).
- `algorithm-library` (contient des algorithmes utiles).
- `user-service` (API pour la ressource user).
- `post-service` (API pour la ressource post).

`user-service` et `post-service` sont déployés de manière indépendante et ont des bases de données séparées.

La direction d'AutoMeta attend un backend scalable, capable de traiter plusieurs centaines de requêtes par minutes.

## Consignes

L'objectif étant de juger votre savoir faire, nous vous demandons de garder l'esprit de qualité de développement. 

Toutes vos analyses et remarques nous intéressent. Vous pouvez écrire dans le fichier doc.md du projet. 
Si vous bloquez sur une question, vous pouvez donner des explications dans ce fichier.

Vos missions sont : 

0. Prenez en main le projet.
1. Vous débutez par le projet `algorithm-library`.
   1. Implémentez l'algorithme de décryption.
2. Vous continuez par le `user-service`. 
   1. Vous remarquez que les mots de passe des utilisateurs sont stockés en clair dans la base. Encryptez-les.
      Votre CTO souhaite que le service d'encryption soit un bean dans le context Spring. 
   2. Vous remarquez qu'aucune verification n'est faite sur les données de l'utilisateur alors que tous les champs sont obligatoires.
   Modifiez le code pour vérifier le format des données. Réutilisez un maximum de l'existant. 
   3. Lancez le service en local et verifiez que vous arrivez bien à accéder au Swagger.
3. Vous continuez sur le `post-service`.
   1. Faites compiler le projet (`mvn compile` OK).
   2. Faites le nécessaire pour que les deux endpoints du service soient fonctionnels.
   3. BONUS : Ajoutez un endpoint REST pour supprimer un post par son ID. La suppresion doit être logique et non physique.
   4. Lancez le service en local et vérifiez que vous arrivez bien à accéder au Swagger.
4. A cette étape, le CTO vous demande une démonstration. 
   1. Tous les projets doivent compiler (`mvn compile` OK) dans le dossier parent.
   2. Tous les tests (unitaires et d'intégration) doivent passer avec la commande (`mvn verify` OK).
   3. Vous devez lui montrer que les Swagger fonctionnent correctement sur `user-service` et `post-service`.
5. La direction espère que le CTO est content de votre démonstration. Ce dernier a des questions à vous poser (répondez dans le fichier doc.md en quelques lignes, soyez bref, vous pouvez faire une liste de points ou des pros/cons). (PAS DE CODE ICI)
   1. Pensez-vous que la structure du projet est la bonne (projet multi-modules maven) ? Pourquoi ?
   2. La direction souhaite envoyer une notification lorsqu'un post est créé. Pour cela, il suggère d'ajouter un `notification-service`. Comment est-ce que vous implémenteriez le trigger qui permettrait d'envoyer une notification lorsqu'un post est crée ? Le CTO n'impose aucune contrainte sur les technologies, temps de développement ...
6. BONUS : Ajoutez un algorithme de permutation.
    - Cet algorithme doit pouvoir permuter 2 à 2 les éléments de la chaîne de caractère
    - Si le nombre de caractère est impaire, nous devons appliquer l'algorithme existant (ROT13) sur ce dernier caractère.
    - Par exemple : KAYA devient AKAY (K <-> A et Y <-> A)
    - Exemple avec Impair : KAYAK devient AKAYX
7. BONUS : Un concurrent d'AutoMeta aurait tout intérer à connaitre le nombre d'utilisateurs du réseau social. Votre CTO ne souhaite pas que cette information fuite.
   Une rapide analyse de `user-service` permet de détecter le problème. Résolvez-le.
8. BONUS : VVirtous avez entendu dire que les virtual threads de Java 21 pouvaient améliorer les performances de vos services. Configurez le projet pour que lorsque les requêtes utilisateurs arrivent, 
   elles soient traitées par des virtual threads.

    
    
    
    
___
<img src="https://logodownload.org/wp-content/uploads/2023/06/bandeira-united-kingdom-flag-0.png" alt="eng-flag" style="width:100px;"/>

## Project Objective

The objective of this project is to evaluate the intrinsic skills of Automata's candidates to intervene on our **Java** Back-end projects in an *autonomous* manner.

The skills measured are: 
1. Use of **Maven** in multi module projects
2. Understanding of product life cycles
3. Performing unit and integration tests
4. Achieving quality code
5. Investing in simple and medium errors
6. Development of a complete feature

We ask you to pay attention to the quality of the product and to perform this task with the quality of a product that has to go into production. Scalability and maintainability are important criteria.


---

## Implementation

In order to perform the test, please *fork the project and give us access to this repository with your modifications.

To make the project, please notify by mail the following people: 
- remi.gelibert@akt.io
- alexis.segura@akt.io
- dorian.henault@akt.io
- damien.lenci@akt.io

---

## Context
You've just been hired as a developer at a company offering a social networking application: AutoMeta.

The project has been implemented by interns. The company has hired you to complete the MVP and check that the project
is of good quality. Management is relying heavily on you, especially the CTO.

You're expected to take a critical look at the project. There are many problems: in the code, in the POM,
in dependencies, in security...

The project is a multi-modules Maven project made up of :
- `automata-commons` (contains elements of the common layer).
- `algorithm-library` (contains useful algorithms).
- `user-service` (API for the user resource).
- `post-service` (API for the post resource).

`user-service` and `post-service` are deployed independently and have separate databases.

AutoMeta's management expects a scalable backend, capable of handling several hundred requests per minute.

---
## Instructions

As our aim is to judge your know-how, we ask you to keep in mind the quality of your development.

We are interested in all your analyses and comments. You can write in the project's doc.md file.
If you get stuck on a question, you can provide explanations in this file.

Your tasks are :

0. Take charge of the project.
1. You start with the `algorithm-library` project.
   1. Implement the decryption algorithm.
2. You continue with the `user-service`.
   1. You notice that user passwords are stored in clear text in the database. Encrypt them.
      Your CTO wants the encryption service to be a bean in the Spring context.
   2. You notice that no verification is performed on user data, even though all fields are mandatory.
      Modify the code to check the data format. Reuse as much of the existing code as possible.
   3. Run the service locally and check that you can access the Swagger.
3. Continue with the `post-service`.
   1. Compile the project (`mvn compile` OK).
   2. Make sure both service endpoints are functional.
   3. BONUS: Add a REST endpoint to delete a post by its ID. The deletion must be logical, not physical.
   4. Run the service locally and check that you can access the Swagger.
4. At this stage, the CTO asks for a demonstration.
   1. All projects must compile (`mvn compile` OK) in the parent folder.
   2. All tests (unit and integration) must pass with the command (`mvn verify` OK).
   3. You must show that Swagger works correctly on `user-service` and `post-service`.
5. Management hopes the CTO is happy with your demonstration. He has some questions for you (answer them in the doc.md file in a few lines, be brief, you can make a list of points or pros/cons). (NO CODE HERE)
   1. Do you think the project structure is the right one (multi-module maven project)? Why or why not?
   2. Management wants to send a notification when a post is created. To do this, they suggest adding a `notification-service`. How would you implement the trigger to send a notification when a post is created? The CTO imposes no constraints on technology, development time, etc.
6. BONUS: Add a permutation algorithm.
   - This algorithm must be able to permute 2 by 2 the elements of the character string
   - If the number of characters is odd, we must apply the existing algorithm (ROT13) to the last character.
   - For example: KAYA becomes AKAY (K <-> A and Y <-> A)
   - Example with Odd: KAYAK becomes AKAYX
7. BONUS: A competitor of AutoMeta's would like to know the number of users of the social network. Your CTO doesn't want this information to leak out.
   A quick `user-service` analysis detects the problem. Solve it.
8. BONUS: You've heard that Java 21's virtual threads can improve the performance of your services. Configure your project so that when user requests arrive,
   they are processed by virtual threads.
