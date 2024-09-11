from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net/selenium/dynamic-controls")
    print("The page title is: ", driver.title)
    print(driver.find_element(By.ID, "input-text").is_enabled())
    driver.find_element(By.ID, "toggleInput").click()
    print(driver.find_element(By.ID, "input-text").is_enabled())
    driver.quit()