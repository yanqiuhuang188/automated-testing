Feature: Admin User Login

  @ui_01_admin_user_login
  Scenario Outline: ui_01_01 An admin user can login the system
    Given an admin user "" as "<User Role>" to login
    And admin user login success
    Then user can see the page content

    Examples: Multiple keywords
      | User Role  |
      | ADMIN_USER |