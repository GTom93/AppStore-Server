# AppStore-Server

Do uruchomienia potrzeba gradle w wersji 4+  
https://gradle.org/releases/

Executable jar - [download jar](https://github.com/Patresss/Clicker/raw/master/clicker.jar)
java -jar AppStore-Server.jar

Socket:
- Przykład jest w http://localhost:8080
- MessageMapping("/hello")
- SendTo("/topic/greetings")

Rest:
- Swagger: http://localhost:8080/swagger-ui.html
- Welcome 
    - http://localhost:8080/api/welcome
    - http://localhost:8080/api/welcome/{name}

- Game (cały CRUD)
    - http://localhost:8080/api/games


Aby uruchomić: gradle bootRun

Są dwa profile:
- dev (baza H2)
- prod (baza postgres)

Domyślnie jest dev. Aby zmienić należy w pliku build.gradle ustawić "def profiles = 'prod'". W pliku application-prod.yml jest konfiguracja do bazy postgres

