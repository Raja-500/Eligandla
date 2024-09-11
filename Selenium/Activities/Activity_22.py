from selenium import webdriver
from selenium.webdriver.common.by import By


with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net/selenium/popups")
    print("The page title is: ", driver.title)
    driver.maximize_window()
    msg = driver.find_element(By.XPATH, "//button[@onclick='openModal()']").text
    print("The Signup Page message is: ",msg)
    driver.find_element(By.XPATH, "//button[@onclick='openModal()']").click()
    driver.find_element(By.ID, "username").send_keys("admin")
    driver.find_element(By.ID, "password").send_keys("password")
    driver.find_element(By.XPATH, "//button[@onclick='signIn()']").click()
    print("log in confirmation message is ", driver.find_element(By.ID, "action-confirmation").text)
    driver.quit()
