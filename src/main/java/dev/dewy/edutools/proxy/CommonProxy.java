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

package dev.dewy.edutools.proxy;

import dev.dewy.edutools.config.EduToolsConfig;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

@Mod.EventBusSubscriber
public class CommonProxy
{
    public static Configuration configuration;

    public void onPreInit(FMLPreInitializationEvent event)
    {
        File dir = event.getModConfigurationDirectory();
        configuration = new Configuration(new File(dir.getPath(), "edutools.cfg"));

        EduToolsConfig.readConfig();
    }

    public void onInit(FMLInitializationEvent event)
    {

    }

    public void onPostInit(FMLPostInitializationEvent event)
    {
        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }
}
