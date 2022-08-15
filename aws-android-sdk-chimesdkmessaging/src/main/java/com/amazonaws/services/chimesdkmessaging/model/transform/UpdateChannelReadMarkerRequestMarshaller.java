/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkmessaging.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import android.text.TextUtils;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.chimesdkmessaging.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

import android.net.Uri;

/**
 * JSON request marshaller for UpdateChannelReadMarkerRequest
 */
public class UpdateChannelReadMarkerRequestMarshaller implements
        Marshaller<Request<UpdateChannelReadMarkerRequest>, UpdateChannelReadMarkerRequest> {

    public Request<UpdateChannelReadMarkerRequest> marshall(
            UpdateChannelReadMarkerRequest updateChannelReadMarkerRequest) {
        if (updateChannelReadMarkerRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateChannelReadMarkerRequest)");
        }

        Request<UpdateChannelReadMarkerRequest> request = new DefaultRequest<UpdateChannelReadMarkerRequest>(
                updateChannelReadMarkerRequest, "AmazonChimeSDKMessaging");
        request.setHttpMethod(HttpMethodName.PUT);

        if (updateChannelReadMarkerRequest.getChimeBearer() != null) {
            request.addHeader("x-amz-chime-bearer",
                    StringUtils.fromString(updateChannelReadMarkerRequest.getChimeBearer()));
        }
        String uriResourcePath = "/channels/{channelArn}/readMarker";
        uriResourcePath = uriResourcePath.replace(
                "{channelArn}",
                (updateChannelReadMarkerRequest.getChannelArn() == null) ? "" : StringUtils
                        .fromString(updateChannelReadMarkerRequest.getChannelArn()));
        request.setResourcePath(uriResourcePath);
        String encodedUriResourcePath = "/channels/{channelArn}/readMarker";
        encodedUriResourcePath = encodedUriResourcePath.replace(
                "{channelArn}",
                (updateChannelReadMarkerRequest.getChannelArn() == null) ? "" : Uri
                        .encode(StringUtils.fromString(updateChannelReadMarkerRequest
                                .getChannelArn())));
        request.setEncodedResourcePath(encodedUriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateChannelReadMarkerRequest.getSubChannelId() != null) {
                String subChannelId = updateChannelReadMarkerRequest.getSubChannelId();
                jsonWriter.name("SubChannelId");
                jsonWriter.value(subChannelId);
            }

            jsonWriter.endObject();
            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
