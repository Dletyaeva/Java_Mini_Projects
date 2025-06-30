# 📦 Java Package Quick Reference

This guide covers the basics of compiling, running, and understanding Java packages

---

## ✅ 1. What Is a Java Package?

A **Java package** is a namespace that organizes a set of related classes and interfaces.

In Java:

- Packages are declared at the top of `.java` files.
- The `package` declaration **must match the folder structure**.
- Unlike C++'s `namespace`, Java requires the folder layout to follow the namespace.

📌 Example:
```java
package myproject.tools;
```

This class must be located at:
```
/src/myproject/tools/YourClass.java
```

---

## 🛠 2. How to Compile a Java Package

### ✅ Basic Compilation Syntax:
```bash
javac -d [output_folder] [source_folder]/[package_path]/*.java
```

### 📌 Example:
Given:
```
src/
└── myproject/
    └── tools/
        └── Main.java  (contains: package myproject.tools;)
```

Compile with:
```bash
javac -d bin src/myproject/tools/*.java
```

This will generate:
```
bin/
└── myproject/
    └── tools/
        └── Main.class
```

---

## ▶️ 3. How to Run a Java Class in a Package

### ✅ Basic Run Syntax:
```bash
java -cp [compiled_root] [package].[ClassName]
```

### 📌 Example:
```bash
java -cp bin myproject.tools.Main
```

💡 Notes:
- `-cp bin` sets the classpath to the root of compiled files.
- You **must** include the full package name (`myproject.tools.Main`), not just `Main`.

---

## 🧩 4. Other Useful Tips

- **You can’t import a class in the default package** from a named package.
- Keep all your `.java` files inside the `src/` folder to avoid confusion.
- Java automatically generates folder structure inside `-d` based on the `package` declaration.
- Don’t put compiled `.class` files inside your `src/` — use a separate `bin/` or `out/` folder.

---

## 📚 Quick Reference Table

| Concept | Java | C++ Equivalent |
|--------|------|----------------|
| `package` | `package my.name;` | `namespace my::name` |
| Folder structure | Must match package | No enforcement |
| Run class | `java -cp bin my.name.Class` | `./a.out` or `main()` |
| Import | `import my.name.Class;` | `#include "Class.h"` |

---

✅ **Recommendation:** Use packages even for small projects to get used to scalable project structure!


---

## 📦 5. What is a *Default Package* (especially in VS Code)?

In Java, a **default package** is any `.java` file that does **not** declare a `package` at the top.

```java
// This is a class in the default package
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!");
    }
}
```

### 🧠 How It Works

- The file lives directly inside `src/` (or any folder that is part of the classpath).
- No package = default package.
- No folder structure is created when compiled — all `.class` files go directly into the output folder.

---

### 💻 In the Context of VS Code

VS Code treats all Java files inside your `src/` folder as part of your project source.

#### ⚙️ When using the default package:
- Files can live directly inside `src/` (e.g., `src/Main.java`)
- VS Code may allow auto-completion and running without requiring packages
- However, **you cannot import a class in the default package from any named package**

---

### ✅ When is it okay to use the default package?

| Situation | Recommendation |
|-----------|----------------|
| One-off scripts or small demos | ✅ Fine to use default package |
| Teaching simple syntax | ✅ Okay for starters |
| Multi-class project | ⚠️ Not recommended |
| Any file to be reused across packages | ❌ Do NOT use default package |

---

### 🧨 Problems with the Default Package

- **Can’t be imported** by files in named packages
- **Breaks down** when project gets larger or needs reuse
- **Not recognized well** by some build tools (Maven, Gradle)
- Can **confuse VS Code** when multiple files from different folders use default package (autocomplete may suggest wrong class)

---

### ✅ Best Practices

- Use default package only for:
  - Very simple or test programs
  - Exploring syntax
- For all real projects (even small ones), **define packages** and use proper folder structure:
  ```
  src/myproject/tools/Main.java
  ```
  With:
  ```java
  package myproject.tools;
  ```

---

