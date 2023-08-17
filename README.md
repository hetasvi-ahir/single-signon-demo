# single-signon-demo
Single Sign on Using Google Cloud Platform

Step 1 : Go to Google cloud page .and login using your google account.

Step 2 : Create new project by clicking on new project.

![image](https://github.com/hetasvi/single-signon-demo/assets/111453003/ec9ae45a-e5b1-4441-b690-baf573ba0bc3)

Step 3 : Enter project name.

![image](https://github.com/hetasvi/single-signon-demo/assets/111453003/5e1e0266-ef98-4fd9-9e49-8aeba39e6c5b)

Step 4 :  After successfully creating a project it will show something like below.

![image](https://github.com/hetasvi/single-signon-demo/assets/111453003/dda5e13a-89e9-480b-9eb8-fd6b38a12e2e)

Step 5 : Go to APIs & Services --> Credentials  from the navigation menu.

![image](https://github.com/hetasvi/single-signon-demo/assets/111453003/443a7668-f2c8-4ac0-aa04-db4465ea6aaa)

Step 6 : Click on create credentials and select OAuth Client ID.

![image](https://github.com/hetasvi/single-signon-demo/assets/111453003/e7f45c2f-fd5f-4eb0-ba27-9b3a3a067fa1)

Step 7 :  Enter Type of Application and Enter name of oauth2 client.

![image](https://github.com/hetasvi/single-signon-demo/assets/111453003/efa462eb-88d5-47dd-964d-8317619dd9ae)

Step 8 : Enter Authorized redirect URIs and click on create.

![image](https://github.com/hetasvi/single-signon-demo/assets/111453003/6c3a2abd-7ce4-41c8-820b-4e8f3977dc96)

If you don’t enter the appropriate authorized redirect URIs you won’t be able to access the application.

![image](https://github.com/hetasvi/single-signon-demo/assets/111453003/03cabc8b-2dfc-41f7-a7e6-54bb2bbd0b17)

Step 9 : Save your Oauth2 client and secret for further use.

![image](https://github.com/hetasvi/single-signon-demo/assets/111453003/13e3ff95-60db-47dd-bec7-36cf56f86742)

Step 10 : Now configure oauth2 client in your existing application. 

Step 11 : Add below dependency to your existing application .
```
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-oauth2-client</artifactId>
</dependency>
```

Step 12 : Add Client ID and Secret in application.yml file.

![image](https://github.com/hetasvi/single-signon-demo/assets/111453003/4c7f7205-4fa3-463f-810b-a70a1298827f)

Step 13 : Create Web Security Config file . 

![image](https://github.com/hetasvi/single-signon-demo/assets/111453003/04592f29-5320-4ef7-a5ee-2b27617dfb2f)


Step 14 : Go to localhost:8080 and click on view all products.

![image](https://github.com/hetasvi/single-signon-demo/assets/111453003/6e5a6b37-c5f5-4e81-afae-ea3af885916d)

Step 15 : Click on Login with Google .

![image](https://github.com/hetasvi/single-signon-demo/assets/111453003/2cccadf7-d854-4218-bf0d-373b8871495c)


Step 16 : You will be redirected to google sign in page and “login-system” is the name I gave of my project in google configurations.

![image](https://github.com/hetasvi/single-signon-demo/assets/111453003/0f8558ab-b9d1-45e3-869d-2a0cce4f438b)


Step 17 : After Successfully Login you will see the list of Products and other available actions.
Your name will be showed and Logout option will be available there .

![image](https://github.com/hetasvi/single-signon-demo/assets/111453003/5413d15a-5d9c-451b-adc2-7e49b93ef705)

Also You will be able to see the username in logs also .

![image](https://github.com/hetasvi/single-signon-demo/assets/111453003/a1532f2a-9574-4a74-8e8b-427b5ebc6454)


