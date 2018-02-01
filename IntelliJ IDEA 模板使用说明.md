# IntelliJ IDEA 模板使用说明
文件目录(Dir)：  
Windows: <your_user_home_directory>\.IntelliJ IDEA<version_number>\config\templates 

Linux: ~IntelliJ IDEA<version>/config/templates  

macOS: ~/Library/Preferences/IntelliJ IDEA<version>/templates  



## 编辑（Edit）：
1. 文件(F) -> 设置(T)...  
   Ctrl+Alt+S  

2. 搜索 "temp" -> 选择 编辑器 -> 活动模板  
   input "temp" -> select "Live Templates"

3. 点击"+" -> 选择 Templates Group...  
   Alt + Ins -> select "Templates Group"




## 变量与函数

环绕内容：`$SELECTION$`  
最后位置：`$END$` 



常用设置一：  

Template Text：  

```
$CLASS_NAME$ $VALUE$
```
| Name      | Expression | Default value                      | Skip if defined |
| --------- | ---------- | ---------------------------------- | --------------- |
| classname |            | suggestFirstVariableName("Object") | √               |
| name      |            | variableOfType(CLASS_NAME)         |                 |



常用设置二：  

Template Text：  

```
"$name$", $obj$
```
| Name | Expression | Default value                      | Skip if defined |
| ---- | ---------- | ---------------------------------- | --------------- |
| obj  |            | suggestFirstVariableName("Object") | √               |
| name |            | obj                                |                 |



常用设置三：  

Template Text：  
```
System.out.println("$name$:" + $obj$.get$methond$());
```
| Name   | Expression | Default value                      | Skip if defined |
| ------ | ---------- | ---------------------------------- | --------------- |
| obj    |            | suggestFirstVariableName("Object") | √               |
| method |            | complete()                         |                 |
| name   |            | decapitalize(Name)                 |                 |



常用函数：  
自动弹出提示：complete()  
大写首字母：capitalize(name)  
小写首字母：decapitalize(Name)  



## 相关链接
我的IntelliJ IDEA 教程：  
http://www.jianshu.com/p/aeb3b40d086b  
本项目 GitHub 分享地址：  
https://github.com/Lin-WangCheng/templates-for-eclipse-and-idea  
本项目 Gitee 分享地址：  
https://gitee.com/linwancheng/templates-for-eclipse-and-idea  
官方模板变量说明：  
https://www.jetbrains.com/help/idea/live-template-variables.html  