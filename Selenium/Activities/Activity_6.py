import time

from selenium import webdriver
from selenium.webdriver import Keys


with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net/selenium/input-events")
    print("The page title is: ", driver.title)
    act = webdriver.ActionChains(driver)
    act.key_down(Keys.SHIFT).send_keys("s").key_up(Keys.SHIFT).perform()
    time.sleep(5)
    act.key_down(Keys.CONTROL).send_keys("a").send_keys("c").key_up(Keys.CONTROL).perform()
    driver.quit()