# Payment-System-Automated-Test-Cases-
These automated test cases written for a payment system using Selenium WebDriver, to cover both successful and failed payment scenarios.
## Requirements:
- Selenium WebDriver is installed and configured.
- Webdriver Manager is installed and configured.
- TestNG is installed and configured.
- Payment system application is deployed and accessible on web browser (e.g Chrome).

## Test Cases:
- Successful Payment:
  - User logs in with valid credentials.
  - User adds items to the cart.
  - User proceeds to checkout and enters valid payment information.
  - User confirms payment.
  - Verify successful payment confirmation message.
  - Verify order details reflect the purchase.

- Failed Payment:
  - User logs in with valid credentials.
  - User adds items to the cart.
  - User proceeds to checkout and enters invalid credit card number.
  - User confirms payment.
  - Verify appropriate error message for invalid card number.
  - Verify order is not placed.

# Exploratory-Testing-Approach-for-a-Mobile-Application
This describes an exploratory testing strategy for a mobile app. Exploratory testing entails actively examining the application to uncover potential defects without a set script.
## Preparation:
1. Gather information by understanding the application's purpose, features, target audience, and any available documentation.
2. Set goals to define the overall testing aims (e.g., identify critical bugs, explore usability issues).
3. Prioritize by focusing on core functionalities and user flows first.

## Testing Process:
1. Install and Launch the application on a mobile device.
2. Explore navigation through different screens and menus, documenting any inconsistencies or missing features.
3. Test basic functionality and try out core features, verifying expected behavior under various conditions.
4. Think like a user by considering common user scenarios, testing the application's usability and intuitiveness.
5. Break the expected behavior to explore potential edge cases or unexpected behavior.
6. Record observations by documenting any bugs, usability issues, or other findings with screenshots or screen recordings.

## Reporting:
1. Create a clear and concise report summarizing findings.
2. Include specific details of bugs encountered, steps to reproduce, and screenshots.
3. Prioritize critical bugs impacting functionality or usability.
