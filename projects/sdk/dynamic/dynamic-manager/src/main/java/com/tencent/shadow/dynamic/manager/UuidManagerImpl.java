package com.tencent.shadow.dynamic.manager;

import c.t.s.core.c.InstalledApk;
import c.t.s.d.h.FailedException;
import c.t.s.d.h.NotFoundException;

public interface UuidManagerImpl {
    InstalledApk getPlugin(String uuid, String partKey) throws NotFoundException, FailedException;

    InstalledApk getPluginLoader(String uuid) throws NotFoundException, FailedException;

    InstalledApk getRuntime(String uuid) throws NotFoundException, FailedException;
}
