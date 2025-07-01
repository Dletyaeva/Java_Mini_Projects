
# 👾 Lesson 3 – 4 Pillars of OOP

Welcome to **Lesson 3!**  
This week, we shift from *just making code work* to *making code better.*

You’ve already touched on the 4 pillars of Object-Oriented Programming (OOP):
- **Abstraction**
- **Encapsulation**
- **Inheritance**
- **Polymorphism**

Now it’s time to look back at your own code and **refactor** it using those principles more intentionally.

---

## 🧭 What to Do

Everything for this lesson is inside the `Lesson 3/` folder. Your task is to:

1. Review your code from last week's challenges  
2. Pick **one challenge** to refactor and improve  
3. Identify places to apply the OOP pillars  
4. Improve your class structure, method design, and logic  
5. Commit your improved version to your own folder

### 🛠 Possible Improvements:
- Make instance variables `private` and add **getters/setters** (Encapsulation)
- Extract shared functionality into a **superclass** or new helper class (Inheritance)
- Replace redundant logic with **overloaded** or **overridden** methods (Polymorphism)
- Remove hardcoded values and use **constructors** (Abstraction)

> 🧠 You don’t need to rewrite everything — **focus on improving clarity, structure, and reusability**.

---

## 📁 Folder Structure

```
Lesson 3/
├── Challenge/
│   ├── Jackson/
│   └── Tan/
├── Demo/
│   └── Basic_Calculator_Extra/
│       ├── lib/
│       └── src/
│           ├── bin/
│           │   └── extraCalcpack/
│           └── extraCalcpack/
│               ├── Calculator.java
│               ├── Main.java
│               └── Test.java
```

> 📌 Use the `Demo/Basic_Calculator_Extra` as a reference — it contains working examples of all four pillars.

---

## 🛫 Getting Started

Before you start refactoring, **create a new Git branch** where you'll do all your work.

### ✅ Step 1: Create a Branch
Make sure your branch name includes your name and the lesson. <br>
If you're using GitHub Desktop:
- Go to **Current Branch** → **New Branch**
- Name it something like `yourname-lesson3-refactor`

Or from Github Repo main page:
- Click on **Branches** → **New Branch** 
- - Name it something like `yourname-lesson3-refactor` → **Create New Branch** 

> 📌 **Do all your work on this branch** — not `main`.

---

### ✅ Step 2: Work in Your Folder

Inside:
```
Lesson 3/
└── Challenge/
    └── yourName/
        └── Improved_Challenge_Name/
```

> Make your improvements and test often. Keep your commits meaningful (e.g., `Refactored with getter/setter`, `Simplified add method using overloading`, etc.)

>>> Hint: in the `src/` folder make your own "package" (*folder*) if you are going to have multiple .java files (look at the Demo folder structure) - this is to prevent all your working files from falling into the default package and possibly messing with the other person's compilation (more info in the L2_README.MD file in lesson2 folder)

### ✅ Step 3: When You're Done

1. **Commit** all your changes  
2. **Push** your branch to GitHub  
3. Open a **Pull Request** into `main`  
4. Review it (or ask someone to), then **Merge** it when ready

> 🧠 You can keep pushing updates to your branch until your code is clean, tested, and reviewed.

---

## 🧠 Tips for Refactoring

- Look for **repeated logic** — could it be moved into a method?
- Are any methods doing *too much*? Split them up.
- Could two classes share logic via a common superclass?
- Don’t be afraid to delete or rename things for clarity.

---

## 💬 Need Help?

Check out:
- The `Basic_Calculator_Extra` demo  
- Your notes/slides on the 4 pillars (there are linked resources in them!) 
- Ask a teammate or reach out for help!


## 📕Extra Resources:
- 📑[Java Scanner Methods](https://www.w3schools.com/java/java_ref_scanner.asp)