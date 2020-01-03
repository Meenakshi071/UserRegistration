# UserRegistration 
Have created a standalone application. 
I have given the rest end point using jersey.
As we were not allowed to container so I am testing the app by AppStarter class which is having main method.
Project is following 3-tier architechture.
I have passed the dummy data directly in AppStarter class.

Sample Input and Output:
0 [main] INFO com.email.main.AppStarter  - Registering User1 with following details: Name= Amita ,Password=Singh and EmailId=amita@gmail.com
6 [main] INFO com.email.main.AppStarter  - Registering User1 Response: Email successfully Verified and Registered!

6 [main] INFO com.email.main.AppStarter  - Registering User2 with following details: Name= Sachin ,Password=Gupta and EmailId=sachin@gmail.com
7 [main] INFO com.email.main.AppStarter  - Registering User2 Response: Email successfully Verified and Registered!

7 [main] INFO com.email.main.AppStarter  - Registering User3 with following details: Name= Amita ,Password=Singh and EmailId=amita@gmail.com
7 [main] INFO com.email.main.AppStarter  - Registering User3 Response: Email already exists!

