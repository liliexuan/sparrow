/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sparrow.datasource;

import com.sparrow.constant.magic.SYMBOL;
import com.sparrow.utility.StringUtility;

/**
 * datasource config
 *
 * @author harry
 */
public class DatasourceConfig {

    /**
     * url
     */
    private String url;

    /**
     * user name
     */
    private String username;

    /**
     * password
     */
    private String password;
    /**
     * driver class name
     */
    private String driverClassName;

    /**
     * init pool size
     */
    private int poolSize = 1;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public int getPoolSize() {
        return poolSize;
    }

    public void setPoolSize(int poolSize) {
        this.poolSize = poolSize;
    }

    public String getSchema() {
        if (StringUtility.isNullOrEmpty(url)) {
            return SYMBOL.EMPTY;
        }
        if (url.contains(SYMBOL.QUESTION_MARK)) {
            return url.substring(url.lastIndexOf(SYMBOL.SLASH) + 1, url.indexOf(SYMBOL.QUESTION_MARK));
        }
        return url.substring(url.lastIndexOf(SYMBOL.SLASH));
    }

    @Override
    public String toString() {
        return "DatasourceConfig{" +
            "url='" + url + '\'' +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", driverClassName='" + driverClassName + '\'' +
            ", poolSize=" + poolSize +
            '}';
    }
}
