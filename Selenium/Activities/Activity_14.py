from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:
    driver.get("https://v1.training-support.net/selenium/tables")
    print("The page title is: ", driver.title)
    driver.maximize_window()
    rows = driver.find_elements(By.XPATH, "//table[@id='sortableTable']/tbody/tr")
    columns = driver.find_elements(By.XPATH, "//table[@id='sortableTable']/tbody/tr[1]/td")
    print("The number of row in second table is: ", len(rows))
    print("The number of column in second table is: ", len(columns))
    print("The value of second row and second cell is: ",
          driver.find_element(By.XPATH, "//table[@id='sortableTable']/tbody/tr[2]/td[2]").text)
    driver.find_element(By.XPATH, "//table[@id='sortableTable']/thead//th[1]").click()
    print("The value of second row and second cell after sort is: ",
          driver.find_element(By.XPATH, "//table[@id='sortableTable']/tbody/tr[2]/td[2]").text)
    tfooter = driver.find_elements(By.XPATH, "//table[@id='sortableTable']//tfoot//th")
    for foo in tfooter:
        print(foo.text)
    driver.quit()