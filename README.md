# jv-user-score

In this task you have UserStorage class with "getUserScore()" method.
Method receives two parameters: arrays of strings "records" and single string element
"email". "records" represents database of users, each user has two parameters - 
 email and score stored as single string, so record looks like this : "someEmail@gmail.com:userScore". 
 UserScore is in integer format and has value in range 0 - Integer.MAX_VALUE;
 You task here is to find out if records contains user with certain email that you 
 receive, if user exists return his score in int format, if not throw exception 
 UserNotFoundException (since it's our custom logic let's create our own exception,
 that we will extend from RuntimeException).
