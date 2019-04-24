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

package dev.dewy.edutools.init;

import dev.dewy.edutools.items.ItemCompoundBase;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ETItems
{
    public static final List<Item> ITEMS = new ArrayList<>();

    // Chemistry -> Compounds
    public static final Item ALUMINIUM_OXIDE = new ItemCompoundBase("aluminium_oxide");
    public static final Item AMMONIA = new ItemCompoundBase("ammonia");
    public static final Item BARIUM_SULFATE = new ItemCompoundBase("barium_sulfate");
    public static final Item BENZENE = new ItemCompoundBase("benzene");
    public static final Item BORON_TRIOXIDE = new ItemCompoundBase("boron_trioxide");
    public static final Item CALCIUM_BROMIDE = new ItemCompoundBase("calcium_bromide");
    public static final Item CRUDE_OIL = new ItemCompoundBase("crude_oil");
    public static final Item GLUE = new ItemCompoundBase("glue");
    public static final Item HYDROGEN_PEROXIDE = new ItemCompoundBase("hydrogen_peroxide");
    public static final Item IRON_SULFIDE = new ItemCompoundBase("iron_sulfide");
    public static final Item LATEX = new ItemCompoundBase("latex");
    public static final Item LITHIUM_HYDRIDE = new ItemCompoundBase("lithium_hydride");
    public static final Item LUMINOL = new ItemCompoundBase("luminol");
    public static final Item LYE = new ItemCompoundBase("lye");
    public static final Item MAGNESIUM_NITRATE = new ItemCompoundBase("magnesium_nitrate");
    public static final Item MAGNESIUM_OXIDE = new ItemCompoundBase("magnesium_oxide");
    public static final Item POLYETHYLENE = new ItemCompoundBase("polyethylene");
    public static final Item POTASSIUM_IODIDE = new ItemCompoundBase("potassium_iodide");
    public static final Item SALT = new ItemCompoundBase("salt");
    public static final Item SOAP = new ItemCompoundBase("soap");
    public static final Item SODIUM_ACETATE = new ItemCompoundBase("sodium_acetate");
    public static final Item SODIUM_FLUORIDE = new ItemCompoundBase("sodium_fluoride");
    public static final Item SODIUM_HYDRIDE = new ItemCompoundBase("sodium_hydride");
    public static final Item SODIUM_HYPOCHLORITE = new ItemCompoundBase("sodium_hypochlorite");
    public static final Item SODIUM_OXIDE = new ItemCompoundBase("sodium_oxide");
    public static final Item SULFATE = new ItemCompoundBase("sulfate");

    // Chemistry -> Compounds -> Chlorides
    public static final Item CALCIUM_CHLORIDE = new ItemCompoundBase("calcium_chloride");
    public static final Item CERIUM_CHLORIDE = new ItemCompoundBase("cerium_chloride");
    public static final Item MERCURIC_CHLORIDE = new ItemCompoundBase("mercuric_chloride");
    public static final Item POTASSIUM_CHLORIDE = new ItemCompoundBase("potassium_chloride");
    public static final Item TUNGSTEN_CHLORIDE = new ItemCompoundBase("tungsten_chloride");

    // Chemistry -> Compounds -> Other
    public static final Item UNKNOWN_COMPOUND = new ItemCompoundBase("unknown_compound");
}
