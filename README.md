## Chapitre 1. Utilisation du SDK

### 1.1. Pré-requis
Le SDK nécessite Java 17 au minimum.
Il nécessite également l’utilisation des librairies suivantes :
- Apache HttpClient 5 (version 5.2.1 ou supérieure)
- Jackson Core et Jackson Datatype JSR310 (version 2.18.2 ou supérieure)
- Jackson Databind Nullable (version 0.2.6 ou supérieure)

### 1.2. Configuration du SDK
La configuration du SDK est une étape préalable à tout appel aux API AgoraPay.
Elle permet au SDK de demander/renouveler un jeton d’accès de manière automatique et
transparente, de sorte que l’application utilisant le SDK n’ait pas à gérer l’aspect authentification et
renouvellement de l’authentification
L’initialisation du SDK s’effectue via un appel à Configuration.getAutoLoginApiClient.
3 paramètres sont à transmettre à la méthode :
- l’URL du serveur AgoraPay- le clientId de connexion à l’API Agora Pay
- le clientSecret de connexion à l’API Agora Pay
Il faut ensuite définir le chemin de base de l’API AgoraPay via un appel à defaultClient.setBasePath

### 1.3. Appel d’une API
Plusieurs exemples d’appels sont présentés dans l’application de démo (voir chapitre suivant)
La cinématique est toujours la même :
- Préparation des paramètres d’appel
- Appel de l’API via l’appel à la méthode correspondant d’une instance de DefaultAPI
- Récupération de la réponse
Les erreurs sont transmises sous forme d’API Exception.
Veuillez-vous réferer à la javadoc du SDK pour la liste complète des API supportées


## Chapitre 2. Utiliser l’application de démonstration
Le SDK est livré avec une application démo permettant de se familiariser avec les principales fonctionnalités du SDK :
- Configuration du SDK
- Appel d’API
Le code de cette application est contenu dans le répertoire ./agorapay-sample du livrable.

### 2.1. Installation de l’application
Pour installer l’application de démonstration, il suffit d’ouvrir le répertoire agorapay-sample dans votre IDE.
Pour simplifier son utilisation, le jar du SDK est déjà présent dans le répertoire demo/libs et est importé de manière statique via le pom.xml.

### 2.2. Exécution de l’application
Pour lancer l’application de démonstration, il est nécessaire au préalable de renseigner les identifiants de connexion qui vous ont été fournis par CAPS pour vous connecter à la plateforme d’homologation.
Dans la classe AgoraPaySdkSample, modifiez les valeurs de
- SERVER_URL (Si nécessaire)
- CLIENT_ID
- CLIENT_SECRET
Puis lancez la classe AgoraPaySdkSample.
Vous pouvez enrichir l’application pour tester d’autres fonctionnalités du SDK.
