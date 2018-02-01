#!/bin/bash
set -e # 出错结束
set -x # 输出执行内容

# 使脚本具有执行权限(提示：Tab补全)
# chmod +x ./${NAME}.sh

# 替换行文本
# sed -i "s#^旧文本行#新文本行#g" 文件路径

# 替换行
# sed -i "行号c 新文本" 文件路径

# 条件
# if [ -a 文件]
# then
#   rm -f 文件
# fi

# 循环
# for i in 1 2 3 4 5 6
# do
# done

# 查看特定进程
# ps -ef | grep ${NAME}

# 开机启动文件 /etc/rc.d/rc.local