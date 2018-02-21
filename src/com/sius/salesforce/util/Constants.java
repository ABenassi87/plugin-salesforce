/*
 * Copyright 2014 Mark Borner
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

package com.sius.salesforce.util;

public class Constants {
    public static final String DEFAULT_API_VERSION = "v42.0";
    public static final String DEFAULT_API_VERSION_NUMBER = "42.0";
    public static final String SERVICES_URI = "/services/data/";
    public static final String SOBJECTS_PATH = "/sobjects/";
    public static final String DESCRIBE_PATH = "/describe/";
    public static final String SOBJECTS = "sobjects";
    public static final String QUERY_PATH = "/query/";

    public static final String LIMITS = "/limits/";

    public static final String TOOLING_PATH = "/tooling";
    public static final String TOOLING_BASE_URI = SERVICES_URI + DEFAULT_API_VERSION + TOOLING_PATH;
    public static final String EXECUTE_ANONYMOUS_PATH = TOOLING_BASE_URI + "/executeAnonymous/";

    public static final String SOBJECTS_BASE_PATH = TOOLING_BASE_URI + SOBJECTS_PATH;
    public static final String CODE_COVERAGE_PATH = SOBJECTS_BASE_PATH + "ApexCodeCoverage/";
    public static final String CODE_COVERAGE_AGGREGATE_PATH = SOBJECTS_BASE_PATH + "ApexCodeCoverageAggregate/";

    public static final String GZIP = "gzip";
    public static final String DEFLATE = "deflate";

    public static final String ACCEPT_ENCODING = "Accept-Encoding";
    public static final String ENCODING = "gzip,deflate";

    public static final String AUTHORIZATION = "Authorization";
    public static final String BEARER = "Bearer ";
    public static final String HTTPS = "https";
    public static final int PORT_443 = 443;

}
