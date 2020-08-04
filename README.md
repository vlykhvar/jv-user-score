# jv-user-score

In this task you have `UserStorage` class with `getUserScore()` method.
Method receives two parameters: arrays of strings `records` and single string element
`email`. `records` represent database of users, each user has two parameters - 
email and score stored as single string, so record looks like this : "someEmail@gmail.com:userScore". 
`userScore` is in integer format and has value in range `0` - `Integer.MAX_VALUE`;
You task here is to find out if records contains user with certain email that you 
receive, if user exists return his score in int format, if not, throw exception 
`UserNotFoundException` with message "User with given email doesn't exist"
(since it's our custom logic let's create our own, unchecked, exception).
 
 
 First case example:
 ```java
 Input example:
records = {"testEmail@gmail.com:100"};
email = testEmail@gmail.com;
```

 ```java
 Output example:
100;
```

Second case example:
 ```java
 Input example:
records = {"testEmail@gmail.com:100"};
email = invalidEmail@gmail.com;
```

 ```java
 Output example:
UserNotFoundException: User with given email doesn't exist
```


