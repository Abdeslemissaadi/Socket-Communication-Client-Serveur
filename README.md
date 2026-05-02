Socket – Communication Client/Serveur en Java
🚀 Présentation du projet

Ce projet a pour objectif de démontrer le fonctionnement d’une communication réseau en Java à l’aide des Sockets.

Il met en place une architecture simple Client / Serveur, où :

Le client envoie une donnée (un nombre)

Le serveur traite cette donnée

Le serveur renvoie le résultat au client


🎯 Traitement effectué :

👉 Le serveur multiplie le nombre reçu par 3

🧠 Objectifs pédagogiques

Ce projet permet de comprendre :

Le fonctionnement des Sockets en Java

La communication entre deux applications via le réseau

L’utilisation des flux :

InputStream (lecture)

OutputStream (écriture)

La gestion d’une connexion client/serveur

⚙️ Technologies utilisées

Java (JDK 8)

Programmation réseau (Sockets)

Input/Output Streams

🔄 Fonctionnement de l'application

🖥️ Serveur (Server.java)

Démarre sur le port 1025

Attend la connexion d’un client
<img width="713" height="91" alt="image" src="https://github.com/user-attachments/assets/d9631208-80ec-4eaf-8c19-b2337474d0e6" />

Reçoit un nombre

Calcule : nombre × 3
<img width="740" height="41" alt="image" src="https://github.com/user-attachments/assets/15a098dc-3422-4a3b-8059-8f69742b7419" />

Envoie le résultat au client
<img width="432" height="46" alt="image" src="https://github.com/user-attachments/assets/0fa093a6-20ba-493e-9975-1ab36130af48" />

💻 Client (Client.java)
Se connecte au serveur (localhost, port 1025)

Demande à l’utilisateur de saisir un nombre

Envoie ce nombre au serveur

Reçoit le résultat

Affiche le résultat

⚠️ Remarques importantes
Le serveur doit être lancé avant le client

Le port utilisé est 1025

La communication se fait en local (localhost)

