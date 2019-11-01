problem statement 



Your program must well designed, should use appropriate design patterns, appropriate data-structures, appropriate unit tests, and should be efficient, readable, and maintainable.
 I kept on re-re-refactoring the code and kept checking the corner conditions and had enjoyed this test a lot :)

Consider the file input.txt which contains all information about software installed on various servers in a data center:

Server1, Database, MySQL, 5.5
Server2, Database, MySQL, 5.1
Server3, OS, Ubuntu, 10.04
Server1, OS, Ubuntu, 12.04
Server2, OS, Ubuntu, 12.04
Server3, Language, Python, 2.6.3


This file indicates that Server1, has version 5.5 of MySQL installed, and Server2 has version 5.1 installed, and Server3 has version 10.04 of Ubuntu installed. For the purposes of this program, assume that all version numbers are of the form X.Y or X.Y.Z where X, Y, and Z are strings of digits.

Write a Java program that reads this file (input.txt from the current directory), and prints to output.txt (in the current directory) a list of server names that have at least one software installation that is out of date (i.e. is not the latest version). Thus, in this case, the output of your program should be:

Server2
Server3


Because Server 2 contains MySQL 5.1 (which is out of date, because 5.5 is the latest version), and Server 3 contains Ubuntu 10.4) (which is out of date because 12.04 is the latest version).
