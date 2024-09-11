from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.wait import WebDriverWait

with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net/selenium/dynamic-attributes")
    print("The page title is: ", driver.title)
    driver.maximize_window()
    mywait = WebDriverWait(driver, 10)
    driver.find_element(By.CSS_SELECTOR, "input[class$='username']").send_keys("nomad")
    driver.find_element(By.CSS_SELECTOR, "input[class$='password']").send_keys("None")
    driver.find_element(By.XPATH, "//label[text()='Confirm Password']/following::input[1]").send_keys("None")
    driver.find_element(By.XPATH, "//input[@type='email']").send_keys("hariom@ok.com")
    driver.find_element(By.XPATH, "//button[@onclick='signUp()']").click()
    mywait.until(EC.text_to_be_present_in_element((By.XPATH, "//div[@id='action-confirmation']"), "Thank you for registering, nomad"))
    print(driver.find_element(By.XPATH, "//div[@id='action-confirmation']").text)
    driver.quit()