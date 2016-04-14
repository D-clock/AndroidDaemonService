# Android 进程保活的研究与实践


isForeground=true 标记着这个进程为前台进程。

oom_adj的值为判断依据是从哪里来的？作用的出处在哪？？？Google文档自己有说吗？
很好的讲解了 Android Low Memory Killer 机制的一篇文章，从源码的角度分析的oom_adj的作用：http://www.cnblogs.com/angeldevil/archive/2013/05/21/3090872.html
杀进程的管理机制 Android Low Memory Killer，涉及到Framework层关键的Java类，ActivityManager.RunningAppProcessInfo、ActivityServiceManager、ProcessList。涉及到的Kernel层的关键类，lowmemorykiller.c、lowmem_shrink.c

看看 ServiceRecord 里面的代码，是如何让微信的代码实现那两种bug的方式的

杀死进程的策略，官方文档是怎么说的：http://developer.android.com/guide/components/processes-and-threads.html


微信怎么实现push进程唤醒worker进程的，代码实现的思路是。。。不可能直接startActivity吧，BroadcastReceiver也不可能把（10s钟限制），那么后台偷偷干活的只有Service了。

有通过Broadcast再唤醒Service的必要么？还是可以直接Service唤醒Service

像我的手机，切断了绝大部分的唤醒路径，所以普通情况下，这些app都是不被唤醒的。打比方：而一旦我打开一个阿里系的产品，如打开了UC，就会伴随唤醒天猫、淘宝之类的app，打开百度地图，也会伴随着相关一些百度系的产品唤醒。

很多app靠着系统格式各样的广播来唤醒自己，Android N 收回了很多权限，是否会撂倒了一大批厂商？

LBE是如何分析唤醒路径的，什么作为依据。

引发延伸，Android N 取消了网络广播 和 继续坚持 Doze Mode，需要做适配.





相关资料：

http://zhoujianghua.com/2015/07/28/black_technology_in_alipay/

http://mp.weixin.qq.com/s?__biz=MzA3ODg4MDk0Ng==&mid=403254393&idx=1&sn=8dc0e3a03031177777b5a5876cb210cc&scene=1&srcid=0402fANUWIotbVLECw4Ytz4K#wechat_redirect