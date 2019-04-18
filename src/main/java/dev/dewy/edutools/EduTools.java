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

package dev.dewy.edutools;

import dev.dewy.edutools.proxy.CommonProxy;
import dev.dewy.edutools.utils.Constants;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
        modid = Constants.MOD_ID,
        name = Constants.MOD_NAME,
        version = Constants.VERSION_DISPLAY,
        acceptedMinecraftVersions = Constants.MC_VERSION,
        dependencies = Constants.DEPENDENCIES,
        useMetadata = Constants.USE_METADATA
)
public class EduTools
{
    @Instance(Constants.MOD_ID)
    public static EduTools instance;

    @SidedProxy(clientSide = Constants.CLIENT_PROXY_PATH, serverSide = Constants.COMMON_PROXY_PATH, modId = Constants.MOD_ID)
    public static CommonProxy proxy;

    @EventHandler
    public void onPreInit(FMLPreInitializationEvent event)
    {
        proxy.onPreInit(event);
    }

    @EventHandler
    public void onInit(FMLInitializationEvent event)
    {
        proxy.onInit(event);
    }

    @EventHandler
    public void onPostInit(FMLPostInitializationEvent event)
    {
        proxy.onPostInit(event);
    }
}
