# TDT4250
To find our model, go to the sp.model -> model. There are the ecore file, the genmodel, and an xmi-file. The generated code, as well as the manually edited, can be found by going to sp.model -> src/TDT4250/sp. Manual changes has been done in util/SpValidator.java and in impl/CourseSlotImpl.java. The changes are referenced in the paragraph about their class.

# Organization
The Organization is the root element in our hierarchy. It contains the different Departments, and in our case it would be NTNU.

# Department
Departments have names and abbreviations (MTDT Computer Science). Programmes belong to a department, and the departments can be responsible for a set of courses.

# StudyPlan
The StudyPlan is a name we have given to a collection of semesters. In references we call them programme if they belong only to a Department, and specialization if they are made with a reference pointing to it from another StudyPlan. It has a code, a name, and a level (Bachelors / Masters). It can own SemesterInstances, which is what would be seen in the tables of the programme websites. 

# SemesterInstance
This is where the main logic is. It contains a Semester, a year, and an intendedWorkLoad. An example of a SemesterInstance would be Autumn 2020, and it contains slots to be filled with courses. Constraints added manually can be found in util/SpValidator.java, and checks whether courses' restrictions on study programme matches the study programme that owns the semester instance, that the programme and course are of valid levels compared to each other, and that all courses are offered in the semester they are added to.

# CourseSlot
A CourseSlot is abstract and can be either electable or obligatory. It has predetermined credits the course must match, and a derived feature called status to say if it is electable or obligatory. 

# ElectablesCourseSlot
Points to a series of courses, two at least. These courses must, per constraint, all match the credits of the courseSlot. (OCL) (This was not fully implemented, we ran out of time.)

# ObligatoryCourseSlot
Points to a single course. It must per constraint, match the credits of the courseSlot. (OCL)

# Course
A course has a code, a name, one or two semesters in which it is offered (spring and/or autumn), credits, level, a field to determine if it is open to all to register for, and if not it har references to StudyPlans that might register.

# CourseCode
String. Made for the purpose that one might eventually add constraints.

# Credits
Float. OCL Constraint to check that credits are not negative or zero.

# Level
EEnum that lets you decide Masters or Bachelor.

# Status
EEnum to derive either electable or obligatory in the abstract courseSlot.

# Semester
EEnum, either spring or autumn.

# How would we extend our model given time
We would add more constraints such as:
- Checks that Credits and CourseCode follow the norm. 

# What needs improvement
Verify OCL for ElectablesCourseSlot. Currently its a placeholder / lambda for showing a collection of credits.



