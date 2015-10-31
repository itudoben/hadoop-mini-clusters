package com.github.sakserv.minicluster.yarn.util;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */public class EnvironmentUtilsTest {

    EnvironmentUtils environmentUtils = new EnvironmentUtils();

    @Test
    public void testPut() throws Exception {
        environmentUtils.put("test", "test");
    }

    @Test
    public void testPutAll() throws Exception {
        Map<String, String> map = new HashMap<>();
        map.put("test", "test");
        environmentUtils.putAll(map);
    }
}