import time
import sys
from selenium import webdriver
from selenium.webdriver.common.keys import Keys

# Assign arguments.
if len(sys.argv) != 3:
    print 'Error. Usage: AutoVRBO_Python.py username password'
    sys.exit()
un = str(sys.argv[1])
pw = str(sys.argv[2])

# Load webpage.
browser = webdriver.Firefox()
browser.get('http://www.vrbo.com/haod')
browser.implicitly_wait(3)

# Login.
username = browser.find_element_by_name("username")
username.send_keys(un)
password = browser.find_element_by_name("password")
password.send_keys(pw)
submit = browser.find_element_by_id("form-submit")
submit.click()

# Refresh calendar.
update = browser.find_element_by_id("republishCalendarButton")
update.click()

# Close app.
browser.close()
browser.quit()
