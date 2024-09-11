import time

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select

with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net/selenium/selects")
    print("The page title is: ", driver.title)
    driver.maximize_window()
    drop_ele = driver.find_element(By.XPATH, "//select[@id='single-select']")
    options = Select(drop_ele)
    options.select_by_visible_text("Option 2")
    time.sleep(5)
    options.select_by_index(3)
    time.sleep(5)
    options.select_by_value("4")
    time.sleep(5)
    all_option = options.options
    for opt in all_option:
        print(opt.text)
    driver.quit()
