from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.wait import WebDriverWait

with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net/selenium/ajax")
    print("The page title is: ", driver.title)
    mywait = WebDriverWait(driver, 20)
    driver.find_element(By.CLASS_NAME, "violet").click()
    ele1 = mywait.until(EC.presence_of_element_located((By.XPATH, "//div[@id='ajax-content']/h1")))
    print(ele1.text)
    mywait.until(EC.text_to_be_present_in_element((By.XPATH, "//div[@id='ajax-content']/h3"), "I'm late!"))
    ele2 = driver.find_element(By.XPATH, "//div[@id='ajax-content']/h3")
    print(ele2.text)

    driver.quit()


