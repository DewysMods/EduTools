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

public class Constants
{
    public static final String MOD_ID = "edutools";
    public static final String MOD_NAME = "EduTools";

    private static final String VERSION_CAT = "Alpha ";
    private static final int VERSION_MAJ = 1;
    private static final int VERSION_MIN = 0;
    private static final int VERSION_PAT = 0;
    private static final String VERSION_BLD = " Build 0000a";

    public static final String VERSION_BASIC = VERSION_MAJ + "." + VERSION_MIN + "." + VERSION_PAT;
    public static final String VERSION_DISPLAY = VERSION_CAT + VERSION_BASIC;
    public static final String VERSION_TECHNICAL = VERSION_DISPLAY + VERSION_BLD;

    public static final String MC_VERSION = "[1.12.2]";

    private static final String DEPS_FORGE = "required-after:forge@[14.23.1.2555,);";
    public static final String DEPENDENCIES = DEPS_FORGE;

    public static final String COMMON_PROXY_PATH = "dev.dewy.edutools.proxy.CommonProxy";
    public static final String CLIENT_PROXY_PATH = "dev.dewy.edutools.proxy.ClientProxy";

    public static final String CONFIG_CATEGORY_GENERAL = "General";

    public static final boolean USE_METADATA = true;
}
