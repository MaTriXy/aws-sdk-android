/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.geo.model.transform;

import com.amazonaws.services.geo.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO SearchPlaceIndexForTextSummary
 */
class SearchPlaceIndexForTextSummaryJsonUnmarshaller implements
        Unmarshaller<SearchPlaceIndexForTextSummary, JsonUnmarshallerContext> {

    public SearchPlaceIndexForTextSummary unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SearchPlaceIndexForTextSummary searchPlaceIndexForTextSummary = new SearchPlaceIndexForTextSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Text")) {
                searchPlaceIndexForTextSummary.setText(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BiasPosition")) {
                searchPlaceIndexForTextSummary.setBiasPosition(new ListUnmarshaller<Double>(
                        DoubleJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("FilterBBox")) {
                searchPlaceIndexForTextSummary.setFilterBBox(new ListUnmarshaller<Double>(
                        DoubleJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("FilterCountries")) {
                searchPlaceIndexForTextSummary.setFilterCountries(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("MaxResults")) {
                searchPlaceIndexForTextSummary.setMaxResults(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResultBBox")) {
                searchPlaceIndexForTextSummary.setResultBBox(new ListUnmarshaller<Double>(
                        DoubleJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DataSource")) {
                searchPlaceIndexForTextSummary.setDataSource(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Language")) {
                searchPlaceIndexForTextSummary.setLanguage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FilterCategories")) {
                searchPlaceIndexForTextSummary.setFilterCategories(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return searchPlaceIndexForTextSummary;
    }

    private static SearchPlaceIndexForTextSummaryJsonUnmarshaller instance;

    public static SearchPlaceIndexForTextSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SearchPlaceIndexForTextSummaryJsonUnmarshaller();
        return instance;
    }
}
