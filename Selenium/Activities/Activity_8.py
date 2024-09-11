import time

from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net/selenium/dynamic-controls")
    print("The page title is: ", driver.title)
    driver.find_element(By.ID, "toggleCheckbox").click()
    driver.find_element(By.ID, "toggleCheckbox").click()
    driver.find_element(By.XPATH, "//input[@class='willDisappear']").click()
    time.sleep(5)
    driver.quit()