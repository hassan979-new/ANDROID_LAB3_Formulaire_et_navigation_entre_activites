# Android Java – Formulaire et navigation entre activités

## 📖 Description
Cette application Android permet de :
- Saisir des informations personnelles (nom, email, téléphone, adresse, ville).
- Valider les champs obligatoires (nom et email).
- Vérifier la validité de l’email.
- Envoyer les données vers une seconde activité pour affichage récapitulatif.
- Partager les informations via une intention de type `ACTION_SEND`.

---
## 📂 Structure du projet
```
app/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── lab3/
│       │               ├── MainActivity.java
│       │               └── Screen2Activity.java
│       └── res/
│           └── layout/
│               ├── activity_main.xml
│               └── activity_screen2.xml
└── AndroidManifest.xml
```
---
## 📲 Installation de l’APK

Pour installer l’APK de ce projet Android :

1. **Compiler l’application**  
   - Ouvrir le projet dans **Android Studio**.  
   - Aller dans le menu **Build > Build Bundle(s) / APK(s) > Build APK(s)**.
   - <img width="960" height="540" alt="image" src="https://github.com/user-attachments/assets/f8013d07-8ca0-44f1-ba68-70147e031e22" />
   - Le fichier APK sera généré dans le dossier :  
     ```
     app/build/outputs/apk/debug/app-debug.apk
     ```
2. **Transférer l’APK sur votre appareil Android**  
   - Copier le fichier `app-debug.apk` sur votre smartphone (via câble USB, Bluetooth,...).  

3. **Autoriser les sources inconnues**  
   - Sur votre appareil Android, aller dans **Paramètres > Sécurité**.  
   - Activer l’option **Installer des applications depuis des sources inconnues**.  

4. **Installer l’APK**  
   - Ouvrir le fichier `app-debug.apk` sur votre smartphone.  
   - Suivre les instructions pour installer l’application.  

5. **Lancer l’application**  
   - Une fois installée, l’application sera disponible dans le menu des applications sous le nom **Lab3**.
   - <img width="347" height="800" alt="image" src="https://github.com/user-attachments/assets/dbd84728-7649-4c49-87e7-fadf60fa0f75" />
   - <img width="347" height="800" alt="image" src="https://github.com/user-attachments/assets/2c683f7a-73e2-428b-bfed-1b0105a692c0" />
---

## ⚙️ Fonctionnalités
- **MainActivity** :
  - Formulaire avec champs `EditText` pour nom, email, téléphone, adresse, ville.
  - Validation : nom et email obligatoires, email conforme au format.
  - Envoi des données vers `Screen2Activity` via `Intent`.
  - Réinitialisation des champs à chaque retour (`onResume`).

- **Screen2Activity** :
  - Affiche un récapitulatif des données reçues.
  - Bouton **Retour** : revient à l’écran principal.
  - Bouton **Partager** : partage les informations via une application externe (SMS, email, etc.).

---

## 🖥️ Exemple d’exécution
1. L’utilisateur saisit les informations :  
- <img width="359" height="467" alt="image" src="https://github.com/user-attachments/assets/75128581-c0e8-4eb1-ac5b-ee1453c3094e" />
2. Après validation, l’écran 2 affiche :  
- <img width="359" height="467" alt="image" src="https://github.com/user-attachments/assets/ef483ca8-e65a-432d-b75a-f5b418101d65" />
3. L’utilisateur peut :  
- Cliquer sur **Retour** pour revenir au formulaire.
- <img width="359" height="467" alt="image" src="https://github.com/user-attachments/assets/4bb8d507-527f-47f6-80ad-af3d0c15153d" />
- Cliquer sur **Partager** pour envoyer ces informations via une autre application.  
- <img width="359" height="467" alt="image" src="https://github.com/user-attachments/assets/0996ff2f-1b0a-44c3-a83f-e72f583fb2bc" />
---

## 💡 Concepts pratiqués
- Validation des champs obligatoires (`isEmpty`, `Patterns.EMAIL_ADDRESS`).
- Passage de données entre activités avec `Intent` et `putExtra`.
- Affichage conditionnel avec méthode `safe()` pour éviter les valeurs nulles.
- Partage de texte avec `Intent.ACTION_SEND`.
- Cycle de vie d’une activité (`onResume`).

---

## 🧑‍💻 Auteur
👤 **Agouram Hassan**  
📱 Développement Android Java  
🎓 Instructor : **Mr. LACHGAR**  
📅 6 Mars 2026

