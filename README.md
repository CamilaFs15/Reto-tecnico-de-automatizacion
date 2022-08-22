# Reto-tecnico-de-automatizacion
The challenge is to create an automation that is responsible for entering the page Utest.com and proceed to click on the registration option and fill out the form to create a new user.

<img src="src/utestPage.png" alt="utestPage" width="400"> 

## Progress
1. Add the corresponding gitignore to the GitHub repository.
2. Create the user's story
3. Apply the Screenplay + Cucumber pattern (see note below)
* The code runs but the test result in pending. I tried to fix it searching for the possible error in github common issues and stackoverflow with no success.
The following error appears:

```
[Test worker] INFO net.thucydides.core.steps.ConsoleLoggingListener - Test Suite Started: uTestcom registration
[Test worker] WARN net.thucydides.core.steps.BaseStepListener - testStarted: Register as a new user/utestcom-registration;register-as-a-new-user
[Test worker] INFO net.thucydides.core.steps.ConsoleLoggingListener - 
 _____ _____ ____ _____   ____ _____  _    ____ _____ _____ ____  
|_   _| ____/ ___|_   _| / ___|_   _|/ \  |  _ \_   _| ____|  _ \ 
  | | |  _| \___ \ | |   \___ \ | | / _ \ | |_) || | |  _| | | | |
  | | | |___ ___) || |    ___) || |/ ___ \|  _ < | | | |___| |_| |
  |_| |_____|____/ |_|   |____/ |_/_/   \_\_| \_\|_| |_____|____/ 
                                                                  

TEST STARTED: Register as a new user
-------------------------------------------------------------------(utestcom-registration;register-as-a-new-user)
[Test worker] WARN net.thucydides.core.steps.BaseStepListener - stepStarted: net.thucydides.core.steps.ExecutedStepDescription@72a85671
[Test worker] INFO net.thucydides.core.steps.ConsoleLoggingListener - TEST PENDING
[Test worker] WARN net.thucydides.core.steps.BaseStepListener - stepStarted: net.thucydides.core.steps.ExecutedStepDescription@305f031
[Test worker] WARN net.thucydides.core.steps.BaseStepListener - stepStarted: net.thucydides.core.steps.ExecutedStepDescription@649725e3
[Test worker] WARN net.thucydides.core.steps.BaseStepListener - testFinished: Register as a new user:Given that Hugo wants to create a new user at uTest, When he selects the Join Today button on the uTest webpage, Then he fills the new user creation form
| strFirstName | strLastName | strEmail | strBirthMonth | intBirthDay | intYear | strLanguage |
| Camila | Forero | cforerosmaria@gmail.com | January | 15 | 1996 | English |
[Test worker] WARN net.thucydides.core.steps.BaseStepListener - TestOutcomes: [Register as a new user:Given that Hugo wants to create a new user at uTest, When he selects the Join Today button on the uTest webpage, Then he fills the new user creation form
| strFirstName | strLastName | strEmail | strBirthMonth | intBirthDay | intYear | strLanguage |
| Camila | Forero | cforerosmaria@gmail.com | January | 15 | 1996 | English |]
[Test worker] WARN net.thucydides.core.steps.BaseStepListener - Final testOutcomes: [Register as a new user:Given that Hugo wants to create a new user at uTest, When he selects the Join Today button on the uTest webpage, Then he fills the new user creation form
| strFirstName | strLastName | strEmail | strBirthMonth | intBirthDay | intYear | strLanguage |
| Camila | Forero | cforerosmaria@gmail.com | January | 15 | 1996 | English |]
[Test worker] INFO net.thucydides.core.steps.ConsoleLoggingListener - 
          __  _____ _____ ____ _____   ____  _____ _   _ ____ ___ _   _  ____ 
 _       / / |_   _| ____/ ___|_   _| |  _ \| ____| \ | |  _ \_ _| \ | |/ ___|
(_)____ / /    | | |  _| \___ \ | |   | |_) |  _| |  \| | | | | ||  \| | |  _ 
 |_____/ /     | | | |___ ___) || |   |  __/| |___| |\  | |_| | || |\  | |_| |
(_)   /_/      |_| |_____|____/ |_|   |_|   |_____|_| \_|____/___|_| \_|\____|
                                                                                

TEST PENDING: Register as a new user

---------------------------------------------------------------------------------
[pool-2-thread-1] INFO net.thucydides.core.requirements.PackageRequirementsTagProvider - Loading requirements from package requirements at: net.thucydides.showcase.cucumber.junit

1 Scenarios (1 undefined)
3 Steps (3 undefined)
0m0,368s


You can implement missing steps with the snippets below:
(***)
```
(***) It seems that it isn't finding the developed methods.

4. Created the model class but wasn't implemented in features.

5. Coudn't start locators due to the previous errors.

### Thanks
Thanks for the opportunity, it was a great learning challenge which I hope to keep learning on.