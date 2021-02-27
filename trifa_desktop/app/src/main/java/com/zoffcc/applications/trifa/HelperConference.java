/**
 * [TRIfA], Java part of Tox Reference Implementation for Android
 * Copyright (C) 2017 Zoff <zoff@zoff.cc>
 * <p>
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * version 2 as published by the Free Software Foundation.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA  02110-1301, USA.
 */

package com.zoffcc.applications.trifa;

public class HelperConference
{
    private static final String TAG = "trifa.Hlp.Conf";

    static void set_all_conferences_inactive()
    {
        try
        {
            /*
            orma.updateConferenceDB().
                    conference_active(false).
                    tox_conference_number(-1).
                    execute();
             */
            Log.i(TAG, "set_all_conferences_inactive");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Log.i(TAG, "set_all_conferences_inactive:EE:" + e.getMessage());
        }
    }
}
