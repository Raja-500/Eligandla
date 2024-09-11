from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net/selenium/drag-drop")
    print("The page title is: ", driver.title)
    act = webdriver.ActionChains(driver)
    drop_ele = driver.find_element(By.ID, "draggable")
    dropzpne1 = driver.find_element(By.ID, "droppable")
    dropzpne2 = driver.find_element(By.ID, "dropzone2")
    act.drag_and_drop(drop_ele,dropzpne1).perform()
    print(" The Background colour of dropzone 1 is: ", dropzpne1.get_attribute("style"))
    act.drag_and_drop(drop_ele, dropzpne2).perform()
    print(" The Background colour of dropzone 2 is: ", dropzpne2.get_attribute("style"))
    driver.quit()