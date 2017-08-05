CS542 Design Patterns
Fall 2016
ASSIGNMENT <ASSIGNMENT 2> README FILE

Due Date: <ASSIGNMENT DUE DATE,  Friday, September 30, 2016>
Submission Date: <DATE SUBMITED, Friday, September 30, 2016>
Author(s): <SAGAR KALE> 
e-mail(s): <skale4@binghamton.edu> 

FILES:-
Driver.java
FileDisplayInterface.java
Results.java
StdoutDisplayInterface.java
CreateWorkers.java
WorkerThread.java
Course.java
CourseAllocation.java
FileProcessor.java
Logger.java
ObjectPool.java
Student.java
StudentAlloc.java

SAMPLE OUTPUT:-
remote06:~/dp/a2/v1/sagar_kale/registrationScheduler> ant -buildfile src/build.xml run -Darg0=data2.txt -Darg1=output.txt -Darg2=3 -Darg3=3
Buildfile: /import/linux/home/skale4/dp/a2/v1/sagar_kale/registrationScheduler/src/build.xml

jar:

run:
     [java] Run method of Thread is called.
     [java] Run method of Thread is called.
     [java] Run method of Thread is called.

BUILD SUCCESSFUL
Total time: 1 second
remote06:~/dp/a2/v1/sagar_kale/registrationScheduler> ant -buildfile src/build.xml run -Darg0=data2.txt -Darg1=output.txt -Darg2=3 -Darg3=4
Buildfile: /import/linux/home/skale4/dp/a2/v1/sagar_kale/registrationScheduler/src/build.xml

jar:

run:
     [java] Constructor of Logger class is called.
     [java] Constructor of FileProcessor class is called.
     [java] Constructor of Results class is called.
     [java] Constructor of CreateWorkers class is called.
     [java] Constructor of WorkerThread class is called.
     [java] Constructor of WorkerThread class is called.
     [java] Constructor of WorkerThread class is called.
     [java] Constructor of CourseAllocation class is called.
     [java] Constructor of CourseAllocation class is called.
     [java] Constructor of CourseAllocation class is called.

BUILD SUCCESSFUL
Total time: 1 second
remote06:~/dp/a2/v1/sagar_kale/registrationScheduler> ant -buildfile src/build.xml run -Darg0=data2.txt -Darg1=output.txt -Darg2=3 -Darg3=1
Buildfile: /import/linux/home/skale4/dp/a2/v1/sagar_kale/registrationScheduler/src/build.xml

jar:

run:
     [java] Student_1 CourseA CourseB CourseC CourseD CourseE 15
     [java] Student_2 CourseA CourseB CourseC CourseD CourseE 15
     [java] Student_3 CourseA CourseC CourseD CourseE CourseF 19
     [java] Student_4 CourseA CourseC CourseD CourseE CourseF 19
     [java] Student_5 CourseA CourseB CourseC CourseD CourseE 15
     [java] Student_6 CourseA CourseC CourseD CourseE CourseF 19
     [java] Student_7 CourseA CourseB CourseC CourseD CourseE 15
     [java] Student_8 CourseA CourseC CourseD CourseE CourseF 19
     [java] Student_9 CourseA CourseB CourseC CourseD CourseE 15
     [java] Student_10 CourseA CourseC CourseD CourseE CourseF 19
     [java] Student_11 CourseA CourseD CourseE CourseF CourseG 23
     [java] Student_12 CourseA CourseD CourseE CourseF CourseG 23
     [java] Student_13 CourseA CourseD CourseE CourseF CourseG 23
     [java] Student_14 CourseA CourseD CourseE CourseF CourseG 23
     [java] Student_15 CourseA CourseD CourseE CourseF CourseG 23
     [java] Student_16 CourseB CourseD CourseE CourseF CourseG 24
     [java] Student_17 CourseB CourseD CourseE CourseF CourseG 24
     [java] Student_18 CourseB CourseD CourseE CourseF CourseG 24
     [java] Student_19 CourseB CourseD CourseE CourseF CourseG 24
     [java] Student_20 CourseB CourseD CourseE CourseF CourseG 24
     [java] Student_21 CourseB CourseD CourseE CourseF CourseG 24
     [java] Student_22 CourseB CourseD CourseE CourseF CourseG 24
     [java] Student_23 CourseB CourseD CourseE CourseF CourseG 24
     [java] Student_24 CourseB CourseD CourseE CourseF CourseG 24
     [java] Student_25 CourseB CourseD CourseE CourseF CourseG 24
     [java] Student_26 CourseC CourseD CourseE CourseF CourseG 25
     [java] Student_27 CourseC CourseD CourseE CourseF CourseG 25
     [java] Student_28 CourseC CourseD CourseE CourseF CourseG 25
     [java] Student_29 CourseC CourseD CourseE CourseF CourseG 25
     [java] Student_30 CourseC CourseD CourseE CourseF CourseG 25
     [java] Student_31 CourseC CourseD CourseE CourseF CourseG 25
     [java] Student_32 CourseC CourseD CourseE CourseF CourseG 25
     [java] Student_33 CourseC CourseD CourseE CourseF CourseG 25
     [java] Student_34 CourseC CourseD CourseE CourseF CourseG 25
     [java] Student_35 CourseC CourseD CourseE CourseF CourseG 25
     [java] Student_36 CourseA CourseB CourseC CourseD CourseF 16
     [java] Student_37 CourseA CourseB CourseC CourseD CourseF 16
     [java] Student_38 CourseA CourseB CourseC CourseD CourseF 16
     [java] Student_39 CourseA CourseB CourseC CourseD CourseF 16
     [java] Student_40 CourseA CourseB CourseC CourseD CourseF 16
     [java] Student_41 CourseA CourseB CourseC CourseD CourseF 16
     [java] Student_42 CourseA CourseB CourseC CourseD CourseF 16
     [java] Student_43 CourseA CourseB CourseC CourseD CourseF 16
     [java] Student_44 CourseA CourseB CourseC CourseD CourseF 16
     [java] Student_45 CourseA CourseB CourseC CourseD CourseF 16
     [java] Student_46 CourseA CourseB CourseC CourseD CourseF 16
     [java] Student_47 CourseA CourseB CourseC CourseD CourseF 16
     [java] Student_48 CourseA CourseB CourseC CourseD CourseF 16
     [java] Student_49 CourseA CourseB CourseC CourseD CourseF 16
     [java] Student_50 CourseA CourseB CourseC CourseD CourseF 16
     [java] Student_51 CourseA CourseB CourseC CourseD CourseF 16
     [java] Student_52 CourseA CourseB CourseC CourseD CourseF 16
     [java] Student_53 CourseA CourseB CourseC CourseD CourseF 16
     [java] Student_54 CourseA CourseB CourseC CourseD CourseF 16
     [java] Student_55 CourseA CourseB CourseC CourseD CourseF 16
     [java] Student_56 CourseA CourseB CourseC CourseE CourseF 17
     [java] Student_57 CourseA CourseB CourseC CourseE CourseF 17
     [java] Student_58 CourseA CourseB CourseC CourseE CourseF 17
     [java] Student_59 CourseA CourseB CourseC CourseE CourseF 17
     [java] Student_60 CourseA CourseB CourseC CourseE CourseF 17
     [java] Student_61 CourseA CourseB CourseC CourseE CourseF 17
     [java] Student_62 CourseA CourseB CourseC CourseE CourseF 17
     [java] Student_63 CourseA CourseB CourseC CourseE CourseF 17
     [java] Student_64 CourseA CourseB CourseC CourseE CourseF 17
     [java] Student_65 CourseA CourseB CourseC CourseE CourseF 17
     [java] Student_66 CourseA CourseB CourseC CourseE CourseG 18
     [java] Student_67 CourseA CourseB CourseC CourseE CourseG 18
     [java] Student_68 CourseA CourseB CourseC CourseE CourseG 18
     [java] Student_69 CourseA CourseB CourseC CourseE CourseG 18
     [java] Student_70 CourseA CourseB CourseC CourseE CourseG 18
     [java] Student_71 CourseA CourseB CourseC CourseE CourseG 18
     [java] Student_72 CourseA CourseB CourseC CourseE CourseG 18
     [java] Student_73 CourseA CourseB CourseC CourseE CourseG 18
     [java] Student_74 CourseA CourseB CourseC CourseE CourseG 18
     [java] Student_75 CourseA CourseB CourseC CourseE CourseG 18
     [java] Student_76 CourseA CourseB CourseD CourseE CourseG 19
     [java] Student_77 CourseA CourseB CourseD CourseE CourseG 19
     [java] Student_78 CourseA CourseB CourseD CourseE CourseG 19
     [java] Student_79 CourseA CourseB CourseD CourseE CourseG 19
     [java] Student_80 CourseA CourseB CourseD CourseE CourseG 19
     [java]
     [java]
     [java] Average Preference Score is 19.25

BUILD SUCCESSFUL

TO CLEAN :-
ant -buildfile src/build.xml clean

TO COMPILE :- 
ant -buildfile src/build.xml all

TO RUN :- 
ant -buildfile src/build.xml run -Darg0=input.txt -Darg1=output.txt -Darg2=3 -Darg3=1 

DATA STRUCTURE USED:-
HashMap is used to store the Objects of StudentAlloc class which stores the allocations for each Student. Hashmap is used to store results in key value pair. Hashmap has advantages of maintaining order, Code Readability and storing based on key.