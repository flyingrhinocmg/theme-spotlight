/*
 * Copyright (C) 2014 Klinker Apps, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.klinker.android.theme_spotlight.fragment;

import com.klinker.android.theme_spotlight.AbstractSpotlightTest;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;

public class ThemeFragmentTest extends AbstractSpotlightTest {

    private ThemeFragment fragment;

    @Before
    public void setup() {
        super.setup();
        fragment = ThemeFragment.newInstance("com.klinker.android.evolve_sms");
    }

    @Test
    public void testNewInstance() throws Exception {
        assertNotNull(fragment);
    }

    @Test
    public void testSearchable() {
        assertFalse(fragment.isSearchable());
    }

}