// GrayServiceHelper.aidl
package com.clock.daemon;

/**
* 与GrayService跨进程交互的Binder类
*
* @author Clock
*/

interface GrayServiceHelper {
    /**
     *
     * @param something
     */
    void say(String something);
}
