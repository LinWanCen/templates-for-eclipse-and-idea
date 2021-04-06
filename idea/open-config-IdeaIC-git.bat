for /f "delims=" %%a in ('dir /ad/b/o-n "%USERPROFILE%\AppData\Roaming\JetBrains\IdeaIC*"') do (
    @start %USERPROFILE%\AppData\Roaming\JetBrains\%%a\settingsRepository\repository
    exit
)
