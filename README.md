# videoBeheerInternetProgrammeren
Dit is voor mijn project voor internetprogrammeren

// TODO:

[] alle facade methoden schrijven, dus de methoden die met de andere klassen connecteren
[] mijn troubleshooting formulier aanvullen met links en hulp voor connecties enz
[] mijn testklassen afmaken

//alle testklassen voor de facade schrijven

hulp van project ooo voor db klassen

https://projectwerk.khleuven.be/projects/reeks_3-4_labogroepjes_3/repository/show/CompetentieTester

//

als je je project in intellij idea wil opsplitsen in modules moet je paar stappen doen:

1) file --> new --> module

2) click maven and next or choose archetype

3) kies naam voor groupId en ArtifactID

4) add as module to: none kiezen

5) als parent module kiezen: none

6) kiezen waar op te slaan en voila.

En dan in de pom.xml van uw module de domain klasse aan de module linken.

<dependencies>
        <dependency>
            <groupId>groupId van uw project waaraan je wil linken</groupId>
            <artifactId>artifactID van uw project waar je wil aan linken</artifactId>
            <version>kies versie maar zelf</version>
        </dependency>
    </dependencies>