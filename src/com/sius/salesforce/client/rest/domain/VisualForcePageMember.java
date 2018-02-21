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

package com.sius.salesforce.client.rest.domain;

/**
 * A Visualforce page metadata container member
 *
 * Note: the API calls this an ApexPageMember
 *
 * @author mark
 */
public class VisualForcePageMember extends AbstractMetadataMember {

    public VisualForcePageMember(MetadataContainer metadataContainer) {
        super(metadataContainer);
    }

    @Override
    public String getSObjectName() {
        return "ApexPageMember";
    }

}