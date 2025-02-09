/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO StreamProcessorSettings
 */
class StreamProcessorSettingsJsonMarshaller {

    public void marshall(StreamProcessorSettings streamProcessorSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (streamProcessorSettings.getFaceSearch() != null) {
            FaceSearchSettings faceSearch = streamProcessorSettings.getFaceSearch();
            jsonWriter.name("FaceSearch");
            FaceSearchSettingsJsonMarshaller.getInstance().marshall(faceSearch, jsonWriter);
        }
        if (streamProcessorSettings.getConnectedHome() != null) {
            ConnectedHomeSettings connectedHome = streamProcessorSettings.getConnectedHome();
            jsonWriter.name("ConnectedHome");
            ConnectedHomeSettingsJsonMarshaller.getInstance().marshall(connectedHome, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static StreamProcessorSettingsJsonMarshaller instance;

    public static StreamProcessorSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StreamProcessorSettingsJsonMarshaller();
        return instance;
    }
}
