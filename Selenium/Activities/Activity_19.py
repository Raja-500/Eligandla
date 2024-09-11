import time

from selenium import webdriver
from selenium.webdriver.common.by import By


with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net/selenium/javascript-alerts")
    print("The page title is: ", driver.title)
    driver.maximize_window()
    driver.find_element(By.ID, "confirm").click()
    alert = driver.switch_to.alert
    print(alert.text)
    time.sleep(5)
    alert.accept()


    # for dismiss
    driver.find_element(By.ID, "confirm").click()
    alert = driver.switch_to.alert
    time.sleep(5)
    alert.dismiss()

    driver.quit()
