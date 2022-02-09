<div id="top"></div>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#About-the-Challenge">About The Challenge</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#Run-Tests">Run Tests</a></li>
        <li><a href="#Scenarios">Scenarios</a></li>
        <li><a href="#Challenges">Challenges</a></li>
      </ul>
    </li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## VOIS Challenge 🤖

![image](https://user-images.githubusercontent.com/66737098/153053941-a3c0cccc-bfce-47f7-a477-7acc25ae82ed.png)


### Built With

* [Java version 17](https://https://www.java.com/)
* [Selenium Webdriver](https://www.selenium.dev/)
* [Maven](https://maven.apache.org/)
* [Rest Assured](https://rest-assured.io/)
* [TestNG](https://testng.org/)
* [Allure Reports](https://docs.qameta.io/)
* [WebDriver Manager](https://github.com/bonigarcia/webdrivermanager)

<p align="right">(<a href="#top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started

This is an example of how you may give instructions on setting up your project locally.
To get a local copy up and running follow these simple example steps.

### Prerequisites

This is an example of how to list things you need to use the software and how to install them.

Download and install  ====> [JAVA](https://www.digitalocean.com/community/tutorials/how-to-install-java-with-apt-on-ubuntu-18-04)

Download and install  ====> [MAVEN](https://maven.apache.org/install.html)


1. Clone this repo inside any directory
   ```sh
   git clone https://github.com/Moaz-Adel/vois_challenge.git
   ```
2. Change current directory to be inside the cloned repo
   ```sh
   cd vois_challenge
   ```

### Run-Tests
* After installing Prerequisites, just run the follwoing command inside the directory

   ```sh
   mvn test && allure generate --clean && allure serve
   ```
   
### After testing finishes, a report will be opened automatically like the following

![image](https://user-images.githubusercontent.com/66737098/153090168-10894799-0ba8-41eb-8081-49504141588a.png)

-----------------

### Pages found at:

```
/src/main/java/ui/com/automationpracticesite/pages/
```

### UI Test found at:

```
/src/test/java/ui/tests
```


### API Test found at:

```
/src/test/java/api/tests
```
------------------


## Challenges

### Challenge #1 (UI)
  Placing an order with UI Interaction by following these steps:
  
  1. CreateingSelect “Blouses” Subcategory in “Women” Category a new account user
  2. Selecting “Blouses” Subcategory in “Women” Category
  3. Select resulted product
  4. Follow checkout procedure
  5. Confirm order by selecting bank wire optiob
  6. Validate order was placed from order history page


### Challenge #2 (APIs)
  Test #1:
  GET random userId and print its email address to Console
  Test #2:
  Using userId from Test1, get this user’s associated posts and verify they contains a valid Post IDs (an Integer between 1 and 100)
  Test #3:
  POST new Post with the same UserId
  
  Note:
  Every run will take new userId
  
-------------------
## Notes:

> All interactions are configured refactored to include
> "Explicit Watis" to decrease Flakeness
> The refactored methods are documented for ease of use

> Following Page Object Model Design Pattern
> Following Coding Standards and Best Practices
--------------------------------
   
### Scenarios

Please follow this link for interactive Mind-Map:

   ====>  [MindMap](https://coggle.it/diagram/YgKgtTieqDCciCC_/t/automationpractice)
   
   ![image](https://user-images.githubusercontent.com/66737098/153052818-920b117f-e387-4e91-96ba-6ea4d5a0fb4a.png)
   
### For suggested Tests needs to be automated please follow the following link:

   ====>   [To be Automated](https://www.notion.so/VOIS-Challenge-Scenarios-to-be-automated-11052232069f427b9e8e8c3acf2076fd)



<p align="right">(<a href="#top">back to top</a>)</p>


## 🤖 Thanks and Happy Testing 🐞

