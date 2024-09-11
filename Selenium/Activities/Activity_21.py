from selenium import webdriver
from selenium.webdriver.common.by import By


with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net/selenium/tab-opener")
    print("The page title is: ", driver.title)
    driver.maximize_window()
    parent_handle = driver.current_window_handle
    driver.find_element(By.ID, "launcher").click()
    windowid = driver.window_handles
    for id in windowid:
        if id != parent_handle:
            driver.switch_to.window(id)

    print("The newly opened page title is: ", driver.title)
    child_handle = driver.current_window_handle
    driver.find_element(By.ID, "actionButton").click()
    newwindowid = driver.window_handles
    for id in newwindowid:
        if id != parent_handle and id != child_handle:
            driver.switch_to.window(id)

    print("The newly opened second page title is: ", driver.title)
    driver.quit()