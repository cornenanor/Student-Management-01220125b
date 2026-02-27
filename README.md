Student Record Management (Java + JavaFX) – IntelliJ Community Edition
This project implements the app described in your screenshot/spec:

Sidebar menu:
Dashboard (shows basic summary)
Students (CRUD + search + filter + sort)
Reports (Top performers, At risk, GPA distribution, Programme summary)
Settings (Export/Import + validation rules)
All data is stored in a project-controlled folder named data.

1) Requirements
JDK 17+
IntelliJ IDEA Community Edition
Internet connection (only for Maven to download JavaFX dependencies once)
2) Open & run in IntelliJ (recommended)
Open this folder in IntelliJ.
IntelliJ will detect Maven – click Load Maven project.
Open the Maven tool window:
View → Tool Windows → Maven
Run:
Plugins → javafx → javafx:run
That will launch the JavaFX app with the correct JavaFX modules.

3) Where data is stored
When you run the app, a folder named data is created in the project root:

data/students.csv (app storage)
data/sample_students_import.csv (import template)
data/export_*.csv (exports)
data/import_error_report_*.csv (import error reports)
4) CSV format
Header is supported (recommended):

StudentID,FullName,Programme,Level,GPA,Email,PhoneNumber,DateAdded,Status

DateAdded should be ISO LocalDateTime, e.g. 2025-01-10T09:30:00
Status should be Active or Inactive
5) Validation rules (UI + Service layer)
Student ID: required, 4–20 chars, letters/digits only, unique
Full name: required, 2–60 chars, no digits
Programme: required
Level: 100/200/300/400/500/600/700
GPA: 0.0–4.0
Email: contains @ and .
Phone: 10–15 digits, digits only
Invalid import rows are skipped and written into an import error report (the app will not crash).

Enjoy!
