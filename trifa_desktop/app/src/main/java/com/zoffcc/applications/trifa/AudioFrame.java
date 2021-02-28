/**
 * [TRIfA], Java part of Tox Reference Implementation for Android
 * Copyright (C) 2020 Zoff <zoff@zoff.cc>
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

import javax.swing.JFrame;

public class AudioFrame extends JFrame
{
    private static final String TAG = "trifa.AudioFrame";

    public static int width = 640;
    public static int height = 200;
    static AudioSelectInBox audio_in_select = null;

    public AudioFrame()
    {
        super("TRIfA - Audio");

        setSize(width / 2, height / 2);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        audio_in_select = new AudioSelectInBox();
        add(audio_in_select);

        this.setVisible(true);
        revalidate();
    }
}
