/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecoverRecycleTablesRequest extends AbstractModel{

    /**
    * 表所在应用实例ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 待恢复表信息
    */
    @SerializedName("SelectedTables")
    @Expose
    private SelectedTableInfo [] SelectedTables;

    /**
     * Get 表所在应用实例ID 
     * @return ApplicationId 表所在应用实例ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 表所在应用实例ID
     * @param ApplicationId 表所在应用实例ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 待恢复表信息 
     * @return SelectedTables 待恢复表信息
     */
    public SelectedTableInfo [] getSelectedTables() {
        return this.SelectedTables;
    }

    /**
     * Set 待恢复表信息
     * @param SelectedTables 待恢复表信息
     */
    public void setSelectedTables(SelectedTableInfo [] SelectedTables) {
        this.SelectedTables = SelectedTables;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamArrayObj(map, prefix + "SelectedTables.", this.SelectedTables);

    }
}

