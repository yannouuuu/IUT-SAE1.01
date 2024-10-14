<br/>
<p align="center">
    <picture>
        <source media="(prefers-color-scheme: dark)" srcset="https://github.com/yannouuuu/IUT-SAE1.01/raw/main/.github/assets/header_univlille_light.png" width="200px">
        <img alt="UnivLilleLogo" src="https://github.com/yannouuuu/IUT-SAE1.01/raw/main/.github/assets/header_univlille_dark.png" width="200px">
    </picture>
  <h1 align="center">IUT-SAE1.01</h1>
</p>

<p align="center">
    Module d'initiation au développement simple en BUT1 d'Informatique
    <br/>
    <br/>
    <a href="https://moodle.univ-lille.fr/course/view.php?id=28289&sectionid=245638"><strong>Voir la page sur le moodle »</strong></a><br><br>
    <a href="https://www.notion.so/univlille/BUT1-Informatique-IUT-de-Lille-705aa08c54ab423ab79f02b3e22336b7?pvs=4"><strong>Voir la SAE complète sur Notion (sur invitation) »</strong></a><br><br>
  </p>
</p>

## Sommaire

- [Semaine 1 : Mise en route](./Semaine1/)
- [Semaine 2 : Échauffement](./Semaine2/)
- [Semaine 3 : Entraînement renforcé](./Semaine3/)
- [Semaine 4 : Petits Challenges](./Semaine4/)

### Environnement de développement

Notre initiation se déroule sur un Java modifié et propriétaire à l'IUT de Lille. Vous pouvez trouver les fichiers et ressources nécessaires dans le dossier `ressources/ijava` du dépôt (un program.jar s'y trouve).

### Conseils/Commandes pratiques


Pour configurer un environnement de développement similaire à celui utilisé en TP, suivez ces étapes :

1. **Installer le JDK** :
   - Vérifiez si le JDK est déjà installé en exécutant `javac -version`. Si la commande renvoie une version (ex. `javac 11.0.12`), vous êtes prêt. Sinon, téléchargez le JDK pour votre système d'exploitation [ici](https://www.oracle.com/java/technologies/downloads/).

2. **Utiliser `program.jar`** :
   - Le fichier `program.jar` de Ijava est déjà disponible dans le dossier [`resources/ijava`](./resources/ijava/ijava.jar).

3. **Compiler et exécuter les programmes** :
   - **Compilation** :
     - Linux/MacOS : `javac -cp ../resources/ijava/program.jar:. Hello.java`
     - Windows : `javac -cp "..\resources\ijava\program.jar;." Hello.java`
   - **Exécution** :
     - Linux/MacOS : `java -cp ../resources/ijava/program.jar:. Hello`
     - Windows : `java -cp "..\resources\ijava\program.jar;." Hello`

   > **ATTENTION :** Ces commandes supposent que le fichier `Hello.java` est dans le répertoire courant et que `program.jar` se trouve dans `resources/ijava`.

### Interrogations hebdomadaires

Chaque semaine, nous sommes interrogés sur les concepts et les compétences acquises. Cela permet de garantir que nous maîtrisons les fondamentaux du développement en Java.

### Remerciements

Nous tenons à créditer **SECQ Yann et ABIDI Sofiene, ALMEIDA COCO Amadeu, BONEVA Iovka, CASTILLON
Antoine, DELECROIX Fabien, LEPRETRE Éric, SANTANA MAIA Deise** pour la création des diaporamas de cours, des TP, TD et pour la réalisation des SAE chaque semaine. Leur travail a été précieux pour notre apprentissage.

<br/>
<p align="center">
    <picture>
        <img alt="UnivLilleLogo" src="https://github.com/yannouuuu/IUT-SAE1.01/raw/main/.github/assets/footer_univlille.png">
    </picture>
</p>