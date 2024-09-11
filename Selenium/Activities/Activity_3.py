from selenium import webdriver
from selenium.webdriver.common.by import By
import time

with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net/selenium/login-form")
    print(f"Print of title is {driver.title}")
    driver.find_element(By.XPATH,"//input[@name='Username']").send_keys("admin")
    driver.find_element(By.XPATH,"//input[@id='password']").send_keys("password")
    driver.find_element(By.XPATH,"//button[@class='ui button']").click()
    time.sleep(2)
    driver.quit()