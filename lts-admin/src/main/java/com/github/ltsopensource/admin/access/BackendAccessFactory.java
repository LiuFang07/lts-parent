package com.github.ltsopensource.admin.access;

import com.github.ltsopensource.admin.access.face.*;
import com.github.ltsopensource.core.cluster.Config;
import com.github.ltsopensource.core.constant.ExtConfig;
import com.github.ltsopensource.core.spi.SPI;

/**
 * @author Robert HG (254963746@qq.com) on 3/9/16.
 */
@SPI(key = ExtConfig.ACCESS_DB, dftValue = "mysql")
public interface BackendAccessFactory {

    BackendJobTrackerMAccess getJobTrackerMAccess(Config config);

    BackendJobClientMAccess getBackendJobClientMAccess(Config config);

    BackendJVMGCAccess getBackendJVMGCAccess(Config config);

    BackendJVMMemoryAccess getBackendJVMMemoryAccess(Config config);

    BackendJVMThreadAccess getBackendJVMThreadAccess(Config config);

    BackendNodeOnOfflineLogAccess getBackendNodeOnOfflineLogAccess(Config config);

    /**
     * 增加账户表
     * @author owen jia at 20190319
     * @param config
     * @return
     */
    BackendAccountAccess getBackendAccountAccess(Config config);

    /**
     * 账户节点权限
     * @author Owen Jia at 20190515
     * @param config
     * @return
     */
    BackendAccountNodeAccess getBackendAccountNodeAccess(Config config);

    BackendTaskTrackerMAccess getBackendTaskTrackerMAccess(Config config);
}
