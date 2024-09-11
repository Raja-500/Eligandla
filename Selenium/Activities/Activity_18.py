import time

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select

with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net/selenium/selects")
    print("The page title is: ", driver.title)
    driver.maximize_window()
    drop_ele = driver.find_element(By.XPATH, "//select[@id='multi-select']")
    option = Select(drop_ele)
    option.select_by_visible_text("Javascript")
    option.select_by_index(4)
    option.select_by_index(5)
    option.select_by_index(6)
    option.select_by_value("node")
    option.deselect_by_index(5)
    time.sleep(2)
    driver.quit()