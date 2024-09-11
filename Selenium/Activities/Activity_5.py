
from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net/selenium/input-events")
    print("The page title is: ", driver.title)
    act = webdriver.ActionChains(driver)
    ele = driver.find_element(By.ID, "D3Cube")
    ele.click()
    print(driver.find_element(By.CLASS_NAME, "active").text)
    act.double_click(ele).perform()
    print(driver.find_element(By.CLASS_NAME, "active").text)
    act.context_click(ele).perform()
    print(driver.find_element(By.CLASS_NAME, "active").text)
    driver.quit()