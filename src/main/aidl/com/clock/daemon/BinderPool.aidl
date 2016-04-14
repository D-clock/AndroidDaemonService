// BinderPool.aidl
package com.clock.daemon;

/**
*  Binder连接池
*
* @author Clock
*/

interface BinderPool {
    /**
     * 获取不同操作类型的Binder
     *
     * @param binderCode Binder类型码
     */
    IBinder getBinderHelper(int binderCode);
}
