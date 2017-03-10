/*
 * Copyright 2016 WSO2 Inc. (http://wso2.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.carbon.metrics.jdbc.core.config.model;

import org.wso2.carbon.kernel.annotations.Configuration;
import org.wso2.carbon.kernel.annotations.Element;

import java.util.ArrayList;
import java.util.List;

/**
 * Configuration for Metrics
 */
@Configuration(namespace = "wso2.metrics.jdbc", description = "Carbon Metrics Configuration Parameters " +
        "for JDBC Reporters")
public class MetricsConfig {

    @Element(description = "Data Source Configurations for JDBC Reporters")
    private List<DataSourceConfig> dataSource;

    private ReportingConfig reporting = new ReportingConfig();

    public MetricsConfig() {
        dataSource = new ArrayList<>();
        dataSource.add(new DataSourceConfig());
    }

    public List<DataSourceConfig> getDataSource() {
        return dataSource;
    }

    public void setDataSource(List<DataSourceConfig> dataSource) {
        this.dataSource = dataSource;
    }

    public ReportingConfig getReporting() {
        return reporting;
    }

    public void setReporting(ReportingConfig reporting) {
        this.reporting = reporting;
    }
}
