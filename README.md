# TetrisApp

A classic Tetris game built in Java with Android Studio.  
Includes full MVC-based gameplay logic, custom Canvas rendering, and responsive controls in landscape mode.

---

## 🚀 Description

`TetrisApp` is a simple, beginner-friendly Android implementation of the classic Tetris puzzle game. It demonstrates:

- **Java & Android Studio** development  
- **MVC architecture** for game logic, rendering, and user input  
- **Custom Views** (`Canvas`) for block drawing and animation  
- **Landscape-only** layout optimized for gameplay  

Ideal as a portfolio piece or learning project for mobile game development.

---

## 📱 Features

- **Model:**  
  - `TetrisModel` manages grid state, block spawning, movement, rotation, line clearing, and scoring.  
- **View:**  
  - `TetrisView` & `BlockView` render the game grid and falling blocks using the Canvas API.  
- **Controller:**  
  - `MainActivity` handles user input (touch/keyboard), ties Model and View together.  
- **Landscape Layout:**  
  - Full-screen, orientation-locked gameplay via `activity_main_landscape.xml`.  
- **Game Over Logic:**  
  - Detects top-row overflow and shows game-end state.  

---

## 🛠️ Prerequisites

- Android Studio **Chipmunk** (or newer)  
- Android SDK **Platform 33**  
- Java **8** or later  

---

## 📥 Installation & Run

1. **Clone the repo**  
   ```bash
   git clone https://github.com/<YourUsername>/TetrisApp.git
   cd TetrisApp
   ```
2. Open in Android Studio  
   - Select **Open an existing project**  
   - Choose the project root (where `settings.gradle` is located)  

3. Build & Run  
   - Let Gradle sync  
   - Launch on emulator or physical device  

---
## 📂 Project Structure
```
TetrisApp/
├── settings.gradle
├── build.gradle             # Project-level Gradle config
├── .gitignore
└── app/
    ├── build.gradle         # Module-level Gradle config
    └── src/
        └── main/
            ├── AndroidManifest.xml
            ├── java/com/example/tetris/
            │   ├── BlockView.java
            │   ├── MainActivity.java
            │   ├── Matrix.java
            │   ├── Tetris.java
            │   ├── TetrisModel.java
            │   └── TetrisView.java
            └── res/
                ├── layout/
                │   └── activity_main_landscape.xml
                └── values/
                    ├── strings.xml
                    ├── styles.xml
                    └── colors.xml
```

---

## 🤝 Contributing

1.	Fork this repository
2.	Create your feature branch (git checkout -b feature/MyFeature)
3.	Commit your changes (git commit -m 'Add new feature')
4.	Push to the branch (git push origin feature/MyFeature)
5.	Open a Pull Request

## 📄 License

This project is licensed under the Apache License 2.0.  
See the [LICENSE](https://www.apache.org/licenses/LICENSE-2.0) file for details.
