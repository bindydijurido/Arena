# Tasks:

![alt text](https://raw.githubusercontent.com/bindydijurido/Arena/master/src/test/java/tests/task_description.png)

#

#TC Examples can be find below:

**Test Cases for Search Functionality**

Initial Conditions

1. Note down the valid input details for the search feature.

2. Find out the minimum and maximum range.

3. Find out the depth of the search – document search, word in a document, image search

4. Should document search display the size of the document also? Similarly for image?

5. Any advanced search features like document or image type selection to refine the search are available?

6. General set of input which can be given are: 
a). A-Z, 
b). a-z, 
c). 0-9, 
d). { [ ( ~ ! @ # $ % ^ & * ` | \ : ” ; ’ < > ? , . / * - + ) ] }, 
e). Blank spaces

Work with these inputs when testing the search functionality

1. Special set of data which can be tried as input are

a. 2 blank spaces – These should be trimmed and error message should be displayed

b. Blank spaces followed with special characters or numbers

c. Special set like a* should give the results for all characters starting with a.

d. Enter any sql query like “Select * from hello;” without quotes and with quotes.

e. Search for tags.

f. Search for hyperlinks should be performed.

2. Search for documents. For advanced search feature, search with different valid and invalid types of documents. Document size should also be looked at.

3. Search for images with their sizes, names and types.

4. Any input data entered should return proper error message guiding to enter the correct input.

5. Text in different panels of the page should be searched. For example if left panel of the web page contains menus and hyperlinks. Hyperlinks in that area should be searched properly. If menus are also in scope then they should also appear in the search results.

6. Search response time should be checked.

7. Try pressing “Enter” key instead of clicking “Search” button.

8. Try searching in the page where a part of the page has form with Submit button.

Search results testing

1. Check number of results in each page.

2. Check the count of the search results displayed in the page.

3. Check if the search results are displayed by popularity or most viewed or any other criteria mentioned in the requirements.

4. Proper messages should be displayed when there are no results.

5. Each search result should contain one link and few lines containing the searched keyword. Link should navigate to the page where the keyword exists.

6. Searched keyword should be highlighted in the search results page and also in the page where the keyword exists.

7. Pagination of the search results should be tested.

8. Number of search results display and the count should also be tested.

Test Scenarios for Result Grid

1. Page loading symbol should be displayed when it’s taking more than default time to load the result page

2. Check if all search parameters are used to fetch data shown on result grid

3. Total number of results should be displayed on result grid

4. Search criteria used for searching should be displayed on result grid

5. Result grid values should be sorted by default column.

6. Sorted columns should be displayed with sorting icon

7. Result grids should include all specified columns with correct values

8. Ascending and descending sorting functionality should work for columns supported with data sorting

9. Result grids should be displayed with proper column and row spacing

10. Pagination should be enabled when there are more results than the default result count per page

11. Check for Next, Previous, First and Last page pagination functionality

12. Duplicate records should not be displayed in result grid

13. Check if all columns are visible and horizontal scroll bar is enabled if necessary

14. Check data for dynamic columns (columns whose values are calculated dynamically based on the other column values)

15. For result grids showing reports check ‘Totals’ row and verify total for every column

16. For result grids showing reports check ‘Totals’ row data when pagination is enabled and user navigates to next page

17. Check if proper symbols are used for displaying column values e.g. % symbol should be displayed for percentage calculation

18. Check result grid data if date range is enabled
#

**Test Cases for Sort Functionality**

Purpose

This basic testcase if designed to verify that the result sorting feature works properly.

**Initial Conditions**

Search for some item on tested page and wait for results.

**Steps**

1. Step: Click on SortDropDownMenu and pick "Cena rosnąco"

Expected Results: The results products should sort into Price Ascending order

2. Step: Click on SortDropDownMenu and pick "Cena malejąco"

Expected Results: The results products should sort into Price Descending order

3. Step: Click on SortDropDownMenu and pick "Cena z dostawą rosnąco"

Expected Results: The results products should sort into Price with Delivery Ascending order

4. Step: Click on SortDropDownMenu and pick "Cena z dostawą malejąco"

Expected Results: The results products should sort into Price with Delivery Descending order
