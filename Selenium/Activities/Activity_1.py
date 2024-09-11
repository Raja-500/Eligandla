from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net")
    driver.find_element(By.ID,"about-link").click()
    print(f"Print of title is {driver.title}")
    driver.quit()