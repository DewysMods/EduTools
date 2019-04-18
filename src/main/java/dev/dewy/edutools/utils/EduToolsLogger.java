/*
 * Copyright (C) 2019-Onwards iBuyMountainDew (Dewy)
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package dev.dewy.edutools.utils;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EduToolsLogger
{
    public final String MOD_NAME;
    public final Logger eduToolsLogger;

    private EduToolsLogger(String modName)
    {
        MOD_NAME = modName;
        eduToolsLogger = LogManager.getLogger(MOD_NAME);
    }

    public void log(Level level, String format, Object... msg)
    {
        eduToolsLogger.log(level, String.format(format, msg));
    }

    public void log(Level level, Object msg)
    {
        log(level, "%s", msg);
    }

    public void logInfo(Object msg)
    {
        log(Level.INFO, msg);
    }

    public void logWarn(Object msg)
    {
        log(Level.WARN, msg);
    }

    public void logError(Object msg)
    {
        log(Level.ERROR, msg);
    }

    public void logFatalError(Object msg)
    {
        log(Level.FATAL, msg);
    }

    public void logDebug(Object msg)
    {
        log(Level.DEBUG, msg);
    }

    public void logTrace(Object msg)
    {
        log(Level.TRACE, msg);
    }

    public static EduToolsLogger createEduToolsLogger(String modName)
    {
        return new EduToolsLogger(modName);
    }
}
