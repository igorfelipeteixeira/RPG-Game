# 🗡 RPG Game

A simple **RPG game implemented in Java**, where the **Player** and **Enemy** take turns battling each other.  
The game supports **attacks**, **defending**, and **simulating a battle** from start to finish.

## 🏹 Contents
- [Features](#-features)
- [Main Classes](#-main-classes)
- [Requirements](#-requirements)
- [How to Compile and Run](#-how-to-compile-and-run)
- [Possible Improvement Ideas](#-possible-improvement-ideas)
- [Contribution](#-contribution)
- [License](#-license)


## 🚀 Features

- **Turn-based combat:** Players and enemies take turns to attack or defend.
- **Defensive mechanics:** Players or enemies can raise their defenses to reduce damage.
- **Simultaneous combat (optional enhancement):** The game's structure can be updated to resolve actions at the same time instead of in separate turns.
- **Object-Oriented Design:** Built with Java's OOP principles in mind (inheritance, encapsulation, method overriding).

## 🔹 Main Classes

- `Character`: The abstract base class for all game creatures.
- `Player`: Extends `Character`. Allows a human to choose actions manually.
- `Enemy`: Extends `Character`. Performs actions randomly.
- `BattleManager`: Orchestrates the flow of the battle.
- `Main`: Entry point of the game, initializes the game and starts the battle.

## ⚙ Requirements

- Java Development Kit (JDK) 11 or higher.

## 🕹 How to Compile and Run

Assuming your project folder structure is:

```
RPG-Game/
└ src/
└ RPG/
├ Main.java
├ Characters/
└ Game/
```

### Compile

Run this command from the root folder `RPG-Game`:

```bash
javac -sourcepath src -d out src/RPG/Main.java
```

This will compile your project and put the .class files inside the out directory.

## Run
Then run the game with:

```bash
java -cp out RPG.Main
```

Make sure your Main.java file contains the proper package declaration at the top:

```java
package RPG;
```

And that it has a public static void main(String[] args) method that starts the game.

## 📝 Possible Improvement Ideas
- Implement inventory and items (potions, power-ups).

- Provide different character classes (Mage, Warrior, Archer).

- Develop level-up and experience points.

- Handle critical hits or evasion for more depth in combat.

- Introduce magic, special attacks, or skills.

## 🙏 Contribution
Contributions are welcome!
If you'd like to improve this game or add a new feature, please open a pull request or submit an issue.

## 📝 License
This project is licensed under the MIT license.

---
