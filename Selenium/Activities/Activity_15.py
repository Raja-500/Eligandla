from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.wait import WebDriverWait

with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net/selenium/dynamic-attributes")
    print("The page title is: ", driver.title)
    driver.maximize_window()
    mywait = WebDriverWait(driver, 10)
    driver.find_element(By.XPATH, "//input[@placeholder='Username']").send_keys("admin")
    driver.find_element(By.XPATH, "//input[@placeholder='Password']").send_keys("password")
    driver.find_element(By.XPATH, "//button[@onclick='signIn()']").click()
    mywait.until(EC.text_to_be_present_in_element((By.XPATH, "//div[@id='action-confirmation']"), "Welcome Back, admin"))
    print(driver.find_element(By.XPATH, "//div[@id='action-confirmation']").text)
    driver.quit()