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

package dev.dewy.edutools.items;

import dev.dewy.edutools.init.ETItems;
import net.minecraft.creativetab.CreativeTabs;

public class ItemCompoundBase extends ItemBase
{
    public ItemCompoundBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);

        setCreativeTab(CreativeTabs.MATERIALS);

        ETItems.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        super.registerModels();
    }
}
