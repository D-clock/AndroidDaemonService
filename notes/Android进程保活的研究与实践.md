# Android 进程保活的研究与实践


isForeground=true 标记着这个进程为前台进程。

看看 ServiceRecord 里面的代码，是如何让微信的代码实现那两种bug的方式的

oom_adj的值为判断依据是从哪里来的？作用的出处在哪？？？Google文档自己有说吗？




很多app靠着系统格式各样的广播来唤醒自己，Android N 收回了很多权限，撂倒了一大批厂商。

LBE是如何分析唤醒路径的。

push进程如何实现代码唤醒UI进程？

引发延伸，Android N 取消了网络广播 和 继续坚持 Doze Mode，需要做适配.

相关资料：

http://zhoujianghua.com/2015/07/28/black_technology_in_alipay/

http://mp.weixin.qq.com/s?__biz=MzA3ODg4MDk0Ng==&mid=403254393&idx=1&sn=8dc0e3a03031177777b5a5876cb210cc&scene=1&srcid=0402fANUWIotbVLECw4Ytz4K#wechat_redirect