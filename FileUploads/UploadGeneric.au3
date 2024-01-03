;wait for 10 seconds to get upload pop up
Local $winId=WinWait("[CLASS:#32770]","",10)
;WinWait("[CLASS:#32770]","",10)

;Set focus on File Upload text field in upload window
;ControlFocus(WinWait("[CLASS:#32770]","",10),"","Edit1")
ControlFocus($winId,"","Edit1")

;Set file Name
;ControlSetText(WinWait("[CLASS:#32770 ]","",10),"","Edit1",""&$CmdLine[1])
ControlSetText($winId,"","Edit1",""&$CmdLine[1])
;""&$CmdLine[1]
;"D:\Acceleration\Workspace\Aug_13_Selenium\FileUploads\SampleFile.txt"

;wait for 2 seconds
Sleep(2000)

;Click on Open Button
;ControlClick(WinWait("[CLASS:#32770]","",10),"","Button1")
ControlClick($winId,"","Button1")