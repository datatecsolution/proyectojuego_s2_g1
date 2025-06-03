# 🎮 Juego de Aventura (Java + Gradle)

Proyecto colaborativo de programación en Java para desarrollar un **juego de aventura** en consola. Utiliza **Gradle** para la gestión de dependencias y **VS Code** como entorno de desarrollo.

---

## 📦 Requisitos

- Java 17 o superior
- VS Code con extensión [Java Extension Pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
- Git
- (Opcional) GitHub Desktop

---

## 🧱 Estructura del proyecto

```
juego-aventura/
├── .vscode/                # Configuración de VS Code (depuración y tareas)
├── gradle/                 # Archivos del wrapper de Gradle
├── src/                    # Código fuente en Java
│   └── main/java/...
├── build.gradle            # Script de configuración de Gradle
├── settings.gradle         # Nombre del proyecto
├── gradlew                ← Wrapper para Linux/macOS
├── gradlew.bat            ← Wrapper para Windows
└── README.md               # Este archivo
```

---

## ⚙️ Primeros pasos

### 🔁 Clonar el repositorio

```bash
git clone https://github.com/tu-usuario/juego-aventura.git
cd juego-aventura
```

### 📥 Instalar dependencias y compilar

#### En **macOS / Linux**:

```bash
chmod +x gradlew     # Solo la primera vez
./gradlew build
```

#### En **Windows**:

```bash
gradlew.bat build
```

### ▶️ Ejecutar el juego

Desde VS Code:
1. Abre la carpeta del proyecto.
2. Presiona `F5` para ejecutar en modo depuración (ya configurado).
3. O abre la paleta (`Ctrl+Shift+P`) y ejecuta: `Run Task > Compilar con Gradle`.

---

## 🤝 Trabajo colaborativo con Git

### 1. Crear una nueva rama

```bash
git checkout -b nombre-del-integrante
```

### 2. Hacer cambios y guardarlos

```bash
git add .
git commit -m "Agregado personaje jugador"
```

### 3. Subir cambios

```bash
git push origin nombre-del-integrante
```

### 4. Crear un Pull Request desde GitHub

Una vez subidos los cambios, ir a GitHub y crear un Pull Request para revisión.

---

## 🧪 Compilar y limpiar el proyecto

### Compilar

```bash
./gradlew build       # macOS/Linux
gradlew.bat build     # Windows
```

### Limpiar archivos generados

```bash
./gradlew clean       # macOS/Linux
gradlew.bat clean     # Windows
```

---

## 🧠 Buenas prácticas en equipo

- **Una rama por persona o funcionalidad.**
- **Commits pequeños y frecuentes.**
- **Siempre compilar antes de subir.**
- **Describir claramente los Pull Requests.**

---

## 🧩 Créditos

Este proyecto fue creado por un equipo de alumnos con fines educativos para aprender trabajo en equipo y desarrollo de software con herramientas modernas.