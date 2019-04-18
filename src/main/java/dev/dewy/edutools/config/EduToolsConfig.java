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

package dev.dewy.edutools.config;

import dev.dewy.edutools.EduTools;
import dev.dewy.edutools.proxy.CommonProxy;
import dev.dewy.edutools.utils.Constants;
import net.minecraftforge.common.config.Configuration;

public class EduToolsConfig
{
    public static void readConfig()
    {
        EduTools.logger.logInfo("Reading mod config file...");

        Configuration cfg = CommonProxy.configuration;

        try
        {
            cfg.load();

            initGeneralConfig(cfg);
        }
        catch (Exception e)
        {
            EduTools.logger.logError("Oes noes! It looks like there was a problem loading the mod config file! D:");

            e.printStackTrace();
        }
        finally
        {
            if (cfg.hasChanged())
            {
                cfg.save();
            }
        }
    }

    private static void initGeneralConfig(Configuration configuration)
    {
        configuration.addCustomCategoryComment(Constants.CONFIG_CATEGORY_GENERAL, "General EduTools Configuration");
    }
}
