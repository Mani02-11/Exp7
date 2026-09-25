# 📱 Android Lab Experiment 7 – Adaptive UI, ListView, and Navigation

A simple Android application developed using **Android Studio** and **Kotlin** as part of the **Mobile Application Development Lab**. The application demonstrates the use of an **Adaptive UI** with **ListView**, **ImageView**, and **Activities** to create a flexible and responsive user interface that adapts to both portrait and landscape orientations.

---

## 👨‍💻 Author

**Name:** Manikandan P  
**USN:** 25MCAR0186  
**Subject:** Mobile Application Development Lab

---

## 🚀 Features

- Uses an Adaptive UI that adjusts perfectly to Portrait and Landscape modes.
- Displays a list of programming technologies using a custom `ListView`.
- Incorporates dynamic `ImageView` components with responsive tinting.
- Shows detailed information about the selected technology in a secondary Activity.
- Supports smooth Intent-based Navigation with data passing (Extras).
- Built using Kotlin, Android Studio, and modern Material Components XML styling.

---

## 📚 Concept

This experiment focuses on creating user interfaces that scale across different device orientations and sizes while properly managing structured data via Adapters.

- **Adaptive Layouts** – The application uses a split layout (`layout-land/activity_main.xml`) for landscape mode and a vertical layout (`layout/activity_main.xml`) for portrait mode.
- **Custom ListView & ArrayAdapter** – Displays the list of available technologies alongside dynamic icons. 
- **Activity Navigation (Intents)** – Captures the item click on the ListView and seamlessly passes the selected data to a new Detail Activity.

---

## 🧪 Scenario Demonstrated

The application starts by displaying a "Programming Hub" dashboard containing the student's USN and Name, alongside a `ListView` of popular computer science technologies (e.g., Java, Python, Android). 
- If the device is rotated sideways, the UI dynamically re-arranges itself into a two-column view (Adaptive UI).
- When the user selects a technology from the list, a new `DetailActivity` is launched which reads the Intent extras and prominently displays the selected technology's name and icon.

---

## 🛠️ Technologies Used

- Android Studio
- Kotlin
- XML Layouts (Portrait & Landscape variants)
- Android SDK
- ListView & Custom ArrayAdapter
- Explicit Intents
- Edge-to-Edge System Windows UI

---

## 📂 Project Structure

```text
app
├── manifests
│   └── AndroidManifest.xml
├── kotlin+java
│   └── com.project.exp7
│       ├── MainActivity.kt
│       ├── TechnologyAdapter.kt
│       └── DetailActivity.kt
├── res
│   ├── drawable
│   ├── layout
│   │   ├── activity_detail.xml
│   │   ├── activity_main.xml
│   │   └── list_item.xml
│   ├── layout-land
│   │   └── activity_main.xml
│   ├── mipmap
│   └── values
└── Gradle Scripts
```

## ✅ Test Cases

### Test Case 1: Application Launch (Portrait Mode)

**Objective:** Verify that the application launches successfully and displays the list of technologies in portrait mode.

**Expected Result:**
- The application opens without errors.
- The "Programming Hub" title is visible.
- The custom list of technologies is displayed with correct icons.
- **Name (Manikandan P) and USN (25MCAR0186)** are clearly displayed on the main screen.

**Screenshot:** 
<!-- Paste your Portrait Launch Screenshot here -->


---

### Test Case 2: Adaptive UI (Landscape Mode)

**Objective:** Verify that rotating the device triggers the landscape layout successfully.

**Expected Result:**
- The UI reorganizes into a side-by-side view (header info on the left, ListView on the right).
- Content remains readable and appropriately spaced without clipping.
- **Name and USN** are displayed on the left column.

**Screenshot:** 
<!-- Paste your Landscape Screenshot here -->


---

### Test Case 3: Item Selection and Navigation

**Objective:** Verify that selecting a technology from the list successfully opens the Detail Activity and passes the correct data.

**Expected Result:**
- Tapping an item opens the `DetailActivity`.
- The large icon and bold text accurately reflect the exact technology selected from the previous screen.
- A descriptive subtext ("Awesome technology selected!") is shown.

**Screenshot:** 
<!-- Paste your Detail Activity Screenshot here -->


---

## 📖 Learning Outcomes

- Mastered the implementation of **Adaptive UI** using resource qualifiers (`layout-land`).
- Understood how to populate a `ListView` using a custom **ArrayAdapter**.
- Learned how to manage layout weights and scaling elements correctly across orientations.
- Handled UI click events (`setOnItemClickListener`) effectively.
- Mastered transferring primitive data between Android Activities using **Intents** and **Extras**.
- Explored handling modern System Window edges (`fitsSystemWindows`).
