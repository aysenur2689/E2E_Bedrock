@echo off
echo Running tests with Allure reporting...

REM Clean and run tests
call mvn clean test

REM Generate Allure report
call mvn allure:report

REM Serve the report
call mvn allure:serve

if %ERRORLEVEL% NEQ 0 (
    echo Tests failed. Check the console output for details.
    pause
    exit /b %ERRORLEVEL%
)

echo Tests completed successfully. Generating Allure report...

echo Opening Allure report in browser...
set ALLURE_REPORT_PATH=%CD%\target\site\allure-maven-plugin\index.html
if exist "%ALLURE_REPORT_PATH%" (
    start "" "C:\Program Files\Google\Chrome\Application\chrome.exe" "file:///%ALLURE_REPORT_PATH%"
) else (
    echo Allure report file not found at: %ALLURE_REPORT_PATH%
)

pause 