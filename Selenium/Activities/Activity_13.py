from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net/selenium/tables")
    print("The page title is: ", driver.title)
    rows = driver.find_elements(By.XPATH, "//table[@class='ui celled striped table']/tbody/tr")
    columns = driver.find_elements(By.XPATH, "//table[@class='ui celled striped table']/tbody/tr[1]/td")
    print("Number of row of first table is", len(rows))
    print("Number of column of first table is", len(columns))
    third_row_ele_list = driver.find_elements(By.XPATH, "//table[@class='ui celled striped table']/tbody/tr[3]/td")
    for ele in third_row_ele_list:
        print(ele.text)

    print("Second row second column value is: ", driver.find_element(By.XPATH, "//table[@class='ui celled striped table']/tbody/tr[2]/td[2]").text)
    driver.quit()
