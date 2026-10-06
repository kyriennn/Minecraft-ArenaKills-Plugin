# Minecraft Arena Plugin
### This is my second personal project, implementing a Minecraft plugin that keeps track of kills, K/D ratio and other stats in a duel system.

### the idea is to build on my previous project in which i learned about using OOP to create a simple Pong game, and deepen that skill with combining it with Next.js, something i am not familiar using, to generate a web page that tracks these stats.

## Skills Learning
- ### Further Deepening Java OOP
- ### Next.js usage
- ### New IDE (Intellij IDEA)
- ### Minecraft Plugin Wizard
- ### Introduction to builders (gradle)
- ### Learning how to compartmentalise the problem/project into small parts, and build it in stages rather than be overwhelmed by doing everything at once

## Outline
### 1) First thing that comes to mind is the Players, Arena and PlayerStats. I plan to start with one first, so I'll do Player first. I think it is a class by itself, and has name, UUID, and its own stats, which probably means PlayerStats is an interface implemented by Player.

What I didn’t know was that before starting on any of the classes, I needed to make sure this project could be run as a plugin in Minecraft, which was what gradle was going to help me with.

I learnt that gradlew build ran the gradle wrapper in my plugin folder, installing the appropriate gradle version and subsequently identifying what version of java and what api I needed from the build.gradle.kts file.

Next, it downloaded the Paper API from its repository, so now I’m actually allowed to use the superclasses I extended my classes from, JavaPlugin and PlayerJoinEvent. I didn’t know this was part of the Paper API, assuming it was only a standard library that I could just import or use implicitly.

It also packaged my project into a .jar file, something I used to see a lot when I was manually installing mods in my Minecraft mods folders.

## plugin.yml

I learnt more about what this actually is: the ID card for my plugin that the server will read. It has python-like syntax and this is where I put in all the details about my plugins, as well as the custom commands that players in the server with the plugin can use, like /duel which will be implemented later on.


## additional point
Im using Claude to help me with finding the instructions and how-tos of the project, like using gradle, the Paper API etc. I will learn to search the internet in the future to find guides quick for my next project.
