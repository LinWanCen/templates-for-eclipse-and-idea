# Eclipse 模板使用说明
Windows -> Preferences 打开首选项
1. 输入 "temp"  
   input "temp"
2. 可以看到各种文件的 Templates
3. 使用 import 导入相应文件夹的xml文件  
   click import and select file

## Eclipse 规则
Description说明格式：空格+文件名+空格+描述，以便排序查看

## Eclipse 常用变量说明
${myVal} 任意字符自定义变量名  
${:import(Type1,Type2)} 自动导入，写全名以免冲突导错  

## Markdown 插件
Eclipse打开本文档没有语法高亮可以安装Markdown插件
https://github.com/winterstein/Eclipse-Markdown-Editor-Plugin/releases
1. 解压到eclipse\dropins目录下
2. 并新建eclipse\links目录，创建名字任意，后缀为link的文件
3. 写入类似以下设置：
path=..\dropins\markdown.editor.site-1.2.0-201501260515
4. 如果link无效时eclipse\configration\config.ini修改
org.eclipse.update.reconcile=false为true
