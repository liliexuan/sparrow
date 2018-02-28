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

package com.sparrow.orm.query;

import java.util.List;

/**
 * @author harry
 */
public class SearchCriteria extends WhereCriteria {

    private String fields;

    private Boolean distinct;

    /**
     * 分组字段
     */
    private List<String> groupField;

    public List<String> getGroupField() {
        return groupField;
    }

    public void setGroupField(List<String> groupField) {
        this.groupField = groupField;
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public Boolean getDistinct() {
        if (distinct == null) {
            this.distinct = false;
        }
        return distinct;
    }

    public void setDistinct(Boolean distinct) {
        this.distinct = distinct;
    }
}
