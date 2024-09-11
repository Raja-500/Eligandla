from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net/selenium/target-practice")
    print("The Title of WebPage is:", driver.title)
    third_ele = driver.find_element(By.XPATH, "//h3[text()='Third header']")
    print("The text of third element is", third_ele.text)
    element = driver.find_element(By.XPATH, "//h5[@class='ui green header']")
    print("The color of fifth header is ", element.value_of_css_property("color"))
    ele1 = driver.find_element(By.CLASS_NAME, "violet ")
    print("the class name of voilet button is: ", ele1.get_attribute("class"))
    print("the text of grey button is ", driver.find_element(By.CLASS_NAME, "grey").text)
    driver.quit()